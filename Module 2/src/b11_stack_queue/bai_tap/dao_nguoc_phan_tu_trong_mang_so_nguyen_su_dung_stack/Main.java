package b11_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Stack;

public class Main {
    private static void reverse(Stack<Integer> stack) {
        int size = stack.size();
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[i] = stack.pop();
        }
        for (int i = 0; i < size; i++) {
            stack.push(temp[i]);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        reverse(stack);
        System.out.println("Phan tu o tren cung cua ngan xep la: " +stack.peek());
    }


}
