package week_5_halloween;

public class StringExercises {

	public static void main(String[] args) {
		String str="Dublin is captitol of Republic of Ireland.";
		int gaps=0,words=0;
	
		
		//display string length
		System.out.print("Given sentence contains " + str.length() + " letters including gaps\n");
		System.out.println(str+"\n");
		
		//count number of letters and gaps in the string
		for(int i=0; i<str.length()-1;i++) {
		if(str.charAt(i)== ' ')
				gaps++;
			else
				words++;
			}
		System.out.println("Number words in the string is " + words + ". Gaps: " + gaps);
		
		
		//split sentence with words
		String[] array=str.split(" ");
		
		for(String word : array)
			System.out.println(word);
		
		//display particular part of given string
		System.out.println(str.substring(7));
		//display specific range of the string
		System.out.println(str.substring(7, 18)+ ",");
		//contains specific 
		System.out.println(str.contains("du"));
		
		//starts and ends witch
		System.out.println(str.startsWith("Du"));
		System.out.println(str.endsWith("."));
		
		//replace all
		System.out.println(str.replaceAll("of","do"));
		//replace
		System.out.println(str.replace("of", "capitol"));
		
		

	}

}
