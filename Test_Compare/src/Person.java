import java.util.*;

//This code is only for recording the application of common commands
public class Person implements Comparable {
 
	   private int age;
	   private String name;
	   private String gender;  
 
	   Person(String name, String gender, int age) {
		   this.name = name;
		   this.gender = gender;
		   this.age = age;
	   }   

	   public static void main(String[] args) {
 
		     Person john = new Person("Bryen", "Male", 20);
		     Person harry = new Person("Chris", "Male", 25);
		     Person stacy = new Person("Jane", "Male", 21);  
		 
		     //adding to list
		     ArrayList<Person> personList = new ArrayList<Person>();
		     personList.add(john);
		     personList.add(stacy);
		     personList.add(harry);  
		 
		     //sorting list on the basis of age which we have defined in compareTo method
		     Collections.sort(personList);  
		 
		     for(Person p:personList) {
		    	 System.out.println(p.toString());
		     }		    
	   }
	   //當implements 這個Comparable介面的時候,需要實行compareTo()方法
	   public int compareTo(Person o) {
	 
		// TODO Auto-generated method stub
		//比較年齡大小, 預期結果==>Bryen,Jane,Chris
		//當object o比本身object 的年齡還要小時,回傳1
		if(o.age<this.age) {
			return 1;
		}
		//當object o等於本身object 的年齡時,回傳0
		else if(o.age==this.age) {
			return 0;
		}
		//當object o比本身object 的年齡還要大時,回傳-1
		else {
		return -1;}
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	   public String toString() {
	     	return "{name: " + this.name + ", gender: " + this.gender +", age: " + this.age +"}";
	   }
}
