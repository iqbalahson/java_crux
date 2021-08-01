package Lac34;

public class Stack {
    private int [ ] data ;
    private  int top;
    public Stack(int capacity){
        this.data = new int [capacity];
        this.top = -1;
    }
    public Stack(){
        this.data = new int [5];
        this.top=-1;
    }
    public boolean IsEmpty(){
        return top==-1;
    }
    public boolean IsFull(){
        return top == this.data.length-1;
    }
    public void push(int data) throws Exception{
            if(IsFull()){
                throw new Exception("Stack is full");
            }
        this.top++;
        this.data[this.top] = data;
    }
    public int pop() throws Exception{
        if (IsEmpty()){
            throw new Exception("Stack is empty"    );
        }
        int item = this.data[this.top];
        this.top--;
        return item ;
    }
    public int peak() throws Exception{
        if (IsEmpty()){
            throw new Exception("Stack is empty")  ;
        }
        int item =this.data[this.top];
        return item ;
    }
    public int size (){
        return top+1;
    }
    public void Display(){
        for (int i = top; i >=0 ; i--) {
            System.out.print(this.data[i] +"-->");
        }
        System.out.println(".");
    }
}
