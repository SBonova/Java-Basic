package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer>stack = new ArrayDeque<>();

        String expression = scanner.nextLine();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '('){
                stack.push(i);
            }else if (ch == ')'){
                int starIndex = stack.pop();
                String contents = expression.substring(starIndex, i + 1);
                System.out.println(contents);
            }
        }
    }
}
