//Stack implementation in java
class Stack{

//Store elements of stack
private int arr[];

//represent top of stack
private int capacity;

//Creating a Stack
Stack (int Size){

  //initialize the array
  //initialize the stack variables
  arr = new int [size];
  capacity = Size;
  top=1;
}

//Push elements to the top of the stack
Public void push (int x){
 if (isFull()){
 System.out.println("STACK OVERFLOW");
 //terminate the program
 System.exit(1);
}

//insert elemensts on top of stack
System.out.println("Interesting" + x);
arr [ ++ top] = x;
}

//pop elements from top of stack
Public int pop(){
//if stack is empty
//no elements to pop
if (isEmpty()){
System.out.println("STACK EMPTY");
//terminates the program
System.exit(1);
}

//return size of the stack
Public int getsize(){
return top+1;
}

//Check if the stack is empty
Public boolean isEmpty(){
  return top == -1;
}

//Check if the stack is full
Public boolean isFull(){
   return top == capacity -1;
}

//Display elements of stack
Public void printStack () {
  for (int i=0; i<=top; i++){
  System.out.print(arr [i]+ ",");
  }
}

Public static void main (String [] args){
  Stack stack = new Stack (5);
  stack.push(1);
  stack.push(2);
  stack.push(3);

  System.out.print("Stack:");

//remove elements from the stack
stack.pop();
System.out.println("\n After popping out");
}
}