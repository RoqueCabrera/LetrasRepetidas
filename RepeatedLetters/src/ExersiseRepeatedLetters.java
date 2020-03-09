//FASE 1

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class ExersiseRepeatedLetters {

	public static void main(String[] args) {
		

//Crea una tabla (char[]) con tu nombre en el cual cada posición corresponda a una letra.	
		
		char [] myName = {'R', 'O', 'Q', 'U', 'E'};
		System.out.println(myName);
		

		
System.out.println(" ");
		

//Haz un bucle que recorra esta tabla y muestre por consola cada una de las letras.
		
		
		for (char el : myName) {
		    System.out.println(el);
		}
		
		
System.out.println(" ");


//FASE 2
//Cambia la tabla por una lista (List<Character>)
		
		
		ArrayList<String> myNameList = new ArrayList<String>();
		for (char el : myName) {
			String test = String.valueOf (el);
			//System.out.println(test);
			myNameList.add(test);
		}
		
	    System.out.println(myNameList);


System.out.println(" ");

//En el bucle, si la letra es una vocal imprime en la consola: ‘VOCAL’. Si no, imprime: ‘CONSONTANT’.

	
		for (String test : myNameList ) {
			if(test.contains("A") || test.contains("E") || test.contains("I") || test.contains("O")
					|| test.contains("U")){
				System.out.println("VOCAL");
				
				
			}else{
				System.out.println("CONSONANT");
			}
		}
			
			
			
			
		
System.out.println(" ");

//Si encuentras un número, muestra por pantalla: ‘Los nombres de persones no contienen números!’.
		

		for (String test: myNameList) {
			if (test.contains("0") || test.contains("1") || test.contains("2") || test.contains("3") || test.contains("4") || test.contains("5") || test.contains("6")
					|| test.contains("7") || test.contains("8") || test.contains("9")){
				System.out.println ("People´s names do not contain numbers!");
			}
		}
	
		



System.out.println(" ");

				
//FASE 3
//Almacenar en un Mapa tanto las letras de la lista como el número de veces que aparecen.
				
		Map<String, Integer> mapaList = new HashMap<String, Integer>();
		mapaList.put("R", 1);
		mapaList.put("O", 1);
		mapaList.put("Q", 1);		
		mapaList.put("U", 1);		
		mapaList.put("E", 1);		

		
System.out.println(" ");

		
//FASE 4
//Crea otra lista con tu apellido donde cada posición corresponda a una letra.
		
	ArrayList<String> lastname = new ArrayList<String>();
	lastname.add("C");
	lastname.add("A");
	lastname.add("B");
	lastname.add("R");
	lastname.add("E");
	lastname.add("R");
	lastname.add("A");
    
	System.out.println(lastname);
				

    
System.out.println(" ");

//Fusiona les dos listas en una sola. Además, añade una posición con un espacio vacío entre la primera y la segunda. 
//És decir, partimos de la lista "name" y "surname" y al acabar la ejecución solo tendremos una que se llamará fullName.


		
		ArrayList<String> fullName = new ArrayList<String>();
	    fullName.add(myNameList + " " + lastname);
	   
	    System.out.println(fullName);
		
		
		
		
		
		
		
		
	}

}
