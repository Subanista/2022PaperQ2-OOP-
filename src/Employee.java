
public class Employee <T,U>{
private T empId;
private U name;

public Employee(T empId, U name) {
	super();
	this.empId = empId;
	this.name = name;
}

public T getEmpId() {
	return empId;
}

public U getName() {
	return name;
}
	

}
