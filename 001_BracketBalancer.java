package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CodingProblems {
    public static Boolean areBracketsBalanced(ArrayList<String> input) {
        HashMap<String, String> bracketPairs = new HashMap<>();
        bracketPairs.put("(", ")");
        bracketPairs.put("{", "}");
        bracketPairs.put("[", "]");

        ArrayList<String> openBrackets = new ArrayList<>(bracketPairs.keySet());
        ArrayList<String> closeBrackets = new ArrayList<>(bracketPairs.values());

        ArrayList<String> stack = new ArrayList<>();

        for (String bracket : input) {
            if (openBrackets.contains(bracket)) {
                stack.add(bracket);
            } else if (closeBrackets.contains(bracket)) {
                if (stack.isEmpty() || !bracketPairs.get(stack.remove(stack.size() - 1)).equals(bracket)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        input.add("[");
        input.add("{");
        input.add("(");
        input.add(")");
        input.add("}");
        input.add("]");
        input.add("]");

        System.out.println(areBracketsBalanced(input));
    }
}
