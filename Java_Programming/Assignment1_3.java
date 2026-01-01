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
// Function Name    :   PrintReverseNumbers
// Description      :   Used to print numbers from 5 to 1
// Input            :   int
// Output           :   5 , 4 , 3 , 2 , 1
// Author           :   Prajjwal Dilip Naykawadi
// Date             :   19/10/2025
// 
/////////////////////////////////////////////////////////////////////////////////////

class Numbers
{
    void Display()
    {
        int i = 5;

        while(i >= 1)
        {
            System.out.println(i);
            i--;
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////////////////////////

class Assignment1_3
{
    public static void main(String Args[])
    {
        Numbers obj = new Numbers();
        obj.Display();
    }
}

/////////////////////////////////////////////////////////////////////////////////////
//
//  Test cases successfully handled by the application
//  5
//  4
//  3
//  2
//  1
//
/////////////////////////////////////////////////////////////////////////////////////