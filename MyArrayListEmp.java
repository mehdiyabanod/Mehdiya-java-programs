package p1;

		import java.util.ArrayList;
		import java.util.Iterator;
		import java.util.ListIterator;

		class Employee{
			int eid;
			String ename;
			float salary;
		public Employee(int eid, String ename, float salary) {
				super();
				this.eid = eid;
				this.ename = ename;
				this.salary = salary;
			}
		}
		public class MyArrayListEmp{
		public static void main(String[] args) {
			ArrayList<Employee>ob=new ArrayList<>();
			Employee eob1=new Employee(1,"Alaika",354.5f);
			Employee eob2=new Employee(2,"Zain",768.4f);
			Employee eob3=new Employee(3,"Yashfin",453.3f);
			ob.add(eob1);
			ob.add(eob2);
			ob.add(eob3);
			Iterator<Employee> eit=ob.iterator();
			while(eit.hasNext()) {
				Employee e=eit.next();
				System.out.println(e.eid +" "+e.ename+" "+e.salary);
				
			}
		}
		


	}


