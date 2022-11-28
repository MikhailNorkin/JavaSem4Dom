// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package JavaSem4Dom;

import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {

    public static LinkedList<Integer> enqueue(LinkedList<Integer> ll1, int k){
        ll1.add(k);
        return ll1;
    }

    public static LinkedList<Integer> dequeue(LinkedList<Integer> ll2){
        System.out.printf("Первый элемент в очереди равен:" + ll2.getFirst()+"\n");
        ll2.remove(0);
        return ll2;
    }

    public static LinkedList<Integer> first(LinkedList<Integer> ll3){
        System.out.printf("Первый элемент в очереди равен:" + ll3.getFirst()+"\n");
        return ll3;
    }


    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.printf("Выберете какую функцию вы хотите сделать:\n 1 - помещает элемент в конец очереди \n 2 - возвращает первый элемент из очереди и удаляет его \n 3 - возвращает первый элемент из очереди, не удаляя\n");
        Scanner Sc = new Scanner(System.in);
        Integer st = Sc.nextInt(); 

        if (st == 1) {
            System.out.println("Напишите число, которое добавиться в конец очереди");
            Integer ch = Sc.nextInt(); 
            System.out.println(ch);
            System.out.println(enqueue(ll,ch));
        }

        // dequeue() - возвращает первый элемент из очереди и удаляет его
        if (st == 2){
            dequeue(ll);
            System.out.println(ll);    
        }
        //first() - возвращает первый элемент из очереди, не удаляя
        if (st ==3){
            first(ll);
            System.out.println(ll); 
        }

    }
}
