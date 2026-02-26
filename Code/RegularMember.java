import java.util.Scanner; // Here a pagakage has been imported for the use of scanner

public class RegularMember extends GymMember
{
    private final int attendanceLimit; // Here the private accesor method is used so that the variables cannot be accessed 
    private boolean isEligibleForUpgrade;
    private String removalReason;
    private String referralSource;
    private String plan;
    private double price;
    
    public RegularMember(int id, String name, String location, String phone, String email, String gender, String DOB, String membershipStartDate, String referralSource) // A constructor is made
    {
        super(id, name, location, phone, email, gender, DOB, membershipStartDate); // supr is usedd to call th constructor from parent class
        this.referralSource = referralSource;
        
        // values for some instance variables are initialized
        this.isEligibleForUpgrade = false; 
        this.removalReason = "";
        this.plan = "basic";
        this.price = 6500;
        this.attendanceLimit = 30;
    }
    
    public int getAttendanceLimit() // Getter method for AttendanceLimit is made
    {
        return this.attendanceLimit;
    }
    
    public boolean getIsEligibleForUpgrade() // Getter method for for isEligibleForUpgradde is made
    {
        return this.isEligibleForUpgrade;
    }
    
    public String getRemovalReason() // Getter method for removalReason is made
    {
        return this.removalReason;
    }
    
    public String getPlan() // Getter method for plan is made
    {
        return this.plan;
    }
    
    public String getReferralSource() // Getter method for referralSource is made
    {
        return this.referralSource;
    }
    
    public double getPrice() // Getter method for price is made
    {
        return this.price;
    }
    
    public void markAttendance() // abstract method in parent class
    {
        attendance++;
        loyaltyPoints += 5;
    }
    
    public double getPlanPrice(String plan) // method to get plan price
    {
        this.plan = plan;
        
        switch(plan) // switch is used to check if the plan entered bu the member is one of the options or not and if it is its price is returned
        {
            case "basic":
                this.price = 6500;
                break;
                
            case "standard":
                this.price = 12500;
                break;
            
            case "deluxe":
                this.price = 18500;
                break;
                
            default:
                this.price = 0;
                break;
        }
        
        if(this.price == 0)
        {
            return -1;
        }
        
        else
        {
            return this.price;
        }
    }
    
    public String upgradePlan(String plan) // method to upgradde plan from the current one
    {
        this.plan = plan;
        
        if(getPlanPrice(this.plan) == -1) // checking if the plan that the member is trying to change into exists or not
        {
            System.out.println("The plan youa are trying to change into doesn't exist.");
        }
        else
        {
            if(getAttendance()>= attendanceLimit) // checking if the member is eligible fo upgarde or not
            {
                isEligibleForUpgrade = true;
            }
            else
            {
                isEligibleForUpgrade = false;
            }
        }
        
        if(isEligibleForUpgrade == true)
        {
            String temp;
            System.out.println("Do you want to change from your current plan? If yes, press 1 and if not, press 2");
            Scanner s = new Scanner(System.in);
            if(s.nextInt() == 1) // checking if the member wants to change plans or not
            {
                System.out.println("Which plan would you like to change it to? Type basic to change it to basic, Type standard to change it to standard and Type deluxe to change it to Deluxe");
                Scanner sa = new Scanner(System.in);
                temp = sa.nextLine();
                if(temp.equals(this.plan)) // checking if the plan that the member is trying to change into is the same one that he/she is using
                {
                    return "You cannot change or upgrade to this plan as you are currenlty in this plan.";
                }
                
                else
                {
                    if(temp.equals("basic"))
                    {
                        this.plan = "basic";
                        return "Your plan has been changed to basic.";
                    }
                    
                    else if(temp.equals("standard"))
                    {
                        this.plan = "standard";
                        return "Your plan has been changed to standard.";
                    }
                    
                    else
                    {
                        this.plan = "deluxe";
                        return "Your plan has been changed to deluxe.";
                    }
                }
            }
            
            else if(s.nextInt() == 2)
            {
                return ("Thank you for your cooperation. Your plan will remain the same as is it is now which is " + this.plan + ".");
            }
            
            else
            {
                return "Wrong input.";
            }
        }
            
        else
        {
            return "You are not eligible for upgrade.";
        }
    }
    
    public void revertRegularMember(String removalReason) // method to revert into a regular member
    {
        resetMember();
        this.removalReason = removalReason;
        this.isEligibleForUpgrade = false;
        this.plan = "basic";
        this.price = 6500;
        this.attendance = 0;
    }
    
    public void display() // method to display the output
    {
        super.display();
        System.out.println("The current plan is " + getPlan() + " with the price of " + getPrice()       + ".");
        if(this.removalReason != "")
        {
            System.out.println("The removal reason this is " + getRemovalReason() + ".");
        }
    }
}
