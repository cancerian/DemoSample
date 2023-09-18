package objectTutorial;

public class Main {

	public static void main(String[] args) {
		Garage garage=new Garage();
		
		Car car1=new Car("BMW");
		Car car2=new Car("Tesla");
		Car car3=new Car("Audi");
		garage.park1(car1);
		garage.park1(car2);
		garage.park1(car3);
		Bicycle bicycle1=new Bicycle("Hero");
		Bicycle bicycle2=new Bicycle("BSA SLR");
		garage.park2(bicycle1);
		garage.park2(bicycle2);

	}

}
