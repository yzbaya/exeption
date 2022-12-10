package exeptionEx1;

public class main {

	public static void main(String[] args) {
		try {
		Double x = Double.parseDouble(args[0]);
		Double n=Double.parseDouble(args[1]);
		System.out.println(Mathematique.f(x, n));
        			
		}catch (IndexOutOfBoundsException ex ) {
			System.out.println("OutOfBoundsException");
			ex.getMessage();
		}
      catch(NumberFormatException en){
    	  System.out.println("NumberFormatException");
    	  en.getMessage();
      }
	      catch(ParemetreNullExeption pn){
	    	  System.out.println("ParemetreNullExeption");
	    	  pn.getMessage();
	      }
		finally {
			System.out.println("bloc finally");
		}
		System.out.println("xxx");
	}

}
