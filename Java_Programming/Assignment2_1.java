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
        Use a loop to print '*' on the screen equal to the value of no
        Stop after printing all the stars  
    STOP    
*/

/////////////////////////////////////////////////////////////////////////////////////
//
// Function Name    :   DivisibiltyCheck 
// Description      :   It is used to display the given number of stars on the screen
// Input            :   Integer
// Output           :   Void
// Author           :   Prajjwal Dilip Naykawadi
// Date             :   24/10/2025
// 
/////////////////////////////////////////////////////////////////////////////////////

class Stars
{
    void Display(int iNo)
    {
        int iCnt = 0;
        
        // Write Updater

        while(iCnt < iNo)
        {
            System.out.println("* ");
            iCnt++;
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////////////////////////

class Assignment2_1
{
    public static void main(String Args[])
    {
        int iValue = 5;

        Stars obj = new Stars();
        obj.Display(iValue);

    }
}