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
        Initialize the integer
        Print "Marvellous" % times
    STOP    
*/


/////////////////////////////////////////////////////////////////////////////////////
//
// Function Name    :   Marvellous
// Description      :   used to print  Marvellous 5 times   
// Input            :   int
// Output           :   Marvellous
// Author           :   Prajjwal Dilip Naykawadi
// Date             :   18/10/2025
// 
/////////////////////////////////////////////////////////////////////////////////////

class Count
{
    void Display()
    {
        int i = 0;

        for(i = 1;i<=5;i++)
        {
            System.out.println("Marvellous");
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////////////////////////

class Assignment1_2
{
    public static void main(String args[])
    {
        Count obj = new Count();
        obj.Display();
    }
}