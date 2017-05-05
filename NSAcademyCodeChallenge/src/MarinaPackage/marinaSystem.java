package MarinaPackage;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class marinaSystem {
	
	static ArrayList <Marina> marinas = new ArrayList <Marina> ();
	static ArrayList <Boat> boats = new ArrayList <Boat> ();
	static ArrayList <Person> people = new ArrayList <Person> ();

	public static void main(String[] args) throws FileNotFoundException {
		
		fileRead();
		
		for(Boat b : boats){
			System.out.println(b.size);
		}
	}
	

	public static void assignOccupant(Boat b, Person p){	//Stage 4 - assigning a person to a boat
		b.hasOccupant(p);	//Stage 4 - in Boat class.
	}
	
	public static void fileRead(){	//Stage 5 - reading data file and converting to string.
		try{
			File f = new File ("C:\\Users\\Administrator\\Desktop\\SamTurner\\NSAcademyCodeChallenge\\stage_5_input.txt");
			Scanner sc = new Scanner (f);
			String input = "";
			while(sc.hasNextLine()){
				input += sc.nextLine() + "\n";
			}
			sc.close();
			dataExtract(input);
			System.out.println(input);	//view input String.
		} catch (FileNotFoundException e){	
		}
	}
	
	public static void dataExtract(String input){
		String [] object = input.split("\n\n"); // splits string using empty lines.
		String marinasSt = object[1]; // identifies all marinas
//		System.out.println(marinasSt);
		String boatsSt = object[3];  // identifies all boats
		//System.out.println(boatsSt);
		String peopleSt = object[5]; // identifies all people
//		System.out.println(peopleSt);
		
		String[] marinasArr = marinasSt.replace("|","&").split("&"); // splits individual marinas.
		for (int i = 0 ; i < marinasArr.length ; i++){
			String marina = marinasArr[i];
//			System.out.println(marinasArr[2]);
//			System.out.println(marina);
			String [] marinaDetails = marina.trim().split("\n");
			
			String marinaName = marinaDetails [0];
//			System.out.println(marinaName);
			String address = marinaDetails[1];
//			System.out.println(address);
			String tempCapacity = marinaDetails[2];
			int capacity = Integer.parseInt(tempCapacity);
			Marina m = new Marina (marinaName, address, capacity);
			marinas.add(m);
			
		}
		String[] boatsArr = boatsSt.replace("|", "&").split("&");
		for (int i = 0 ; i < boatsArr.length ; i++){
			String boat = boatsArr[i];
//			System.out.println(boat);
			String [] boatDetails = boat.trim().split("\n");
			String boatName = boatDetails [0];
			String countryOfOrigin = boatDetails[1];
			String tempSize = boatDetails[2];
			double size = Double.parseDouble(tempSize);
//			System.out.println(size);
			Boat b = new Boat (boatName, countryOfOrigin, size);
			boats.add(b);
		}
		String[] peopleArr = peopleSt.replace("|","&").split("&");
		for (int i = 0 ; i < peopleArr.length ; i++){
			String person = peopleArr[i];
//			System.out.println(person);
			String [] personDetails = person.trim().split("\n");
			String names = personDetails [0];
//			System.out.println(names);
			String [] nameName = names.trim().split(" ");
			String firstName = nameName[0];
//			System.out.println(firstName);
			String surname = nameName[1];
//			System.out.println(surname); 
			String dob = personDetails[1];
			String nationality = personDetails[2];
			
			if(personDetails.length == 4){
				String visaInfo = personDetails[3];
				System.out.println(visaInfo);
				Foreigner f = new Foreigner (firstName, surname, dob, nationality, visaInfo);
				people.add(f);
			}if(personDetails.length == 3){
				Person p = new Person (firstName, surname, dob, nationality);
				people.add(p);
			}
		}
		
	}
	
	
	
}
