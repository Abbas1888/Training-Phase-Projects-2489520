package datastrAL;
import java.util.*;
public class DSQueues {
	public static void main(String[] args) 
	{
	        		Queue<String> locationsQueue = new LinkedList<>();
	locationsQueue.add("Laddu");
	        		locationsQueue.add("Kaaju Katli");
	        		locationsQueue.add("Badhusa");
	        		locationsQueue.add("Gulab Jamun");
	        		locationsQueue.add("Rasa Malai");
	System.out.println("Queue is : " + locationsQueue);
	        		System.out.println("Head of Queue : " + locationsQueue.peek());
	        		locationsQueue.remove();
	        		System.out.println("After removing Head of Queue : " + locationsQueue);
	        		System.out.println("Size of Queue : " + locationsQueue.size());
	    	}
	}


