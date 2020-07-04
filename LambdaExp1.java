// Lambda Expression with Multiple Parameter
public interface LambdaExp1 {
	int add(int a,int b);
}
class TestLambdaExp{
	public static void main(String[] args) {
	LambdaExp1 e=(a,b)->(a+b);
	System.out.println(e.add(5,5));
	}
}
//Output
// 10
