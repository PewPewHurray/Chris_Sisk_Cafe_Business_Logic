import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] price){
        double sum = 0;
        for (double item : price){
            sum += item;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for ( int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s!%n", userName);
        System.out.printf("There are %s people in front of you%n", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }

    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        for (int i = 1; i < maxQuantity; i++){
            double total = price * i;
            System.out.printf("%s - $%.2f%n", i, total);
            price -= .5;
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if (menuItems.size() != prices.size()){
            return false;
        }
        for (int i = 0; i < menuItems.size(); i++){
            System.out.printf("%s %s -- $%.2f%n", i, menuItems.get(i), prices.get(i));
        }
        return true;
    }

    public void addCustomers(ArrayList<String> customers){
        boolean endFlag = false;
        while (!endFlag){
            System.out.println("Please enter customer name or type q to exit:");
            String customerName = System.console().readLine();
            if (customerName.equals("q")){
                endFlag = true;
            }
            else {
                customers.add(customerName);
                System.out.println(customers);
            }
        }
    }
}