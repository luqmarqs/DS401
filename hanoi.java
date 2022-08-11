//algoritmo recursivo para o problema classico da torre de hanoi em java
//Lucas Marques de Almeida, 11/08/2022


public class Main
{
	private static void hanoi (int qtdAnilhas, char pinoOrigem, char pinoAuxiliar, char pinoDestino) throws Exception {
		if(qtdAnilhas <= 0) throw new Exception ("Quantidade de anilhas inválida!");
		
		if( "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".indexOf(pinoOrigem)==-1)//testa se o caractere existe na String
		    throw new Exception("Pino origem inválido!");
		
		if("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".indexOf(pinoAuxiliar)==-1)
		    throw new Exception("Pino auxiliar inválido!");
		    
		if("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".indexOf(pinoDestino) ==-1)
		    throw new Exception("Pino destino inválido!");
		    
		if(pinoOrigem==pinoAuxiliar)
		    throw new Exception("Pino origem está igual ao pino auxiliar!");
		
		if(pinoOrigem==pinoDestino)
		    throw new Exception("Pino origem está igual ao pino destino!");
		
		if(pinoDestino==pinoAuxiliar)
		    throw new Exception("Pino destino está igual ao pino auxiliar!");
		    
		if(qtdAnilhas==1)
		    System.out.printf("Move de %c para %c\n", pinoOrigem, pinoDestino);
		else
	    {
	        hanoi(qtdAnilhas-1, pinoOrigem, pinoDestino, pinoAuxiliar);
	        System.out.printf("Move de %c para %c\n", pinoOrigem, pinoDestino);
	        hanoi(qtdAnilhas-1, pinoAuxiliar, pinoOrigem, pinoDestino);
	    }
		
	}
	
	public static void main(String[] args){
	    try{
	        hanoi(10, 'a', 'b', 'c');
	    }
	    catch(Exception e){}//sei que não vai dar erro pois não sou anta
	}
}
