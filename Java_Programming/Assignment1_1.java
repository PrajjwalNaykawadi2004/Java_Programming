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
        Perform division of iValue1 and iValue2
        Display Division on the screen
    STOP    
*/

/////////////////////////////////////////////////////////////////////////////////////
//
// Function Name    :   DivisionofTwoNumbers
// Description      :   It is used to perform division   
// Input            :   int, int
// Output           :   int
// Author           :   Prajjwal Dilip Naykawadi
// Date             :   18/10/2025
// 
/////////////////////////////////////////////////////////////////////////////////////

class Arithmetic
{
    public int Divide(int iNo1, int iNo2)
    {
      int iAns = 0;

      if(iNo2 < 1)
     {
        return -1;
     }
    
     iAns = iNo1 / iNo2;
     return iAns;
    }
}

/////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////////////////////////

class Assignment1_1
{
    public static void main(String A[])
    {
        int iValue1 = 15, iValue2 = 5;
        int iRet = 0;

        Arithmetic aobj = new Arithmetic();
        iRet = aobj.Divide(iValue1, iValue2);

        System.out.println("Division is " + iRet);
    }
}