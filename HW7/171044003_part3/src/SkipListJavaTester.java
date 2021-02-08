import java.util.concurrent.ConcurrentSkipListSet;

public class SkipListJavaTester {

	public static void main(String[] args) {
		ConcurrentSkipListSet<Integer> skipListJava = new ConcurrentSkipListSet<Integer>();
		
		long beginTime = 0, endTime = 0;
		long beginTimeNano = 0, endTimeNano = 0;

		beginTime = System.currentTimeMillis();
		beginTimeNano = System.nanoTime(); 
		int size = 80000;
		for(int i = 0 ; i < size ; i++) {
			int random = (int)(32000 * Math.random());
			skipListJava.add(random);
		}
		
		endTime = System.currentTimeMillis();
		endTimeNano = System.nanoTime(); 
		System.out.println(size + " element inserted");
		System.out.println("Time taken: " + (endTime - beginTime) +" miliseconds");
		System.out.println("Time taken: " + (endTimeNano - beginTimeNano) +" nanosecond");

	
		beginTime = System.currentTimeMillis();
		beginTimeNano = System.nanoTime(); 
		size = 10;

		for(int i = 0 ; i < size ; i++) {
			int random = (int)(32000 * Math.random());
			skipListJava.add(random);			
		}
			
		endTime = System.currentTimeMillis();
		endTimeNano = System.nanoTime(); 
		System.out.println("\n"+ size + " element inserted");
		System.out.println("Time taken: " + (endTime - beginTime) +" miliseconds");
		System.out.println("Time taken: " + (endTimeNano - beginTimeNano) +" nanosecond\n");

		System.out.println("deleted elements:");
		beginTime = System.currentTimeMillis();
		beginTimeNano = System.nanoTime(); 
		size = 10;
		int counter = 0;
		while(counter < size) {
			int random = (int)(32000 * Math.random());
			if(skipListJava.contains(random)) {
				System.out.println(skipListJava.remove(random));
				counter++;
			}
		}
				
		endTime = System.currentTimeMillis();
		endTimeNano = System.nanoTime(); 
		System.out.println("\n"+ size + " element deleted");
		System.out.println("Time taken: " + (endTime - beginTime) +" miliseconds");
		System.out.println("Time taken: " + (endTimeNano - beginTimeNano) +" nanosecond");

		
		
	}

}
