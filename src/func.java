import java.util.Scanner;
public class func {
		
	static int mayor(int numero1, int numero2){
		if (numero1>numero2) {
			System.out.println("el numero mayor es :" +numero1);
			return numero1;			
		}else if (numero2>numero1){
			System.out.println("el numero mayor es :" +numero2);
			return numero2;
		}  else{
			System.out.println("Los numeros son iguales");
			return 0;
		}
	}
	
	static double Promedio(double nota1, double nota2, double nota3){
		double resultado=((nota1+nota2+nota3)/3);
	
		return resultado;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mi_escaner= new Scanner(System.in);
		
		/*System.out.print("nota #1:");
		double nota1 = mi_escaner.nextDouble();
		System.out.print("nota #2:");
		double nota2= mi_escaner.nextDouble();
		System.out.print("nota #3:");
		double nota3= mi_escaner.nextDouble();
		System.out.print("el promedio es: "+ Promedio(nota1,nota2,nota3));
	*/
		System.out.println("Numero 1:");
		int num1= mi_escaner.nextInt();
		System.out.println("Numero 2:");
		int num2= mi_escaner.nextInt();
		mayor(num1,num2);
		
		
		}

}
