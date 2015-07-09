package onlinetest1;

import javax.swing.JOptionPane;

public class evmmain {

	public static void main(String[] args) {
		
		Pannel p = new Pannel();
		Lamp l =new Lamp();
		
		p.twodigit();
		l.Onlamp();
		
		VoterList table = new VoterList();   // construct model object

	    // tabulate the votes:
	    boolean processing = true;
	    System.out.print("voting list are:");
	    while ( processing )
	          { String s = JOptionPane.showInputDialog(
		                 "Please type the last name of your candidate:");
	            if ( s == null )  // did election official press Cancel ?
	                 { processing = false; }  // yes, time to quit
	            else { if ( s.equals("Bush") )
		              { table.voteForBush(); }
	                   else if ( s.equals("Kerry") )
			      { table.voteForKerry(); }
	                   else if ( s.equals("Nader") )
			      { table.voteForNader(); }
			   else { } // it's an invalid vote and is lost forever...
	                 }
	           }
	     // total the votes:
	     System.out.println( table.computeTotals() );
	     System.exit(0);
	  }

}
	

