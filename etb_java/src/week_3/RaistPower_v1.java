package week_3;
public class RaistPower_v1
{//open class

   public static void main (String [] args)
   {//open main
     
      double base=3;
      double exponent=4;
      double results=0;
   
      results+= (base*base);
      for(int i=1;i<(exponent);i++)
      {
         results=results*base;
      }
   
      System.out.println("*  "+base+"^" +exponent+"="+results);
           
   }//end main   
}//end class 
