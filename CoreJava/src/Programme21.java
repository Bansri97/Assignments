import java.util.ArrayList;
import java.util.Iterator;

public class Programme21 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10.10);
		al.add("Tops");
		al.add('t');
		al.add(true);
		al.add(null);
		al.add(10);
		System.out.println(al);
		
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}


	}

