package Stack;

public class javaStack {

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.Size());
    }
}

class Stack {

    static int MAX = 10;
    static int[] Stack = new int[MAX];
    static int Size = -1;
    
    public void push(int val){
        if(MAX -1 == Size){
            System.out.println("out of space");
            return;
        }
        Stack[++Size] = val;
    }

    public int pop(){
        int val = 0;
        if (Size == -1) {
            System.out.println("out of space");
            return -1;
        }
        val = Stack[--Size];
        return val;
    }

    public int peek(){
        if (Size == -1 || Size == MAX-1) {
            System.out.println("no value founded");
            return -1;
        }else{
            int val = Stack[Size];
            return val;
        }
    }

    public int Size(){
        int val = Size;
        return val+1;
    }
}