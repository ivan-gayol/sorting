package baldur.sorting.example;

@FunctionalInterface
interface Converter<F,T> {
	T convert(F from);
}

class Something {
	String startsWith (String s){
		String a =  String.valueOf(s.charAt(0));
		return a.toLowerCase();
	}
}

class Person {
	String firstName;
	String lastName;
	
	Person (){
		
	}
	
	Person (String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
}

interface PersonFactory <P extends Person>{	
	P create (String firstName, String lastName);	
}

interface PersonFactory2 <P extends Person>{
	P create ();
}

public class LambdaTest {

	public static void main(String[] args) {
		
		Converter<String, Integer> converter = (from)->Integer.valueOf(from);
		Integer converted = converter.convert("123");
		System.out.println("Convert from String to int with lambda expresion");
		System.out.println(converted);
		System.out.println("--------------");
		
		Converter<String, Integer> converterMethod = Integer::valueOf;
		Integer convertedMethod = converterMethod.convert("123");
		System.out.println("Convert from String to int with method");
		System.out.println(convertedMethod);
		System.out.println("--------------");
		
		Something something = new Something();
		Converter<String, String> checkStartsWith = something::startsWith;		
		System.out.println("Check first letter of String");
		System.out.println(checkStartsWith.convert("Java"));
		System.out.println("--------------");
		
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("Ivan", "Gayol");
		System.out.println("Creating a person with a factory");
		System.out.println(person.firstName + " " + person.lastName);
		System.out.println("--------------");
		
		PersonFactory2<Person> personFactory2 = Person::new;
		Person person2 = personFactory2.create();
		person2.firstName = "Pepe";
		System.out.println("Creating a person with a factory without params");
		System.out.println(person2.firstName );
		System.out.println("--------------");

	}

}
