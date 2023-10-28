package chapter3;

import java.sql.SQLException;

class MyResource implements AutoCloseable{
	
	private String msg;
	public MyResource(String msg) {
		this.msg = msg;
	}

	@Override
	public void close() throws Exception {
		System.out.println("close() : " + msg);
		
	}
	
}

public class Main_09 {
	public static void main(String[] args) {
		try(MyResource obj1 = new MyResource("obj1");MyResource obj2 = new MyResource("obj2")){
			System.out.println("tryブロック内の処理");
			throw new SQLException();
		}catch(SQLException e) {
			System.out.println("catchブロック : SQLException");
		}catch(Exception e) {
			System.out.println("catchブロック : Exception");
		}finally {
			System.out.println("finallyブロック");
		}

	}

}
