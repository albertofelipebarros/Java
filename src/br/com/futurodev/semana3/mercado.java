package br.com.futurodev.semana3;

public class mercado {
    public static void main(String[] args) {
        String[] Lista = new String[10];
        Lista[0]="Arroz";
        Lista[1]="Feij�o";
        Lista[2]="Batata";
        Lista[3]="Carne";
        Lista[4]="Macarr�o";
        Lista[5]="Leite";
        Lista[6]="Azeite";
        Lista[7]="Cenoura";
        Lista[8]="Tomate";
        Lista[9]="Cerveja";
        int i = 0;
    //    while (i < Lista.length){
     //       System.out.println(Lista[i]);
      //      i++;
      //  }

       do {
           System.out.println(Lista[i]);
           i++;
       } while (i < Lista.length);
    }
}
