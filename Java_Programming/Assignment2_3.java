/*
Step 1 : Understand the problem statement
Step 2 : Write the Algorithum
Step 3 : Decide the programing language
Step 4 : Write the program
Step 5 : Test the program
*/

/*
    Algorithum

    START
        Accept one number from the user as No
        If the input is negative,convert it into positive
        If no is lass than 10
            Display "Hello" 
        Otherwise
            Display "Demo"      
    STOP    
*/

//////////////////////////////////////////////////////////////////////////////////////
//
// Function Name    :   DisplayMessage 
// Description      :   It is used to Display "Hello" if the no is less than 10
// Input            :   Integer
// Output           :   Void
// Author           :   Prajjwal Dilip Naykawadi
// Date             :   24/10/2025
// 
/////////////////////////////////////////////////////////////////////////////////////

class Assignment
{
    void Display(int iNo)
    {
        if(iNo < 10)
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Demo");
        }
    }
}


/////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////////////////////////

class Assignment2_3
{
    public static void main(String args[])
    {
        int iValue = 5;

        Assignment obj = new Assignment();
        obj.Display(iValue);
    }
}