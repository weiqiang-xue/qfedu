public class TestExtends{
	//javaΪ���̳У�һ������ֻ����һ��ֱ�Ӹ��࣬�����Զ༶�̳У����Ժͷ���������
	public static void main(String [] args){
		Dog dog=new Dog();
		dog.breed="��ʿ��";
		dog.sex="��";
		dog.age=2;
		dog.furColor="black";
		dog.eat();
		dog.sleep();
		dog.shot();
		
		System.out.println(dog.breed+"\t"+dog.sex+"\t"+dog.age+"\t"+dog.furColor);
		Cat cat =new Cat();
		cat.breed="�ӷ�è";
		cat.sex="ĸ";
		cat.age=3;
		cat.furColor="WHITE";
		System.out.println(cat.breed+"\t"+cat.sex+"\t"+cat.age+"\t"+cat.furColor);
		cat.sleep();
		cat.eat();
		cat.climb();
		
	}
}


class Animal{
	String breed;//Ʒ��
	String sex;//�Ա�
	int age;//����
	
	public void eat(){
		System.out.println("eating......");
	}
	public void sleep(){
		System.out.println("sleeping......");
	}
	
}

class Dog extends Animal{//�﷨��    class ���� extends  ����{}
	String furColor;
	public void shot(){
		System.out.println("������......");
	}
	public void run(){
		System.out.println("��������......");
	}
}
class Cat extends Animal{
	String furColor;
	public void climb(){
		System.out.println("����");
	}
	
}

	

