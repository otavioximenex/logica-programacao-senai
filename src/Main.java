import java.util.Scanner;
 class Main {

     import java.util.Scanner;


  class Main {


   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.print("Digite a base do retângulo: ");
    double baseRetangulo = scanner.nextDouble();


    System.out.print("Digite a altura do retângulo: ");
    double alturaRetangulo = scanner.nextDouble();


    double areaRetangulo = calcularAreaRetangulo(baseRetangulo, alturaRetangulo);


    System.out.println("A área do retângulo é: " + areaRetangulo);


    scanner.close();
   }


   public static double calcularAreaRetangulo(double baseRetangulo, double alturaRetangulo) {
    return baseRetangulo * alturaRetangulo;



   }