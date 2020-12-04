
public class vetor4 {
public static void main(String[] args) {
	
    final int TAM = 10;
	int vetor a[], b[];  
	
	a = new int[TAM];
	b = new int[TAM];
	
	for(vetor=0; vetor<TAM; i++) {
		
		System.out.println("Digite os valores: ");
		
		a[vetor] = Entrada.nextInt();
		
		b[vetor] = a[(vetor+vetor)/vetor];
		
		for(vetor=0; vetor<TAM; vetor++) {
			
			System.out.println("A média dos valores é:"+b[vetor]);
			
	}
	}
	}

}
