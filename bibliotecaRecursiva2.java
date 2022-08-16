public class Main
{
    public static boolean isNegativo(int num){
        return isNegativoAux(num, num);
    }
    public static boolean isNegativoAux(int a, int d){
        if(a==0)
            return false;
        if(d==0)
            return true;
        a++;
        d--;
        return isNegativoAux(a, d);
    }
  
    
    
	public static void main(String[] args) {
		System.out.println(isNegativo(-5));
	}
}
//fazer: soma, subtracao, equidade, nao-equidade, maior que, maior igual, menor que, menor igual, multiplicacao e divisao
