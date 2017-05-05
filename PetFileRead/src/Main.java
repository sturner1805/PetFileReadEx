
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
//edit edit edit edit

public class Main {
	
	static ArrayList<Person> personList = new ArrayList<Person>();
	static ArrayList<Animal> animalList = new ArrayList<Animal>();
	
	public static void main(String[]args){
		fileRead();
		assignPet(Gareth, Cosmo);
			}

	private static void fileRead(){
		try{
			File x = new File ("C:\\Users\\Administrator\\Desktop\\eclipse\\exData.txt");
			Scanner sc = new Scanner(x);
			String input  = "";
			while(sc.hasNext()){
				input += sc.nextLine() + "\n";
			}
			sc.close();		
			
			peopleExtractor(input);
			animalExtractor(input);
			//assignPet(p,a);
			for (Animal a : animalList){
				System.out.println(a.getPetName());
				System.out.println(a.getspecies());
			}
			personList.get(0);
			

		}catch(Exception e){
		}

	}
	
	public static void assignPet(Person p, Animal a){
		p.ownPet(a);
	}
	
	public static void peopleExtractor(String input){
		String[] group = input.split("&");
		String people = group[0];
		
		String[] person = people.split("%");
		for(int i=0 ; i < person.length ; i++){
			String personDetails = person[i];
			String[] individual = personDetails.trim().split("\n");
			String name = individual[0];
			String dob = individual[1];
			String job = individual[2];
			String tempSalary = individual[3];
			tempSalary = tempSalary.replace("£","").replace("Â", "");
			int salary = Integer.parseInt(tempSalary);
			Person p = new Person (name, dob, job, salary);
			personList.add(p);
		}
	}
	
	public static void animalExtractor(String input){
		String[] group = input.split("&");
		String animals = group[1];
		
		String[] animal = animals.split("%");
		for(int i=0 ; i < animal.length ; i++){
			String animalDetails = animal[i];
			String[] individual = animalDetails.trim().split("\n");
			String name = individual[0];
			String species = individual[1];
			Animal a = new Animal (name, species);
			animalList.add(a);
		}
	}
	
//	public static void petAssignment(String person, String pet){
//		int i;
//		int j;
//		Person owner = personList.get(i);
//		Animal owned = animalList.get(j);
//		if (i == 0){
//			j = 
//		}
//	}
}