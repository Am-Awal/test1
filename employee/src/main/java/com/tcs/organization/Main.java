package com.tcs.organization;

import java.util.Optional;
import java.util.Scanner;

import com.tcs.department.model.Department;
import com.tcs.department.service.DepartmentService;
import com.tcs.department.service.DepartmentServiceImpl;
import com.tcs.organization.model.Organization;
import com.tcs.organization.service.OrganizationService;
import com.tcs.organization.service.OrganizationServiceImpl;

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
            		
                	Organization organization = new Organization(1,"university","Univercity Circle",null,null);
                	OrganizationService organizationService = OrganizationServiceImpl.getInstance();
            		
            		String result = organizationService.addOrganization(organization);

            		if("success".equals(result)) {
            			System.out.println("recored added successfully");
            		}
            		else {
            			System.out.println("problem");
            		}
            		
            		Optional<Organization> optional= organizationService.findById(organization.getId());
            		
            		if(optional.isPresent()) {
            			Organization organization2 = optional.get();
            			System.out.println(organization2);
            		}
            		else {
            			System.out.println("Organization is not available");
            		}
                    break;
                case 2:
                    //TODO code for updateOrganization
                    break;
                case 3:
                	//TODO code for deleteOrganization
                    break;
                case 4:
                	//TODO code for findById
                    break;
                case 5:
                	//TODO code for getDepartments
                    break;
                case 6:
                	//TODO code for getEmployees
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
        System.out.println("1. Add organization");
        System.out.println("2. Update organization");
        System.out.println("3. Delete organization");
        System.out.println("4. Find by id");
        System.out.println("5. Get employees");
        System.out.println("6. Get departments");
        System.out.println();

        // Getting user option from above menu
        System.out.println("Enter Option from above...");
        option = scanner.nextInt();

        return option;

    }// End of showMenu


}
