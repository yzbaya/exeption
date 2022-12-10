package exeptionEx1;


public class Mathematique {
     
	double n;
	double x;
	
    static double f(double n,double x) throws ParemetreNullExeption {
    	if (n==0) {
    		throw new ParemetreNullExeption("");
    	}
		return (Math.sqrt(x)/n);
	}
    

    
    
}
