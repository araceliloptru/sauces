import java.util.Scanner;
public class Ej1Hoja8{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(Syste.in);
						
			for(int i=1;i<=5;i++) {
				escribirTabla(i);
			}
	}
		private static void escribirTabla(int i){
			for (int j=1;j<=10;j++) {
					System.out.println(i+"*"+j+"="+(i*j));
				}
		}
}
