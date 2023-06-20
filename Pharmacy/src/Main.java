/*import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User login
        System.out.println("Enter username:");
        String username = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        SignUp signUp = new SignUp(username, password);
        if (signUp.getUser_Name().equals(username) && signUp.getPass_Word().equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Login failed.");
            return;
        }

        // Create a list of medicines
        List<AgentMediList> medicineList = new ArrayList<>();

        // Adding medicines to the list
        medicineList.add(new AgentMediList("Medicine1", "Generic1", "Company1", "12/12/2025", 10.5, 100));
        medicineList.add(new AgentMediList("Medicine2", "Generic2", "Company2", "12/12/2026", 15.2, 50));
        medicineList.add(new AgentMediList("Medicine3", "Generic3", "Company3", "12/12/2027", 20.0, 200));

        // Print the medicine list
        System.out.println("Medicine List:");
        for (AgentMediList medicine : medicineList) {
            System.out.println(medicine);
        }

        // Write the medicine list to a file
        try {
            FileWriter fileWriter = new FileWriter("medicine_list.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (AgentMediList medicine : medicineList) {
                bufferedWriter.write(medicine.toString());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("Medicine list saved to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}




import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User login
        System.out.println("Enter username:");
        String username = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        SignUp signUp = new SignUp(username, password);
        if (signUp.getUser_Name().equals(username) && signUp.getPass_Word().equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Login failed.");
            return;
        }

        // Create a list of medicines
        List<AgentMediList> medicineList = new ArrayList<>();

        // Adding medicines to the list
        System.out.println("Add medicines to the list (Enter 'exit' to stop):");
        while (true) {
            System.out.println("Enter medicine name:");
            String medicineName = scanner.nextLine();

            if (medicineName.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter generic name:");
            String genericName = scanner.nextLine();

            System.out.println("Enter company name:");
            String companyName = scanner.nextLine();

            System.out.println("Enter expiry date:");
            String expiryDate = scanner.nextLine();

            System.out.println("Enter price:");
            double price = scanner.nextDouble();

            System.out.println("Enter total quantity:");
            int totalQuantity = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character

            AgentMediList medicine = new AgentMediList(medicineName, genericName, companyName, expiryDate, price, totalQuantity);
            medicineList.add(medicine);
        }

        // Print the medicine list
        System.out.println("Medicine List:");
        for (AgentMediList medicine : medicineList) {
            System.out.println(medicine);
        }

        // Write the medicine list to a file
        try {
            FileWriter fileWriter = new FileWriter("medicine_list.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (AgentMediList medicine : medicineList) {
                bufferedWriter.write(medicine.toString());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("Medicine list saved to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}

 */

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User login
        System.out.println("Enter username:");
        String username = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        SignUp signUp = new SignUp(username, password);
        if (signUp.getUser_Name().equals(username) && signUp.getPass_Word().equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Login failed.");
            return;
        }

        // Create a list of medicines
        List<AgentMediList> medicineList = new ArrayList<>();

        // Adding medicines to the list
        System.out.println("Add medicines to the list (Enter 'exit' to stop):");
        while (true) {
            System.out.println("Enter medicine name:");
            String medicineName = scanner.nextLine();

            if (medicineName.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter generic name:");
            String genericName = scanner.nextLine();

            System.out.println("Enter company name:");
            String companyName = scanner.nextLine();

            System.out.println("Enter expiry date:");
            String expiryDate = scanner.nextLine();

            System.out.println("Enter price:");
            double price = scanner.nextDouble();

            System.out.println("Enter total quantity:");
            int totalQuantity = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character

            AgentMediList medicine = new AgentMediList(medicineName, genericName, companyName, expiryDate, price, totalQuantity);
            medicineList.add(medicine);
        }

        // Print the medicine list
        System.out.println("Medicine List:");
        for (AgentMediList medicine : medicineList) {
            System.out.println(medicine);
        }

        // Write the medicine list to a file
        try {
            FileWriter fileWriter = new FileWriter("medicine_list.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (AgentMediList medicine : medicineList) {
                bufferedWriter.write(medicine.toString());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("Medicine list saved to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
