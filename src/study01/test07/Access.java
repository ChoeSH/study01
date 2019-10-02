package study01.test07;

class Cat{
	private int age;	
	private String name;
	private String type;
	
	public void setAge(int age) {	//setAge() 괄호부분은 선언만 가능하고 초기화는 불가능하다.
		this.age=age;
	}
	public int getAge() {		//getAge() 메소드를 통해서 private int의 age값을 출력이 가능하다. POJO방식의 기본: getset 메소드
		return age;
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}
	public void setType(String type) {
		this.type=type ;
	}
	public String getType() {
		return type;
	}
}

public class Access {
	
	public static void main(String[] args) {
		Cat cat= new Cat();
		cat.setAge(10);		//this.age를 통해 private int의 age 값을 바꿀 수 있다.
		cat.setName("냥냥");
		cat.setType("잡종");
		System.out.println("고양이의 나이는 " +cat.getAge());
		System.out.println("고양이의 이름은 " +cat.getName());
		System.out.println("고양이의 종류는 " +cat.getType());
	
	}
}
