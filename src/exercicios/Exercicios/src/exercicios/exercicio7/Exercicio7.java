
package exercicios.exercicio7;

public class Exercicio7 {
   Buzon b;
    public static void main(String[] args) {    
        
        Exercicio7 a= new Exercicio7();
        Buzon r= new Buzon(a);
        Thread f= new Thread(r);
        f.start();
    }
    
}

//Programa que simule un buzón de correo (recurso compartido), de xeito que se poida leer unha mensaje ou envialo. 
//O buzón soamente pode almacear unha mensaxe, de xeito que para poder escribir débese atopar baleiro e para poder leer debe de estar cheo. 
//Crear varios fíos lectores e escritores que manexen o buzón de xeito sincronizado