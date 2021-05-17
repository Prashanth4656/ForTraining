package training;
import java.util.*;
public class Listandsets 
{
	public static void main(String[] args) 
	{
ArrayList list=new ArrayList();
list.add("abcd");
list.add(90);
list.add("true");
System.out.println(list);
list.remove(2);
System.out.println(list);
System.out.println();



LinkedList ref=new LinkedList();
ref.add("asdf");
ref.add(80);
ref.add("lkjh");
ref.add("posi");
ref.add(90909);
System.out.println(ref);
ref.removeFirst();
ref.removeLast();
System.out.println(ref);
System.out.println();



HashSet obj=new HashSet();
obj.add("asdf");
obj.add("shdfluahflasdhfjk");
obj.add(9009);
obj.add("lkjhdgfgsuaj");
obj.add(123);
obj.add("check");
System.out.println(obj);
System.out.println();





TreeSet abc=new TreeSet();
abc.add("aaaaa");
abc.add("bbbb");
abc.add("cccc");
abc.add("909090");
abc.add("zzzzz");
abc.add("oooo");
System.out.println(abc);


	}

}
