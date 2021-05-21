/* ####################################################
Einsendeaufgabe 3.1
#################################################### */

package schaltjahr;
import javax.swing.*;
public class Schaltjahr {

	public static void main(String[] args) {
		int Jahr;  // Jahr wird definiert als int.
		Jahr = Integer.parseInt (JOptionPane.showInputDialog ("Bitte geben Sie ein Jahr ein.")); //Eingabefeld wird erzeugt.
			if // hier fängt die Schleife es wird kontrolliert ob das Jahr durch 4 geteilt werden kann und zugleich nicht durch 100 teilbar ist. 
			(Jahr % 4 == 0 || Jahr % 100 != 0)
				if // hier wird kontrolliert ob das eingegebene Jahr durch 4 durch 100 und zugleich durch 400 teilbar ist was die Vorraussetzung ist.
				(Jahr % 4 == 0 || Jahr % 100 == 0 || Jahr % 400 == 0)
				System.out.println(Jahr + " Das Jahr ist ein Schaltjahr"); // Das Ergebnis wird mit dem eingegebenen Jahr und "Das ist ein Schaltjahr" ausgegeben.
			    
				else { // falls die Bedingungen nicht zutreffen.
				System.out.println("Das ist kein Schaltjahr");
				}
	}

}
