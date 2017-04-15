/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Nicol
 */
public class Arbol {
    private NodoArbol raiz;
     public void insertar(int num){//En el metodo insertar lo que se realiza es insertar un numero al arbol, donde por medio del metodo recursivo insertaRec donde se realiza la validacion de que lado del arbol se encuentra
        if (raiz==null) {
            raiz=new NodoArbol(num);
        }else{
            insertaRec(num,raiz);
        }
    }
    
    public void insertaRec(int num, NodoArbol n){
        /**
         * En este metodo lo que se realiza es el metodo recursivo que se llama desde el metodo insertar
         */
        if (num<n.getId()) {//Acomoda a la izquierda
            if (n.getHijoIzq()==null) {
                n.setHijoIzq(new NodoArbol(num));
            }else{
             insertaRec(num,n.getHijoIzq());         
            }
        }else{//Acomoda a la derecha
            if (n.getHijoDer()==null) {
                n.setHijoDer(new NodoArbol(num));
            }else{
             insertaRec(num,n.getHijoDer());
            }
        }
    }
    
    public void inOrden(){
    /**
     * El metodo inOrden lo que se hace es realizar como lo dice su nombre, ordena el arbol de mayor a menor  
     */
        if (raiz==null) {
            System.out.println("El arbol se encuentra vacio");
        }else{
        inOrdenRec(raiz);
        }
    }
    
    private void inOrdenRec(NodoArbol n) {
        /**
         * El metodo inOrdenRec lo que es, es un metodo recursivo donde es llamado desde el metodo inOrden para ordenar en orden
         */
        if (n != null) {
            inOrdenRec(n.getHijoIzq());
            System.out.print(n.getId()+" ");
            inOrdenRec(n.getHijoDer());
        }

    }

    public void preOrden() {
        /**
         * El metodp pre orden lo que realiza es visitar la raiz, recorre lo que es el subarbol izquierdo y despues el derecho
         * Todo esto lo realiza gracias al metodo recursivo 
         * 
         */
        if (raiz == null) {
            System.out.println("El arbol se encuentra vacio");
        } else {
            preOrdenRec(raiz);
        }
    }
    
    
    private void preOrdenRec(NodoArbol n) {
        /**
         * Este es el metodo que utiliza el metodo preOrden
         */
        if (n != null) {
            System.out.print(n.getId()+"  ");
            preOrdenRec(n.getHijoIzq());
            preOrdenRec(n.getHijoDer());
            
        }

    }

    public void postOrden() {
        /**
         * El metodo postOrden lo que se realiza es recorrerel subarbol izquierdo, despues pasa por el subarbol derechoy por ultimo visita la raiz
         * Esto es gracias al metodo recursivo postOrdenRec
         */
        if (raiz == null) {
            System.out.println("El arbol se encuentra vacio");
        } else {
            postOrdenRec(raiz);

        }

    }
    
    
    private void postOrdenRec(NodoArbol num) {
        /**
         * Con este metodo se realiza la recursividad para poder imprimir de la forma establecida en el metodo postOrden
         */
        if (num != null) {
            preOrdenRec(num.getHijoIzq());
            preOrdenRec(num.getHijoDer());
            System.out.print(num.getId()+"  ");
        }

    }
    
    public void imprimeMenor(){
        /***
         * El metodo imprime menor lo que se realiza es imprimir el menor del arbol
         * Gracias al metodo imprimeMenorRec
         */
        if (raiz==null) {
            System.out.println("El arbol se encuentra vacio");
        }else{
         imprimeMenorRec(raiz);
        }
    }
    
    private void imprimeMenorRec(NodoArbol num) {
        /**
         * Este es el metodo que es llamado desde el metodo imprimeMenor para poder imprimir el menor del arbol
         */
        if (num.getHijoIzq() != null) {
            imprimeMenorRec(num.getHijoIzq());
        } else {
            System.out.println(num.getId());
        }

    }
    
    
    public void imprimeHojas(){
    /**
     * Con el metodo imprimeHojas imprime todos los nodos que no poseen hijos, esto es gracias metodo rtecursivo imprimeHojasRec
     */
        if (raiz==null) {
            System.out.println("No existe");
        }else{
        imprimeHojasRec(raiz);
        }
    }

