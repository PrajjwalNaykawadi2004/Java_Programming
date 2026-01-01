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
        Accept int i
        initialize the value of i = 5
        print numbers from 5 to 1
    STOP    
*/

/////////////////////////////////////////////////////////////////////////////////////
//
// Function Name    :   DivisiblityCheck
// Description      :   Used to check Divisibilty
// Input            :   Integer
// Output           :   Boolean
// Author           :   Prajjwal Dilip Naykawadi
// Date             :   19/10/2025
// 
/////////////////////////////////////////////////////////////////////////////////////

class Number
{
    boolean Check(int iNo)
    {
        if((iNo % 5) == 0)
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

class Assignment1_4
{
    public static void main(String Args[])
    {
        int iValue = 15;
        boolean bRet = false;
    
        Number obj = new Number();
        bRet = obj.Check(iValue);

        if(bRet == true)
        {
           System.out.println("Divisible by 5");
        }
        else
        {
           System.out.println("Not Divisible by 5");
        }
    }

}

/////////////////////////////////////////////////////////////////////////////////////
//
//  Test cases successfully handled by the application
//  Test Case 1:
//  Input   :   5 , 12
//  Output  :   Divisible by 5 
//
//  Test Case 2:
//  Input   :   8 , 9
//  Output  :   Not Divisible by 5    
//
/////////////////////////////////////////////////////////////////////////////////////
