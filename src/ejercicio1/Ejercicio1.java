
package ejercicio1;

public class Ejercicio1 extends Thread{
    
    public Ejercicio1(String str){
        super(str);
    }
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(i+" "+getName());
            try{
            System.out.println("Esperando tiempo en sleep");
            Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println("Fio interrumpido");
            }
            
        }System.out.println("Termina o thread "+getName());
    }

    public static void main(String[] args) {
     
        new Ejercicio1("Pepe").start();
        new Ejercicio1("Juan").start();
        System.out.println("Termina thread main");
        
       
    /*public void run(){
        for (int i=0;i<10;i++){
        try{
            System.out.println("Esperando a recibir dato");
            Thread.sleep(500);
        }catch(InterruptedException e){
            System.out.println("Fio interrumpido");
            return;
        }
    }
        System.out.println("Fio finalizado correctamente");
    }
      */  
        
        
    }
    
}
