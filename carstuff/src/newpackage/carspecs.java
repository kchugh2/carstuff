package newpackage;
import java.util.*;

public class carspecs {

	private String make,model, transmission;
	private int year, topspeed ;
	double zerosixty, dragcoeff;;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTopspeed() {
		return topspeed;
	}
	public void setTopspeed(int topspeed) {
		this.topspeed = topspeed;
	}
	public double getZerosixty() {
		return zerosixty;
	}
	public void setZerosixty(double zerosixty) {
		this.zerosixty = zerosixty;
	}
	public double getDragcoeff() {
		return dragcoeff;
	}
	public void setDragcoeff(double dragcoeff) {
		this.dragcoeff = dragcoeff;
	}
	
	public void carspecs (String make, String model,String transmission, int year,int topspeed, double zerosixty, double dragcoeff )
	{
		this.make = make;
		this.model = model;
		this.transmission=transmission;
		this.year=year;
		this.topspeed=topspeed;
		this.zerosixty=zerosixty;
		this.dragcoeff=dragcoeff;
	}
	public void carspecs()
	{
		this.make = "";
		this.model = "";
		this.transmission="";
		this.year=0;
		this.topspeed=0;
		this.zerosixty=0;
		this.dragcoeff=0;
	}
	public void display()
	{
		System.out.println("The make of this car is\t"+this.getMake());
		System.out.println("The model is \t"+this.getModel());
		System.out.println("The transmissions is \t"+this.getTransmission());
		System.out.println("This year is \t"+this.getYear());
		System.out.println("The Topspeed is \t"+ this.getTopspeed());
		System.out.println("The 0-60 time is\t"+this.getZerosixty());
		System.out.println("The Drag Coefficient \t"+this.getDragcoeff());
	}
	
}
	

