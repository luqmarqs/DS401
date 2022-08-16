public class Main
{
    public static boolean isNegativo(int num){
        return isNegativoAux(num, num);
    }
    public static boolean isNegativoAux(int a, int d){
        if(a==0)
            return true;
        if(d==0)
            return false;
        a++;
        d--;
        return isNegativoAux(a, d);
    }

    public static int soma (int a, int b){
        if(a==0)
            return b;
        if(isNegativo(a)){
            b--;
            a++;
        }
        if(!isNegativo(a)){
            a--;
            b++;
        }
        return soma(a,b);
    }
    
    public static int subtracao(int a, int b){
        if(a==0)
            return b;
        if(isNegativo(a)){
            b++;
            a++;
        }
        if(!isNegativo(a)){
            a--;
            b--;
        }
        return subtracao(a,b);
    }
  
    public static boolean maiorQue (a, b){
        
    }
    
    public static boolean menorQue (a, b) {
        
    }
    
    public static boolean maiorIgualQue (a, b){
        
    }
    
    public static boolean menorIgualQue (a, b) {
        
    }
    
    
    
	public static void main(String[] args) {
		System.out.println(isNegativo(-5));
        System.out.println(soma(5, -3));
        System.out.println(subtracao(5, -3));

	}
}
//fazer: soma, subtracao, equidade, nao-equidade, maior que, maior igual, menor que, menor igual, multiplicacao e divisao
