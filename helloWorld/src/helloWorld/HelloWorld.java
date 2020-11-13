package helloWorld;

public class HelloWorld {
	public static void main(String[] args) {
		String name = "30";//"Hong Kildong";
		name = "홍길동";
		System.out.println("My name is " + name);
		int age = 20;
		System.out.println("My age is " + age);
	    double height = 170.5;
	    System.out.println(name + " " + "height is " + height);
	    
	    name = "김다현";
	    height = 161;
	    System.out.println(name + " " + "키는" + " " + height + " " +"입니다");
	    
	    String name1 = "이혜빈";
	    int age1 = 26;
	    double height1 = 165.4;
	    
	    System.out.println(name1 + " " + "언니의" + " " + "나이는" + " " + age1 + "이고" + " " + "키는" + " " + height1 + " " +"입니다");
	    System.out.println("두 사람 나이의 합은 " + (age + age1) + " " + "이다");
	}

}