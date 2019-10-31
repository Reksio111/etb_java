package week_4;

public class variableTypes{
	
	static int classVariable1=3;
	static int classVariable2=5;
	
	public static void main(String args[]) {
		
		int c=8;
		int e=10;
		int f=12;
		int classVariableAdd,h,i;
		
		classVariableAdd = classVariable1 + classVariable2;
		h=c*e*f;
		i=h/classVariableAdd;
		
		System.out.print(h + "\n");
		System.out.print(i);
		
		
	}
}