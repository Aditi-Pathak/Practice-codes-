package scjp;

import java.util.Comparator;
import java.util.PriorityQueue;

public class UsingPriorityQueue 
{
	static class PQSort implements Comparator<Integer>
	{
		@Override
		public int compare(Integer one, Integer two) {
			return two-one;//inverse sort
		}

	}
	public static void main(String[] args)
	{
		int[] ia ={1,5,3,7,6,9,8};
		PriorityQueue<Integer> pq1= new PriorityQueue<Integer>();

		for(int x:ia)
		{
			pq1.offer(x);// add elements to the priority queue pq1
		}
	
		System.out.println("size "+pq1.size());
		System.out.println("peek "+pq1.peek());// returns the highest priority entry without removing it from the queue
		System.out.println("size "+pq1.size());
		System.out.println("poll "+pq1.poll());// returns the highest priority entry in pq1 and removes the entry from the
		                                      //  queue.
		System.out.println("size "+pq1.size());
		for(int x:ia)
		{
			System.out.print(pq1.poll() + " ");// iterates through pq1 and returns the highest priority entry in pq1 
												//and removes the entry from the queue.
		}
		
		System.out.println("");

		PQSort pqs = new PQSort();
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(10,pqs);// use comparator to create the priority queue

		for(int x:ia)
		{
			pq2.offer(x);// add elements to the priority queue pq2
		}
		System.out.println("size "+pq2.size());
		System.out.println("peek "+pq2.peek());// returns the highest priority entry without removing it from the queue
		System.out.println("size "+pq2.size());
		System.out.println("poll "+pq2.poll());// returns the highest priority entry in pq1 and removes the entry from the
		                                      //  queue.
		System.out.println("size "+pq2.size());
		for(int x:ia)
		{
			System.out.print(pq2.poll() + " ");
		}

	}

}
