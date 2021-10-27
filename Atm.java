import java.util.*;

// This class simulates an ATM machine
// We create a bank account and can check the balance, add money, and withdraw money 

public class Atm {

int cash; 

public Atm(int money) {
cash = money;     
}

// Check balance
public void checkBalance(){
System.out.println("Your balance is: £" + cash); 
}

// Withdraw money 
public void withdrawMoney(int amountWithdrawn){   
cash = cash - amountWithdrawn;
System.out.println("You withdrew: £" + amountWithdrawn + ". Your balance is now: £" + cash); 
}

// Add money 
public void addMoney(int amountAdded){
cash = cash + amountAdded; 
System.out.println("You added: £" + amountAdded + ". Your balance is now: £" + cash);    
}

// Quit method
public static String quit() {
System.out.println("GoodBye");
return null;
}


// MAIN METHOD 
public static void main(String[] args) {
Atm account1 = new Atm(0);   
Scanner scan = new Scanner(System.in);
System.out.println("Hello, welcome to your bank account!"); 
System.out.println("What would you like to do? \n 1) Check your balance \n 2) Add money \n 3) Withdraw money \n Input number of choice");  

while(true){ 
int selectOption = scan.nextInt();    
if(selectOption == 1){
    System.out.println("You chose to check your balance!");
    account1.checkBalance(); 
    System.out.println("Now would you like to: 1) Check your balance again 2) Add money 3) Withdraw money"); 
}
else if(selectOption == 2){
    System.out.println("You chose to add money!");
    account1.addMoney(100);
    System.out.println("Now would you like to: 1) Check your balance 2) Add more money 3) Withdraw money"); 
}
else if(selectOption == 3){
    System.out.println("You chose to withdraw money!");
    account1.withdrawMoney(50); 
    System.out.println("Now would you like to: 1) Check your balance 2) Add money 3) Withdraw money again");
}
else if(selectOption == 4){
   // quit(); 
    scan.close();  
}
}

}

}
