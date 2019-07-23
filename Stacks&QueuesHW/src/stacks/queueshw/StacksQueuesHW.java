//shubhankar 2016
package stacks.queueshw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StacksQueuesHW {

    public static void main(String[] args) {
        Stack<Integer> testStack = new Stack<Integer>();
        testStack.add(1);testStack.add(2);testStack.add(3);
        
    }
    
    //exercise 4: in progress
    public static boolean isPalidrome(Queue<Integer> queue){
        boolean bool;
        Queue<Integer> helperQ = new LinkedList<Integer>();
        if(queue.size() == 0){
            return true;
        }
        while(!queue.isEmpty()){
            helperQ.add(queue.peek());
            helperQ.add(queue.remove());
        }
        if(helperQ == queue){
            bool = true;
        }
        else{
            bool = false;
        }
        
        return bool;
    }
    
    //exercise 3: done
    public static Stack<Integer> copyStack(Stack<Integer> stack){
        Stack<Integer> copyStack = new Stack<Integer>();
        Queue<Integer> helperQ = new LinkedList<Integer>();
        while(!stack.isEmpty()){
            helperQ.add(stack.peek());
            helperQ.add(stack.pop());
        }
        //reverse the queue:
        while(!helperQ.isEmpty()){
            stack.add(helperQ.remove());
        }
        while(!stack.isEmpty()){
            helperQ.add(stack.pop());
        }
        //add the reversed queue (which is in the right order now) to both 
        //the original and copy        
        while(!helperQ.isEmpty()){
            stack.add(helperQ.remove());
            copyStack.add(helperQ.remove());
        }
        
        return copyStack;
    }
    
    //exercise 2: done
    public static Stack<Integer> stutter(Stack<Integer> stack){
        Stack<Integer> stutterStack = new Stack<Integer>();
        Queue<Integer> helperQ = new LinkedList<Integer>();
        
        while(!stack.isEmpty()){
            helperQ.add(stack.peek());
            helperQ.add(stack.pop());
        }
        while(!helperQ.isEmpty()){
            stutterStack.add(helperQ.remove());
        }
        //now just reverse it one more time again
        //by adding it to the same queue and back into the same stack again:
        while(!stutterStack.isEmpty()){
            helperQ.add(stutterStack.pop());
        }
        while(!helperQ.isEmpty()){
            stutterStack.add(helperQ.remove());
        }
        
        return stutterStack;
    }
    
    //exercise 1: working
    public static Stack<Integer> splitStack(Stack<Integer> stack) {
        Stack<Integer> sortedStack = new Stack<Integer>();
        Queue<Integer> helperQ = new LinkedList<Integer>();

        while (!stack.isEmpty()) {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                if (stack.peek() >= 0) {
                    sortedStack.add(stack.pop());
                }
                else{
                    helperQ.add(stack.pop());
                }
            }
        }
        while(!helperQ.isEmpty()){
            sortedStack.add(helperQ.remove());
        }

        //return the sorted stack as the new stack
        return sortedStack;
    }

}
