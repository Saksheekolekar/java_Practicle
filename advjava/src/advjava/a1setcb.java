package advjava;
import java.util.*;
public class a1setcb
{
public static void main(String[] args)
{
LinkedList a1=new LinkedList();
a1.add("10");
a1.add("40");
a1.add("50");
a1.add("80");
a1.add("90");
System.out.println("original list:"+a1);
a1.addFirst(20);
System.out.println("after adding at first position element list:"+a1);
a1.removeLast();
System.out.println("after deleting last position element list:"+a1);
System.out.println("size of list:"+a1.size());
}
}
