
public class vetor2 {
public static void main(String[] args) {
import java.util
	
java.util.Scanner Entrada = new Scanner (System.in);	

    final int TAM = 10;
	int vetor a[], b[], c[];  
	
	a = new int[TAM];
	b = new int[TAM];
	c = new int[TAM];
	
	for(vetor=0; vetor<TAM; i++) {
		
		System.out.println("Digite os valores: ");
		a[vetor] = Entrada.nextInt();
		
		System.out.println("Digite os demais valores:");
		b[vetor] = Entrada.nextInt();
		
		c[vetor] = a[vetor] + b[vetor];
		
	for(vetor=0; vetor<TAM; vetor++) {
			
			System.out.println("Os valores somados são: "+c[vetor]);
			
	}
	}
	}

}
