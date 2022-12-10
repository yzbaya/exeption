package exeptionEx2;

import java.util.Scanner;


public class Authentification  {
	final String Login="scott";
	final String Pwd="tiger";

	void getUserLogin() throws  WrongLe,WrongLo {
		
		Scanner o= new Scanner (System.in);
		
		String l=o.nextLine();
		
		if(l.equals("scott")==false) {
			throw new WrongLo();
		}
		else if (l.length()>10) {
			throw new WrongLe ();
		}
	}

		void getUserPwd() throws WrongPw {
			Scanner o1= new Scanner (System.in);
			String P=o1.nextLine();
			
			if (P.equals("tiger")==false) {
				throw new  WrongPw();
			}
			
		}
  
}
