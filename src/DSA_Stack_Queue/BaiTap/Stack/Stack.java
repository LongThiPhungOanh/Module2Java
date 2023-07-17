package DSA_Stack_Queue.BaiTap.Stack;

import DSA_Stack_Queue.ThucHanh.LinkedList.MyGenericStack;

public class Stack{
    public void showNumber() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        MyGenericStack<Integer> wStack = new MyGenericStack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        final int CHECK = stack.size();
        for (int i = 0; i < CHECK; i++) {
            String value = stack.pop().toString();
            wStack.push(Integer.parseInt(value));
            System.out.println(value);
        }
    }
    public void showString(){
        MyGenericStack<String> mWord  = new MyGenericStack<>();
        String[] check;
        for (int i = 0; i < 5; i++) {
            mWord.push(i + "hihi");
        }
        check = mWord.pop().split("/");
        String[] value = new String[check.length];
        for (int i = 0; i < check.length; i++) {
            value[value.length - 1 - i] = check[i];
    }
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
    }
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.showNumber();
        System.out.println("------------");
        stack1.showString();
    }
}
