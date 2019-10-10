package study01.test11;

public class Excute {

	public static void main(String[] args) {
		Remote r =new TvRemocon();	//인터페이스 Remote는 데이터타입으로는 사용할 수 있다.
		r.on();  
		Remote r2=new AirconRemocon();
		r2.on();
	}

}
