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
        If no is divisible by 2
            Display "Even number" 
        Otherwise
            Display "Odd number"      
    STOP    
*/

/////////////////////////////////////////////////////////////////////////////////////
//
// Function Name    :   CheckEvenOdd
// Description      :   It is used to check the entered number is even or odd 
// Input            :   Integer
// Output           :   Void
// Author           :   Prajjwal Dilip Naykawadi
// Date             :   27/10/2025
// 
/////////////////////////////////////////////////////////////////////////////////////

class CheckEvenOdd
{
    boolean ChkEvenOdd(int iNo)
    {
        if(iNo % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////////////////////////

class Assignment2_5
{
    public static void main(String args[])
    {
        int iValue = 6;
        boolean bRet = false;

        CheckEvenOdd obj = new CheckEvenOdd();
        bRet = obj.ChkEvenOdd(iValue);

        if(bRet == true)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
}