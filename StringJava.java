package lecture2;

public class StringJava {

	public static void main(String[] args) {
        String str="LearnJava";
         System.out.println("str =" + str);
        
        char charr[]= {'L','e','a','r','n'};
        System.out.println("charr =" + charr[0]);
        
        String str2=new String(charr);
        System.out.println("str2 =" + str2);
        
        System.out.println(str.charAt(5));
        System.out.println(str.length());
        
        char[] array=str2.toCharArray();
        System.out.println(array);

	}

}
