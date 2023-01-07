import java.util.*;

public class App {
    private List lista ;
    private int initialinfo=0;
    private int info=10;
    private  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
       App list = new App();
        list.menu();
    }

    public void menu(){
        int opcion=0;
        do{
        System.out.println("Escoja una opcion");
        System.out.println("opcion1: Crear lista");
        System.out.println("opcion2: Agregar primer elemento");
        System.out.println("opcion3: Agregar ultimo elemento");
        System.out.println("opcion4: Borrar primer elemento");
        System.out.println("opcion5: Borrar ultimo elemento");
        System.out.println("opcion6: imprimir ");
        System.out.println("opcion7: Buscar");
        System.out.println("opcion8: Salir");
        opcion = sc.nextInt();
            switch(opcion){
                case 1: 
                    this.createList();
                    break;
                case 2:
                    this.unshiftNode();
                    break;
                case 3:
                    this.pushNode();
                    break;
                case 4:
                    this.shifNode();
                    break;
                case 5:
                    this.popNode();
                    break;
                case 6:
                    System.out.println(this.lista.print()); 
                    break;
                case 7:
                    this.searchNode();
                    break;
                default:
                 System.out.println("chao");
                 break;
            }
        }while(opcion!=8);
    }
    public void unshiftNode(){
        this.lista.unshift(initialinfo);
        --initialinfo;
        System.out.println(this.lista.print());
    }

    public void pushNode(){
        info++;
        this.lista.push(info);
        System.out.println(this.lista.print());
    }

    public void createList(){
        this.lista = new List();
        for( int a = 1; a<= 10;a++){
            this.lista.push(a);
            System.out.print(this.lista.print());
        }
        
    }

    public void searchNode(){
        int n= 0;
        System.out.println("digita el numero a buscar");
        n= sc.nextInt();
        if(this.lista.search(n)){
            System.out.println("valor encontrado");
        }else{
            System.out.println("valor no encontrado");
        }
        System.out.println(this.lista.print());
    }

    public void shifNode(){
        if(this.lista.shift()){
            System.out.println("nodo eliminado");
        }else{
            System.out.println("valor no encontrado");
        }
        System.out.println(this.lista.print());
    }

    public void popNode(){
        if(this.lista.pop()){
            System.out.println("nodo eliminado");
        }else{
            System.out.println("valor no encontrado");
        }
        System.out.println(this.lista.print());
    }
}
