package main;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Converter {

	public static void main(String[] args) throws NoSuchElementException {
		
		CreateMenu();
		
	
		
	}
	
	public static void  CreateMenu() {
		System.out.println("Select an option below");
		System.out.println("1. Length Conversion ");
		System.out.println("2. Temperature Conversion");
		System.out.println("3. Volume Conversion");
		System.out.println("4. Quit");
		
		Scanner scan = new Scanner(System.in);
		
		int menuSelection = scan.nextInt();
				
		
		while(menuSelection != 4) {
			
			
			switch(menuSelection) {
			case 1:
				LenCon();
				menuSelection =scan.nextInt();
				break;
			case 2:
				TemCon();
				menuSelection =scan.nextInt();
				break;
			case 3:
				VolCon();
				menuSelection =scan.nextInt();
				break;
			case 4:
				
				
				
			}
	}
		scan.close();
		
	}
	
			/*
			 * Length Conversion Method
			 */
	public static void LenCon() {
		
		System.out.println("Choose a Length Conversion");
		System.out.println("1. Yards to Inches");
		System.out.println("2. Miles to Kilometers");
		System.out.println("3. Go Back");
		
		Scanner scan = new Scanner(System.in);
		int LMenu = scan.nextInt();
		
		while(LMenu != 3) {
			
			switch(LMenu) {
			case 1:
				YartoInc();
				break;
			case 2:
				MiltoKil();
				break;
			case 3:
				
				}
			return;
		}
		
		CreateMenu();
		
	}

	/*
	 * Temperature Conversion method 
	 */
	public static void TemCon() {
		
		System.out.println("Choose a Temperature Conversion");
		System.out.println("1. Celsius to Fahrenheit");
		System.out.println("2. Fahrenheit to Kelvin");
		System.out.println("3. Go Back");
		Scanner scan = new Scanner(System.in);
		int TMenu = scan.nextInt();
		
		while(TMenu != 3) {
			
			switch(TMenu) {
			case 1:
				CelstoFah();
				break;
			case 2:
				FahtoKel();
				break;
			case 3:
				
			}
			
			return;
		}
		
		CreateMenu();		
	}
	
	/*
	 * Volume Conversion method
	 */
	
public static void VolCon() {
		
		System.out.println("Choose a Volume Conversion");
		System.out.println("1. US Gallon to Liter");
		System.out.println("2. US Gallon to Imperial Gallon");
		System.out.println("3. Go Back");
		Scanner scan = new Scanner(System.in);
		int vMenu = scan.nextInt();
		
		while(vMenu != 3) {
			
			switch(vMenu) {
			case 1:
				GaltoLit();
				break;
			case 2:
				GaltoImp();
				break;
			case 3:
				
			}
			return;
		}
		// takes user back to CreateMenu 
		CreateMenu();		
	}
	
	
	// Miles to Kilometers
	public static void MiltoKil() {
		Scanner scan = new Scanner(System.in);
		double mi, ki;
		System.out.println("Enter the Miles");
		mi=scan.nextInt();
		ki=(mi* 1.609344);
		System.out.println(ki +" Kilometers");
		return;
	}
	
	//Yards to Inches
	public static void YartoInc() {
		Scanner scan = new Scanner(System.in);
		double yar, inc;
		System.out.println("Enter the Yards");
		yar=scan.nextInt();
		inc=(yar*36);
		System.out.println(inc + " Inches");
		return;
		}
	
	// Celsius to Fahrenheit
	public static void CelstoFah() {
		Scanner scan = new Scanner(System.in);
		double cel, fah;
		System.out.println("Enter the Celsius");
		cel= scan.nextInt();
		fah= (cel *1.8) + 32;
		System.out.println(fah + " Farenheit");
		return;
		
	}
	
	//Fahrenheit to Kelvin
	public static void FahtoKel() {
		Scanner scan = new Scanner(System.in);
		double fahr, kel;
		System.out.println("Enter the Fahrenheit");
		fahr=scan.nextInt();
		kel=((fahr-32)/1.8)+273.15;
		System.out.println(kel + " Kelvin");
		return;
		
	}
	
	//Gallon to Liter
	public static void GaltoLit() {
		Scanner scan = new Scanner(System.in);
		double gal, lit;
		System.out.println("Enter the Gallons for Conversion to Liter");
		gal=scan.nextInt();
		lit= (gal * 3.785_411_784);
		System.out.println(lit +" Liters");
		return;
		
	}
	
	public static void GaltoImp() {
		Scanner scan = new Scanner(System.in);
		double gall, imp;
		System.out.println("Enter the Gallons for Conversion to Imperial");
		gall=scan.nextInt();
		imp=(gall/ 1.200_949_920_4287);
		System.out.println(imp + " Imperial Gallons");
		return;
	}
}