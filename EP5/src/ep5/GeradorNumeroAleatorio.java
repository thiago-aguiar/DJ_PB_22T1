package ep5;

public class GeradorNumeroAleatorio {
    
    public int min;
    public int max;
    
    // new GeradorNumeroAleatorio(6, 1);
    private GeradorNumeroAleatorio(int min, int max){
        this.min = Math.min(min, max);
        this.max = Math.max(min, max);
    }
    
    public static GeradorNumeroAleatorio entre(int min, int max){
        return new GeradorNumeroAleatorio(min, max);
    }
    
    public static GeradorNumeroAleatorio maiorQue(int min){
        return new GeradorNumeroAleatorio(min, Integer.MAX_VALUE);
    }
    
    public static GeradorNumeroAleatorio menorQue(int max){
        return new GeradorNumeroAleatorio(0, max);
    }
    // new GeradorNumeroAleatorio(100);
//    public GeradorNumeroAleatorio(int min){
//        this.min = min; // Math.min(min, max);
//        this.max = Integer.MAX_VALUE;
//    }
    
//    public GeradorNumeroAleatorio(int max){
//        this.min = 0; // Math.min(min, max);
//        this.max = max;
//    }
//    
}
