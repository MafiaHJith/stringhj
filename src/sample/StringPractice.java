package sample;

public class StringPractice {

	public static void main(String[] args) {
		
		int count=0;
		String h0 = "how";
		String h = new String ("hai maga hai how are hai you maga you");
		//char[] h1 = h.toCharArray();
		String [] h2 = h.split(" ");
		/*for(String h3 : h2)
		System.out.print(h3);*/
		//Boolean b = h.matches(h0);
		for(int i=0;i<h2.length;i++)
		{
			Boolean b = h2[i].matches(h0);
			
			if (b == true)
				count++;
		
				//System.out.println(b);
		}
		System.out.println(count);
	}

}
