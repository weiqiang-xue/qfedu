public class TestVehicle{
	public static void main(String[] args){
		Car car=new Car();
		car.type="小汽车";
		car.price=50;
		car.speed=120;
		car.color="black";
		car.brand="奔驰";
		car.run();
		
		Bus bus=new Bus();
		bus.type="公交车";
		bus.price=120;
		bus.speed=90;
		bus.color="白色";
		bus.sitnum=55;
		bus.run();
		
		Bicycle bicycle=new Bicycle();
		bicycle.type="自行车";
		bicycle.price=1;
		bicycle.speed=30;
		bicycle.type1="山地车";
		bicycle.run();
		
	}
}


class Vehicle{
	String type;//型号
	int price;
	int speed;
	String color;
	public void run(){
		System.out.println("一辆"+type+"正在以"+speed+"/H的速度行驶");
	}
}

class Car extends Vehicle{
	String brand;//品牌
	
}
class Bus extends Vehicle{
	int sitnum;
	
}
class Bicycle extends Vehicle{
	String type1;
}