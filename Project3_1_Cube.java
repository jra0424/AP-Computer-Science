// Joe Adcock
// Period 3
// Computing the surface area of a cube

import java.util.Scanner;

public class Project3_1_Cube
{
    public static void main(String [] args)
    {
        //creating a scanner
        Scanner reader = new Scanner(System.in);
        
        // declaring the variables
        int edgeLength;
        int surfaceArea;
        
        // asking for inputs
        System.out.print("Enter the edge length: ");
        edgeLength = reader.nextInt();
        
        //calculating the cube's surface area
        surfaceArea = edgeLength * edgeLength * 6;
        
        //printing the result
        System.out.println("The surface area of the cube is " + surfaceArea);
    }
}