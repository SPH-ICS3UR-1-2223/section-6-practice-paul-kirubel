package LoopShape;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
    	//Top line
   for (int i=1;i<=width;i++) {
	   System.out.print("#");
   }
   System.out.println();
    System.out.println("#   #");
    System.out.println("#   #");
    
    for (int i=1;i<=width;i++) 
 	   System.out.print("#");
 	   System.out.println();
    }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
    
    	System.out.println();
   
    	
    	for (int i=1;i<leg;i++)  {
            System.out.print("&");
        	}
    }
}
