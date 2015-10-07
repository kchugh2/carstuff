package newpackage;
import newpackage.carspecs;
import java.util.*;
public class carmain {
public static carspecs porsche()
{
	carspecs porsche = new carspecs();
	porsche.setMake("Porsche");
	porsche.setModel("Cayman");
	porsche.setTransmission("Manual");
	porsche.setYear(1995);
	porsche.setTopspeed(200);
	porsche.setZerosixty(2.8);
	porsche.setDragcoeff(1.32);
	return porsche;
}
public static carspecs miata()
{
	carspecs miata = new carspecs();
	miata.setMake("Mazda");
	miata.setModel("Miata");
	miata.setTransmission("Manual");
	miata.setYear(2005);
	miata.setTopspeed(140);
	miata.setZerosixty(5);
	miata.setDragcoeff(1.11);
	return miata;
}
public static void main(String[] args)
{
	carspecs newcar = new carspecs();
	newcar= miata();
	newcar.display();
	
	}
}
