package JavaSem4Dom;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Stack;

/**
 * Task1
 */
public class Task1 {
    public static void perev (LinkedList<Integer> ll2) {
        Stack<Integer> sl = new Stack<>();
        for (Integer element : ll2) {
            sl.add(element);
        }
        while(!sl.empty()){
            System.out.println(sl.pop());
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList();
        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
        //LinkedList<Integer> ll2 = new LinkedList();
        perev(ll1);
    }
}