    private void imprimeHojasRec(NodoArbol num) {
        /**
         * El metodo imprimeHojasRec lo que se realiza es imprimir los nodos que no poseen hijos
         * por medio de las dos condiciones que se estan realizadas dentro del metodo
         * Por que a la hora de preguntar un si un hijo es diferente de null y si es verdadero significa que no tiene hijos
         */
        if (num.getHijoIzq() != null) {
            imprimeHojasRec(num.getHijoIzq());
            if (num.getHijoDer() != null) {
                imprimeHojasRec(num.getHijoDer());
            }
        } else {
            System.out.println(num.getId());
        }
    }

    public void imprimeNivel(int num){
    /**
     * 
     */
        if (raiz==null) {
            System.out.println("No existe");
        }else{
            getNivelRec(num,raiz);
           
        }
        }
    
    private void getNivelRec(int num, NodoArbol n){
        if (num==0){
            System.out.println(n);
        }else{
            if(num==1){
                System.out.println(n.getHijoDer());
                System.out.println(n.getHijoIzq());
                
            }
        }
    
    }
    public void getAltura(){
        /**
         * Con el metodo imprime altura lo que realiza es que inprime la altura total del arbol por medio de un metodo recursiov
         * llamado imprimeAlturaRec
         */
      
        if (raiz==null) {
            System.out.println("no existe raiz");
        }else{
        int altura=imprimeAlturaRec(raiz);
            System.out.println("La altura del arbol es: "+altura);
        }
    }
    private int imprimeAlturaRec(NodoArbol num){
        /**
         * En el metodo imprimeAlturaRec es el metodo recursivo que se utiliza para poder conocer la altura del arbol.
         * se utiliza un contador llamado altura que es el encargado de llevar la cuenta de la altura total del arbol para asi
         * al final retornar ese valor en el metodo imprimeAltura 
         */
        int altura = 0;

        if (num != null) {
            int alturaIzquierda = imprimeAlturaRec(num.getHijoIzq());
            int alturaDerecha = imprimeAlturaRec(num.getHijoDer());

            if (alturaIzquierda > alturaDerecha) {
                altura = alturaIzquierda + 1;
            } else {
                altura = alturaDerecha + 1;
            }
        }

        return altura;
    }
    
    public void cuentaNodoArbols(){
      /**
       * El metodo cuentaNodoArbols es encargado de contar la cantidad de NodoArbols que se poseen en el arbol
       * Todo esto es gracias al metodo recursivo cuentaNodoArbolsRec que por donde se recorren todos los nodos 
       * donde hay un contador que lleva la cuenta de los nodos acumulandolos en una variable
       */
        if (raiz==null) {
            System.out.println("No existe");
        }else{
          
         int contador=cuentaNodosRec(raiz);
            System.out.println("El total de nodos son: "+contador);
        }
    }
    
    private int cuentaNodosRec(NodoArbol num){
        /**
         * Este es el metodo recursivo que se utiliza para poder recorrer todos los Nodos, y llevar la cuenta de cada uno
         */
    int total=0;
        if (num!=null) {
       int totalNodoIzq=  cuentaNodosRec(num.getHijoIzq());
        int totalNodDer= cuentaNodosRec(num.getHijoDer());
        total=totalNodoIzq+totalNodDer+1;
        }
        return total;
    }
    
    
    public void imprimeRamaLarga(){
        /**
         * El metodo imprime ramalarga esta realizado con la finalidad de poder imprimir el rama mas larga 
         * recorriendo la misma e imprimeindola gracias al metodo imprimeRamaLargaRec
         */
        if (raiz==null) {
            System.out.println("No existe"); 
        }else{
        imprimeRamaLargaRec(raiz);
        }
    }
    private void imprimeRamaLargaRec(NodoArbol num){
        /**
         * Este es el metodo recusrsivo que se utiliza para poder recorrer la rama mas larga e imprimirla
         */
        if (num!=null) {
         System.out.println(num.getId());
         imprimeRamaLargaRec(num.getHijoDer());
            if (num.getHijoDer()==null) {
         imprimeRamaLargaRec(num.getHijoIzq());
            }
        }
    }
}

