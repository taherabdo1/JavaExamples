package interviewPracticing;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SetOfStacks <E>{
	
	/**
	 * implement the set of stacks to act as a single stack
	 */
	
	List<Stack<E>> stacks;
	int capacity;		//capacity of each stack
	int lastStack;
	public SetOfStacks(int capacity) {
		super();
		this.stacks = new ArrayList<>();
		this.capacity = capacity;
		this.lastStack=0;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void push(E element){
		//if the current stack is full
		if(stacks.get(lastStack).size() == capacity){
			lastStack+=1;
			stacks.add(new Stack<E>());
		}
		stacks.get(lastStack).push(element);
	}
	
	public E pop(){
		E element = stacks.get(lastStack).pop();
		//if the last stack became empty after poping
		if(stacks.get(lastStack).size() == 0){
			stacks.remove(lastStack);
			lastStack--;
		}
		return element;
	}
	
	public E peek(){
		E element = stacks.get(lastStack).peek();
		return element;
	}
	
	
	//popAt pops from a specific stack.
	public E popAt(int index){
		E element = stacks.get(index).pop();
		
		return element;
	}
	
}
