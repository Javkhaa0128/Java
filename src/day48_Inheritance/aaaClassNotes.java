package day48_Inheritance;

public class aaaClassNotes {
}
/*
08/30/2020
Topic: OOP Inheritance Intro
		IS A vs Has A relation

package name: day48_Inheritance

WarmUp tasks:
	create costum class called BankAccount for Bank of America
			public variables:  bankName, firstName, lastName
	 		private variables: accountHolder, accountNumber, balance

	 		encapsulate all the private data
	 				(DO NOT USE SHORTCUT)

	 		create a constructor that can initialize firstName and lastName
	 				(DO NOT USE SHORTCUT)

	 		action:
	 				deposit
	 				withdraw
	 				availableBalance


Canvas -> Java -> module -> day48 -> constructor' short quiz
		due by 11:45pm


Inheritance: building relationships between the classes
			 super(Parent) & sub(child) classes ======> IS A relation

			 easiest & fastest way to get rich

			 sub class (child): can inherit methods & variables from super class (visible once only)
			 					constructor cannot be inherited


 			 super (parent): cannot inherit anything from child


 			 advantages:  improves re-usabilities
 			 			  easy to maintain


			  one class can ONLY extend one class
			  one class can be extended by multiple class

			  super class cannot extend its sub class



IS A relation:	inherited relations between classes

	class Animal{

	}

	class dog extends Animal{

	}

	Dog IS An Animal


Has A relation:

		class Engine{

		}

		class Car{

			Engine obj = new Engine();
		}

		Car Has An Engine



Employee Task:
		1. super class: Employee
					variables: salary, name, id, jobTitle, gender
					methods: setInfo, toString


		2. Sub classes:
					2.1 Tester:
							variables:  salary, name, id, jobTitle, gender
								add a constructor that can set the fields
							methods: fundingBugs, setInfo, toString

					2.2 Developer:
							variables:  salary, name, id, jobTitle, gender
								add a constructor that can set the fields
							methods: fixingBugs, setInfo, toString


Device Task:
		1. create a class called Device
					attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize,
					methods: setInfo, toString

		2. create a sub class of Device called TV:
					attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize, RemoteControl
					methods: watch, setInfo, toString

					add a constructor that can set the fileds

		3. create a sub class of device called phone:
					attributes: brand, model, price, MadeIn, screenSize, hasBattery, hasMemory, hasSimCard, OS
					methods: call, text, setInfo, toString

					add a constructor that can set the fileds

		4. create a sub class of Device called Laptop:
					attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize, hasCPU, hasMouse, hasKeyBoard, OS
					methods: coding, watching, setInfo, toString

					add a constructor that can set the fileds








 */