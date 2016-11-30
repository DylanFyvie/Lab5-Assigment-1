import java.util.Scanner;

/**
 * 
 */

/**
 * @author d.fyvie
 *
 */
/**

*

* Name: Dylan Fyvie

* Teacher: Mr.Hardman

* Assignment #5, Program #a

* Date Last Modified: 11/24/2016

*

*/

public class Stan_Smyl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int[] myArray={13, 17, 20, 2, 6, 8, -3, 10};
		int index = -1;
		int minimum ;
		int userValue;
		//to iterate through an array, we use a for loop
		//i is the current index we are looking at in the array
		//i will search through every element in the array
		//because i will continue until it is as large as the length
		// of the array
		
		for(int i = 0; i < myArray.length; i++){
			
			//this will display all values
			System.out.print(myArray[i] + "    ");
		}
		
		// this code gets the value you want to search from the user
		System.out.println();
		System.out.println("What value do you want the index of ?");
		userValue = userInput.nextInt();
		
		//to search for something, i need to look at every element 
		//of the array. this is accomplished y looping through all
		//the elements
		for(int i = 0; i < myArray.length; i++){
			if(myArray[i]==userValue){
				index = i;
			}
		}
		if(index == -1){
			System.out.println("This is not in the array");
		}else {
			System.out.println(userValue + "is at index" + index);
		}
		
		/**
		 * finding the minimum value in a array
		 */
		minimum = myArray[0];
		for(int i = 0; i< myArray.length;i ++){
			//checks whether the current element is less than minimum
			if(myArray[i] < minimum){
				//if yes, change minimum to the current element
				minimum = myArray[i];
				
			}
		}
		System.out.println("The minimum value is:" + minimum);
		
		
		userInput.close();
		
		
		
		
	}

}
