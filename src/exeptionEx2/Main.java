package exeptionEx2;

public class Main {

	public static void main(String[] args) {
	     boolean error = false ;
	     
	    
        	 try {
        	 error=false;
        	 Authentification  a =new Authentification()  ; 
        	 
        	 } catch (WrongLe l) {
              	  System.out.println("WrongInputLength");
            	  l.getMessage();
            		 error=true;
            	 }
        	 catch (WrongPw P) {
             	  System.out.println("WrongPwdException");
           	  P.getMessage();
           		 error=true;        		 
       	     }
        	 catch (WrongLo log) {
             	  System.out.println("WrongLoginException");
           	  log.getMessage();
           		 error=true;       		 
       	 }

 

       


}
	}
