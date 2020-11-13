package com.tcs.department;

import java.util.Optional;
import java.util.Scanner;

import com.tcs.department.model.Department;
import com.tcs.department.service.DepartmentService;
import com.tcs.department.service.DepartmentServiceImpl;

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
            		
                	Department department = new Department(1,101,"Biology",null);
                	DepartmentService departmentService = DepartmentServiceImpl.getInstance();
            		
            		String result = departmentService.addDepartment(department);

            		if("success".equals(result)) {
            			System.out.println("recored added successfully");
            		}
            		else {
            			System.out.println("problem");
            		}
            		
            		Optional<Department> optional= departmentService.findById(department.getId());
            		
            		if(optional.isPresent()) {
            			Department depatment2 = optional.get();
            			System.out.println(depatment2);
            		}
            		else {
            			System.out.println("department is not available");
            		}
                    break;
                case 2:
                    //TODO code for updateDepartment
                    break;
                case 3:
                	//TODO code for deleteDepartment
                    break;
                case 4:
                	//TODO code for findById
                    break;
                case 5:
                	//TODO code for getDepartment
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
        System.out.println("1. Add Department");
        System.out.println("2. Update Department");
        System.out.println("3. Delete Department");
        System.out.println("4. Find by id");
        System.out.println("5. Get Employees");
        System.out.println("6. Find by organization id");
        System.out.println();

        // Getting user option from above menu
        System.out.println("Enter Option from above...");
        option = scanner.nextInt();

        return option;

    }// End of showMenu


}
