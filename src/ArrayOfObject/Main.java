package ArrayOfObject;

public class Main {

	public static void main(String[] args) {
		Food[] ArrayOfObject=new Food[3];
		Food food1=new Food("Pizza");
		Food food2=new Food("Wadaopaw");
		Food food3=new Food("Sandwich");
		ArrayOfObject[0]=food1;
		ArrayOfObject[1]=food2;
		ArrayOfObject[2]=food3;
		System.out.println(ArrayOfObject[0].name);
		System.out.println(ArrayOfObject[1].name);
		System.out.println(ArrayOfObject[2].name);

	}

}
