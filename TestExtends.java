public class TestExtends{
	//java为单继承，一个类中只能有一个直接父类，但可以多级继承，属性和方法逐级增加
	public static void main(String [] args){
		Dog dog=new Dog();
		dog.breed="哈士奇";
		dog.sex="公";
		dog.age=2;
		dog.furColor="black";
		dog.eat();
		dog.sleep();
		dog.shot();
		
		System.out.println(dog.breed+"\t"+dog.sex+"\t"+dog.age+"\t"+dog.furColor);
		Cat cat =new Cat();
		cat.breed="加菲猫";
		cat.sex="母";
		cat.age=3;
		cat.furColor="WHITE";
		System.out.println(cat.breed+"\t"+cat.sex+"\t"+cat.age+"\t"+cat.furColor);
		cat.sleep();
		cat.eat();
		cat.climb();
		
	}
}


class Animal{
	String breed;//品种
	String sex;//性别
	int age;//年龄
	
	public void eat(){
		System.out.println("eating......");
	}
	public void sleep(){
		System.out.println("sleeping......");
	}
	
}

class Dog extends Animal{//语法：    class 子类 extends  父类{}
	String furColor;
	public void shot(){
		System.out.println("汪汪汪......");
	}
	public void run(){
		System.out.println("噗嗤噗嗤......");
	}
}
class Cat extends Animal{
	String furColor;
	public void climb(){
		System.out.println("爬树");
	}
	
}

	

