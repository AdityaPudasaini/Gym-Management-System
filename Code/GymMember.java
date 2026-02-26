public abstract class GymMember
{
    protected int id;  // Here the instance variables are declared using protected accessor method
    protected int attendance;
    protected String name;
    protected String location;
    protected String phone;
    protected String email;
    protected String gender;
    protected String DOB;
    protected String membershipStartDate;
    protected double loyaltyPoints;
    protected boolean activeStatus;    
    public GymMember(int id, String name, String location, String phone, String email, String gender, String DOB, String membershipStartDate) // A constructor is made
    {
        this.id = id; // value passed into the constructor are getting stored in the instance variables
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.DOB = DOB;
        this.membershipStartDate = membershipStartDate;
        this.attendance = 0; // values for attendance is initialized
        this.loyaltyPoints = 0; // values for loyaltyPoints is initialized
        this.activeStatus =  false; // values for activeStatus is initialized
    }
    
    public int getId() // Getter method for id is made
    {
        return this.id;
    }
    
    public int getAttendance() // Getter method for attendance is made
    {
        return this.attendance;
    }
    
    public String getName() // Getter method for name is made
    {
        return this.name;
    }
    
    public String getLocation() // Getter method for location is made
    {
        return this.location;
    }
    
    public String getPhone() // Getter method for phone number is made
    {
        return this.phone;
    }
    
    public String getEmail() // Getter method for email is made
    {
        return this.email;
    }
    
    public String getGender() // Getter method for gender is made
    {
        return this.gender;
    }
    
    public String getDOB() // Getter method for date of birth is made
    {
        return this.DOB;
    }
    
    public String getMembershipStartDate() // Getter method for membership start date is made
    {
        return this.membershipStartDate;
    }
    
    public double getLoyaltyPoints() // Getter method for loyalty points is made
    {
        return this.loyaltyPoints;
    }
    
    public boolean getActiveStatus() // Getter method for active status is made
    {
        return this.activeStatus;
    }
    
    
    public abstract void markAttendance(); // Abstract method declaration
    
    
    public void activateMembership() // Method to activate membership
    {
        this.activeStatus = true;
    }
    
    
    public void deactivateMembership() // Method to deactivate membership
    {
        this.activeStatus = false;
    }
    
    
    public void resetMember() // Method to reset member
    {
        this.activeStatus = false;
        this.loyaltyPoints = 0;
        this.attendance = 0;
    }
    
    
    public void display() // Method to display member's information
    {
        System.out.println("The id is " + getId() + ", name is " + getName() + ", location is " + getLocation() + ", phone is " + getPhone() + ", email is " + getEmail() + ", gender is " + getGender() + ", DOB is " + getDOB() + ", membershipStartDate is " + getMembershipStartDate()+ ", attendance is " + getAttendance() + ", loyaltyPoints is " + getLoyaltyPoints() + "and activeStatus is " + getActiveStatus() + ".");
    }
}
