package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();

        //add
        list.add(10);
        list.add(20);
        list.add(3);

        //get
        System.out.println(list.get(1));

        //get all
        System.out.println(list);

        //set 
        list.set(1,56);
        System.out.println(list);

        list.remove(2);

        //size
        System.out.println(list.size());

        sc.close();
    }
}
