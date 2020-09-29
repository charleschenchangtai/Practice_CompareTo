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
	   //��implements �o��Comparable�������ɭ�,�ݭn���compareTo()��k
	   public int compareTo(Person o) {
	 
		// TODO Auto-generated method stub
		//����~�֤j�p, �w�����G==>Bryen,Jane,Chris
		//��object o�񥻨�object ���~���٭n�p��,�^��1
		if(o.age<this.age) {
			return 1;
		}
		//��object o���󥻨�object ���~�֮�,�^��0
		else if(o.age==this.age) {
			return 0;
		}
		//��object o�񥻨�object ���~���٭n�j��,�^��-1
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
