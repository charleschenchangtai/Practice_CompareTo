import java.util.*;

//This code is only for recording the application of common commands
public class Person implements Comparable<Person> {
 
	   private int age;
	   private String name;
	   private String gender;  
 
	   Person(String name, String gender, int age) {
		   this.name = name;
		   this.gender = gender;
		   this.age = age;
	   }   

	   public static void main(String[] args) {
 
		     Person Bryen = new Person("Bryen", "Male", 20);
		     Person Chris = new Person("Chris", "Male", 25);
		     Person Jane = new Person("Jane", "Male", 21);  
		 
		     //adding to list
		     ArrayList<Person> personList = new ArrayList<Person>();
		     personList.add(Bryen);
		     personList.add(Chris);
		     personList.add(Jane);  
		 
		     //sorting list on the basis of age which we have defined in compareTo method
		     Collections.sort(personList);  
		 
		     for(Person p:personList) {
		    	 System.out.println(p.toString());
		     }		    
	   }
	   //當implements 這個Comparable介面的時候,需要實行compareTo()方法
	   public int compareTo(Person o) {
		//比較年齡大小, 預期結果==>Bryen,Jane,Chris
		//當本身object 比object o 的年齡還要小時,回傳-1
		   if(this.age<o.age) {
			   return -1;
		   }
 		//當本身object 比object o 的年齡時,回傳0
		   else if(this.age==o.age) {
			   return 0;
		   }
 		//當object o比本身object 的年齡還要大時,回傳 1
		   else {
			   return 1;
		   }
 		}
		    
	@Override
	   public String toString() {
	     	return "{name: " + this.name + ", gender: " + this.gender +", age: " + this.age +"}";
	   }
}
