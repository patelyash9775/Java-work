package lecture6;

public class Studentbasic {
     //attributes
	 String sname;
	 int sid;
	 
	 //Method getdetails
	 public void getdetails()
	 {
		 System.out.println("Student Name = "+sname+"\n"+"Student id="+sid);
	 }
   
	 //Method setdeatils
	 public void setdetails(String name,int id)
	 {
		 sname=name;
		 sid=id;
	 }
	 public static void main(String[] args)
	 {
		 Studentbasic obj1=new Studentbasic();
		 Studentbasic obj2=new Studentbasic();
		 obj1.sname="Yash";
		 obj2.sname="Yash";
		 if(obj1.sname==obj2.sname)
		 {
			 System.out.println("name is same");
		 }
		 else if(obj1==obj2)
		 {
			 System.out.println("object is a same");
		 }
	 }
} 
