public class TestVehicle{
	public static void main(String[] args){
		Car car=new Car();
		car.type="С����";
		car.price=50;
		car.speed=120;
		car.color="black";
		car.brand="����";
		car.run();
		
		Bus bus=new Bus();
		bus.type="������";
		bus.price=120;
		bus.speed=90;
		bus.color="��ɫ";
		bus.sitnum=55;
		bus.run();
		
		Bicycle bicycle=new Bicycle();
		bicycle.type="���г�";
		bicycle.price=1;
		bicycle.speed=30;
		bicycle.type1="ɽ�س�";
		bicycle.run();
		
	}
}


class Vehicle{
	String type;//�ͺ�
	int price;
	int speed;
	String color;
	public void run(){
		System.out.println("һ��"+type+"������"+speed+"/H���ٶ���ʻ");
	}
}

class Car extends Vehicle{
	String brand;//Ʒ��
	
}
class Bus extends Vehicle{
	int sitnum;
	
}
class Bicycle extends Vehicle{
	String type1;
}