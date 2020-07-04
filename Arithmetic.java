// Lambda Expression
public interface Arithmetic {
	
	void calculate(int x);

}
class Operation{
	public static void main(String[] args) { 
		Arithmetic a=(int x)-> System.out.println(2*x);
		a.calculate(5);
	}
	
}
//Output 10
