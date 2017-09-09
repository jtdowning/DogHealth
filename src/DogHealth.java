import java.util.Scanner;

public class DogHealth {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		while(true)
		{
			System.out.println("Welcome to the Dog Health Manager. Press the appropriate button for the service.");
			System.out.println("1 -> Enter Dog Details");
			System.out.println("2 -> Dog Vet");
			System.out.println("3 -> Quit");
			
			Scanner input = new Scanner (System.in);
			int choice = input.nextInt();
			
			switch (choice)
			{
			case 1: EnterDogRegister();
			case 2: DogVet();
			case 3: break;
			}
		}
	
	}
	
	public static void EnterDogRegister()
	{
		int TotalDogs;
		Dog[] DogRegister = new Dog[100];
		
		Scanner input = new Scanner (System.in);
		System.out.println("Hello, how many dogs do you have?");
		TotalDogs = input.nextInt();
		
		System.out.println("hello, please provide the dog details:");
		
		for (int i=0; i<TotalDogs; i++)
		{
			DogRegister[i] = new Dog();
		}
	
		System.out.println("There are "+TotalDogs+"  dogs in the register and here are their details");
		
		for (int i=0; i< TotalDogs; i++)
		{
			System.out.println("Dog Number:"+(i+1));
			System.out.println("Dog name:"+DogRegister[i].name);
			System.out.println("Dog age:"+DogRegister[i].age);
			System.out.println("Dog breed:"+DogRegister[i].breed);
			System.out.println();
		}
	}
	
	public static void DogVet()
	{
		System.out.println("Vet");
	}

}

	class Dog {
		String name;
		int age;
		String breed;
		String condition;
		
		public Dog()
		{
			Scanner input = new Scanner (System.in);
			
			System.out.println("Enter Dog's name:");
			name = input.next();

			System.out.println("Enter Dog's age:");
			age = input.nextInt();
			
			System.out.println("Enter Dog's breed:");
			breed = input.next();
		}
	}
	
	
	

