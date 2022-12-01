
class Student {

    	String fname;
		String lname;
		int age;
		
		
		public void setFname(String fname) {
			this.fname = fname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
		public String getFname() {
			return fname;
		}
		public String getLname() {
			return lname;
		}
		public int getAge() {
			return age;
		}
		
	}


public class LaunchEncap
{
	public static void main (String args[])
	{
		Student s1=new Student();
		s1.setAge(5);
		System.out.print(s1.getAge());
		
		
	}
}
