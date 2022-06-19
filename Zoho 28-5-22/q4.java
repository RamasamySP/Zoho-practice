import java.util.*;
class q4 {
    public static void main(String[] args) {
        MaxStack stk = new MaxStack();
        stk.push(5);
        stk.push(1);
        stk.push(5);
        System.out.println(stk.top());
        System.out.println(stk.popMax());
        System.out.println(stk.top());
        System.out.println(stk.peekMax());
        System.out.println(stk.pop());
        System.out.println(stk.top());
    }
}
class MaxStack {
    //Declaring two stack one to store max elements and another one is normal
    private Stack<Integer> st;
    private Stack<Integer> max;

    public MaxStack() {
        st = new Stack<>();
        max = new Stack<>();
    }
    public void push(int i) {
        //push into max stack if i >= max.peek()
        if (st.empty() || i >= max.peek()) {
            max.push(i);
        }
        st.push(i);
    }
    public int pop() {
        //pop from bith stack and return it
        if (st.peek() == peekMax()) {
            max.pop();
        }
        int tem = st.peek();
        st.pop();
        return tem;
    }
    public int top() {
        return st.peek();
    }
    public int peekMax() {
        return max.peek();
    }
    public int popMax() {
        st.pop();
        return max.pop();
    }
}