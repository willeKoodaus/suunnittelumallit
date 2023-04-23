import java.util.*;

public class IteratorExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Case a: Two threads with their own iterators
        Runnable taskA = () -> {
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.println("Thread A: " + iterator.next());
            }
        };

        Runnable taskB = () -> {
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.println("Thread B: " + iterator.next());
            }
        };

        Thread threadA = new Thread(taskA);
        Thread threadB = new Thread(taskB);
        threadA.start();
        threadB.start();

        // Wait for threads to finish
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Case b: Two threads sharing the same iterator
        Iterator<Integer> sharedIterator = list.iterator();
        Runnable taskC = () -> {
             {
                while (sharedIterator.hasNext()) {
                    System.out.println("Thread C: " + sharedIterator.next());
                }
            }
        };

        Runnable taskD = () -> {
             {
                while (sharedIterator.hasNext()) {
                    System.out.println("Thread D: " + sharedIterator.next());
                }
            }
        };

        Thread threadC = new Thread(taskC);
        Thread threadD = new Thread(taskD);
        threadC.start();
        threadD.start();

        // Wait for threads to finish
        try {
            threadC.join();
            threadD.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Case c: Modifying the collection during iteration
        try {
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                Integer value = iterator.next();
                System.out.println("Value: " + value);
                if (value == 3) {
                    list.remove(value); // This will throw ConcurrentModificationException
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException caught!");
        }
        
        try {
        	Iterator<Integer> iterator = list.iterator();
            while (true) {
            	
                Integer value = iterator.next(); // Kutsutaan next() vaikka ei ole enää elementtejä
                System.out.println("Arvo: " + value);
            }
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException saatu!");
        }
     // Case 1: Using iterator.remove() to remove elements during iteration
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("Value: " + value);

            if (value % 2 == 0) {
                iterator.remove(); // Remove even numbers
            }
        }

        System.out.println("List after removing even numbers: " + list);
    }
 }


