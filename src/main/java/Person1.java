import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;


public class Person1 {
    public static void main(String[] args) {

        Person p1= new Person("Khushbu","Patel");
        Person p2= new Person("Heena","Shah");
        Person p3= new Person("John","yang");
        Person p4= new Person("Khushbu","Patel");
        Person p5= new Person("John","yang");
        Person p6= new Person("Heena","Shah");
        Person p7= new Person("Khushbu","Patel");
        Person p8= new Person("John","yang");
        Person p9= new Person("Heena","Shah");

        ArrayList<Person> arrayList= new ArrayList<Person>();

        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        arrayList.add(p4);

        System.out.println("Using ArrayList:");
//        for (int i=0; i<arrayList.size();i++)
//        {
//            System.out.println(arrayList.toString());
//        }

        for (Person person: arrayList)
        {
            System.out.println(arrayList.toString());
        }
//        int count=0;
//        while(count<arrayList.size())
//        {
//            System.out.println(arrayList.toString());
//            break;
//        }

        LinkedList<Person> list = new LinkedList<Person>();

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        System.out.println("Using Linked List:");
        for (Person p: list)
        {
            System.out.println(list.toString());
        }

        HashSet<Person> set= new HashSet<Person>();

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        set.add(p6);
        set.add(p7);
        set.add(p8);
        set.add(p9);

        System.out.println("Using HashSet:");
        for (Person pp: set)
        {
            System.out.println(set.toString());
        }

        if (p1.equals(p4))
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }

    }
}
