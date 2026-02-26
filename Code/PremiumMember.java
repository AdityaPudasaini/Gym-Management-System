public class PremiumMember extends GymMember
{
    final double premiumCharge; // decalring varaiables
    String personalTrainer;
    boolean isFullPayment;
    double paidAmount;
    double discountAmount;
    
    public PremiumMember(int id, String name, String location, String phone, String email, String gender, String DOB, String membershipStartDate, String personalTrainer) // making a constructor
    {
        super(id, name, location, phone, email, gender, DOB, membershipStartDate); // using super to call the constructor in the parent class
        this.personalTrainer = personalTrainer;
        this.premiumCharge = 50000; // initializing the instance variables
        this.isFullPayment = false;
        this.paidAmount = 0;
        this.discountAmount = 0;
    }
    
    public double getPremiumCharge() // Getter method for premium charge is made
    {
        return this.premiumCharge;
    }
    
    public String getPersonalTrainer() // Getter method for personal trainer is made
    {
        return this.personalTrainer;
    }
    
    public boolean getIsFullPayment() // Getter method for isFullPayment is made
    {
        return this.isFullPayment;
    }
    
    public double getPaidAmount() // Getter method for paidAmount is made
    {
        return this.paidAmount;
    }
    
    public double getDiscountAmount() // Getter method for discount amount is made
    {
        return this.discountAmount;
    }
    
    public void markAttendance() // Abstract method in the parent class
    {
        attendance++;
        loyaltyPoints += 10;
    }
    
    public String payDueAmount(double paidAmount) // calculating the due amount to be paid
    {
        this.paidAmount += paidAmount;
        double remainingAmount;
        
        if(this.paidAmount == premiumCharge)
        {
            this.isFullPayment = true;
            System.out.println("You have fully paid the premium charge amount.");
        }
        
        else
        {
            this.isFullPayment = false;
        }
        
        if(this.isFullPayment == true)
        {
            if(this.paidAmount > this.premiumCharge)
            {
                remainingAmount = paidAmount - premiumCharge;
                System.out.println("Since you paid " + this.paidAmount + " which is higher than required, you will be refunded the extra amount which comes down to " + remainingAmount + ".");
            }
            
            else
            {
                System.out.println("Your due amount is already paid.");
            }
            return "The payment is done.";
        }
        
        else
        {
            remainingAmount = this.premiumCharge - this.paidAmount;
            System.out.println("Your due amount is still not fully paid and " + remainingAmount + " is still left");
            return "The payment isn't done.";
        }
    }
    
    public void calculateDiscount() // method fo rcalculating discout
    {
        if(this.isFullPayment == true)
        {
            this.discountAmount = 0.1 * 50000;
            System.out.println("Since you are a permium member of ours, you have been given 10% discount which comes to " + discountAmount + ".");
        }
    }
    
    public void revertPremiumMember() // Method to revert back to premium member
    {
        resetMember();
        this.personalTrainer = "";
        this.isFullPayment = false;
        this.paidAmount = 0;
        this.discountAmount = 0;
    }
    
    public void display() // method to display the information
    {
        super.display();
        System.out.println("Personal trainer name is " + getPersonalTrainer() + ", the paid amount is " + getPaidAmount() + ", the full payment amount is  " + getIsFullPayment() + ".");
        
        if(isFullPayment == true)
        {
            double remainingAmount;
            remainingAmount = this.premiumCharge - this.paidAmount;
            
            if(remainingAmount == 0)
            {
                System.out.println("You have no remianing amount to be paid and got a discount of " + getDiscountAmount() + ".");
            }
            
            else
            {
                System.out.println("You have " + remainingAmount + " to be paid.");
            }
        }
    }
}
