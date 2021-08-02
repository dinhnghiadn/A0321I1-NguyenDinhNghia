package b10_dsa.thuc_hanh;
import java.util.*;


public class test {
    public static void main(String[] args) {
//        Stack<Integer> stacks = new Stack<>();
//        stacks.push(1);
//        stacks.add(2);
//        stacks.add(4);
//        stacks.push(6);
//        for (Integer i : stacks) {
//            System.out.println(i);
//        }
//        Iterator<Integer> iterator = stacks.iterator();
//        while (iterator.hasNext()){
//            iterator.next();
//            iterator.remove();
//        }
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        Queue<Integer> queues = new LinkedList<>();
//        queues.offer(2);
//        queues.add(3);
//        queues.add(5);
//        queues.add(6);
//        queues.poll();
//        System.out.println(queues);
//        ListIterator<Integer> listIterator = stacks.listIterator();
//        while (listIterator.hasNext()){
//            System.out.println(listIterator.next());
//            System.out.println(listIterator.nextIndex());
//        }
        Queue<Integer> integers = new PriorityQueue<>();
        integers.add(5);
        System.out.println(integers);
        integers.add(1);
        System.out.println(integers);
        integers.add(2);
        System.out.println(integers);
        integers.add(4);
        System.out.println(integers);







    }
}
