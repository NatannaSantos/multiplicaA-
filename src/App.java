public class App {
    public static void main(String[] args) {
        int number = 8;
        int[] multi = new int[10];
        System.out.println("Tabela de multiplicação de "+ number);
        for(int i=0;i<multi.length;i++){
            multi[i] = number * i;    
            System.out.println(multi[i]);                        
        }          
        
    }
    
}
