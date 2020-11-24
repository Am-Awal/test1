package com.tcs.employee;

import java.util.Optional;
import java.util.Scanner;

import com.tcs.employee.model.Employee;
import com.tcs.employee.service.EmployeeService;
import com.tcs.employee.service.EmployeeServiceImpl;

public class Main {
	
	public static Scanner scanner = new Scanner(System.in);
	
	//menu driven program from StackOverflow

    public static void main(String[] args) {

        try {
            // Declare variable for user's option and defaulting to 0
            int menuOption = 0;
            do {
                // Setting menuOption equal to return value from showMenu();
                menuOption = showMenu();

                // Switching on the value given from user
                switch (menuOption) {

                case 1:
            		
                	Employee employee = new Employee(2,null,null,"Employee Two",23,"Assistant");
                	//Employee employee = new Employee(id, organization, department, name, age, position)
            		EmployeeService employeeService = new EmployeeServiceImpl();
            		
            		String result = employeeService.addEmployee(employee);

            		if("success".equals(result)) {
            			System.out.println("recored added successfully");
            		}
            		else {
            			System.out.println("problem");
            		}
            		
            		Optional<Employee> optional= employeeService.findById(employee.getId());
            		
            		if(optional.isPresent()) {
            			Employee employee2 = optional.get();
            			System.out.println(employee2);
            		}
            		else {
            			System.out.println("employee is not available");
            		}
                    break;
                case 2:
                    //TODO code for updateEmployee
                    break;
                case 3:
                	//TODO code for deleteEmployee
                    break;
                case 4:
                	//TODO code for findById
                    break;
                case 5:
                	//TODO code for getEmployees
                    break;
                case 6:
                	//TODO code for findByORganizationId
                default:
                    System.out.println("Sorry, please enter valid Option");

                }// End of switch statement

            } while (menuOption != 5);

            // Exiting message when user decides to quit Program
            System.out.println("Thanks for using this Program...");

        } catch (Exception ex) {
            // Error Message
            System.out.println("Sorry problem occured within Program");
            // flushing scanner
            scanner.next();
        } finally {
            // Ensuring that scanner will always be closed and cleaning up
            // resources
            scanner.close();
        }

    }// End of main Method

    /**
     * Method that prints menu to screen and gets returns user's option from menu
     * @return Returns user Option
     */
    public static int showMenu() {

        // Declaring var for user option and defaulting to 0
        int option = 0;

        // Printing menu to screen
        System.out.println("Menu:");
        System.out.println("1. Add Employee");
        System.out.println("2. Update Employee");
        System.out.println("3. Delete Employee");
        System.out.println("4. Find by id");
        System.out.println("5. Get Employees");
        System.out.println("6. Find by organization id");
        System.out.println();

        // Getting user option from above menu
        System.out.println("Enter Option from above...");
        option = scanner.nextInt();

        return option;

    }// End of showMenu


}// end Main class
