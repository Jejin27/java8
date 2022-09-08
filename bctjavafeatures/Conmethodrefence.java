package bctjavafeatures;
interface ConstructorInterface{
	Hello display(String say);
}
class Hello{
	Hello(String say) {
		System.out.println("good Morning guys!...."+say);
	}
}
public class Conmethodrefence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorInterface re=Hello::new;
       re.display("\nHow are you!!");
	}

}
