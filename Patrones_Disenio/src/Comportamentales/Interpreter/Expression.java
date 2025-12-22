package Comportamentales.Interpreter;

import java.util.Stack;

public interface Expression {
    void interpret(Stack<Integer> stack);
}
