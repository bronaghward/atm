import java.util.*;// The ATM class simulates an ATM machine
// We can check the balance, add, and withdraw money 

public class Atm {

//declare an int value for cash balance 
int cash; 

// constructor method - public as it needs objects 
public Atm(int editCash) {
cash = editCash;     
}

// Method to check balance
//public is it has to be called on an object, void as it returns nothing 
public void checkBalance(){
System.out.println("Your balance is: £" + cash); 
}

// withdraw money method - public as it requires methods, passing in the object variable 
// void as it returns nothing 
public void withdrawMoney(int amtWithdrawn){   
cash = cash - amtWithdrawn;
System.out.println("You withdrew: £" + amtWithdrawn + ". Your balance is now: £" + cash); 
}

// add money method 
public void addMoney(int amtAdded){
cash = cash + amtAdded; 
System.out.println("You added: £" + amtAdded + ". Your balance is now: £" + cash);    
}

// Quit method
public static String quit() {
 System.out.println("GoodBye");
 return null;
    
  }


// MAIN METHOD 
public static void main(String[] args) {
Atm bronagh = new Atm(0);   
Atm john = new Atm(5000000);  
Scanner t2c = new Scanner(System.in);
System.out.println("Hello, welcome to your BW Inc Bank Account!");  
System.out.println("You'll never have as much as John has! he's got : " + john.cash);
System.out.println("Would you like to: \n 1) Check your balance \n 2) Add money \n 3) Withdraw money? \n Input number of choice");  

while(true){ 
int selectOption = t2c.nextInt();    
if(selectOption == 1){
    System.out.println("You chose to check your balance!");
    bronagh.checkBalance(); 
}
else if(selectOption == 2){
    System.out.println("You chose to add money!");
    bronagh.addMoney(100);
}
else if(selectOption == 3){
    System.out.println("You chose to withdraw money!");
    bronagh.withdrawMoney(50); 
}
else if(selectOption == 4){
   // quit(); 
    t2c.close();  
}
}

    }
}
