import java.util.HashMap;

public class Company {

    public static void main(String[] args) {
        // Create a HashMap object called empList that uses Integer value as the Key and an Employee object as the value
        HashMap<Integer, Employee<?, ?>> empList = new HashMap<>();

        // Create an Employee object with a string value as the empld and add to the empList
        Employee<String, String> employee1 = new Employee<>("EMP12345", "Nishan Perera");
        empList.put(1, employee1);

        // Create another Employee object with integer value as the empld and add to the empList
        Employee<Integer, String> employee2 = new Employee<>(123456, "Krishan Gamage");
        empList.put(2, employee2);

        // Iterate through the empList and print the employee details
        for (Integer id : empList.keySet()) {
            Employee<?, ?> employee = empList.get(id);
            System.out.println("Employee number: " + id + " and the Employee ID is: " + employee.getEmpId());
            System.out.println("Employee name: " + employee.getName());
            System.out.println();
        }
    }
}
