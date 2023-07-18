import java.util.Scanner;

class ComplexNumbers{
    int a,b;
    ComplexNumbers(int a,int b){
        this.a = a;
        this.b = b;
    }
    void plus(ComplexNumbers c2){
        this.a += c2.a;
        this.b += c2.b;
    }
    void multiply(ComplexNumbers c2){
        int rl = (this.a*c2.a)-(this.b*c2.b);
        int im = (this.a*c2.b)+(this.b*c2.a);
        a = rl;
        b = im;
    }
    void print(){
        System.out.printf("%d + i%d",a,b);
    }
}
public class Complex_Number_Class{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();
		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();
		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);
		int choice = s.nextInt();
		s.close();
		if(choice == 1) {
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
}