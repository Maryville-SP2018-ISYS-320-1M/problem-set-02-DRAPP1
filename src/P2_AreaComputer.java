/*
	ISYS 320 DONE DONE DONE DONE DONE
	Name(s): Dave Rapp
	Date: 4-16-18
*/

public class P2_AreaComputer {

	public static void main(String[] args) {
		triangleArea(8.0, 5.2, 7.1);
	}
	
	
	//Triangle area function
	    public static double triangleArea(double len1, double len2, double len3){ 
	    	double area; double s;
	        s = 0.5 * (len1 + len2 + len3);
	        area = Math.sqrt(s*(s-len1)*(s-len2)*(s-len3));
	        System.out.println("Area of triangle is: " + area);
	        return area;
	    }
}