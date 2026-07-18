package priorityqueue;

public class Employee {
	
	private String ename;
	private Double salary;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", salary=" + salary + "]";
	}
	public Employee(String ename, Double salary) {
		super();
		this.ename = ename;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	
	

}
