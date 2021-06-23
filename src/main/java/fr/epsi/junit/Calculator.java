package fr.epsi.junit;

public class Calculator {

    public static int add(int a, int b){
        return a + b;
    }

    public static int multi(int a, int b){
        return a * b;
    }

    public static int substract(int a, int b){
        return a / b;
    }

    public static int div(int a, int b){
        return a/b;
    }

  /*  public int add(int[] nmbers){
        return 0;
    }

   */


// méthode de calcul d'un ligne de tableau
    public int add(int[] nmbers){
        int resultat = 0;
        // je commence avec la variable Resultat=0
        for (int i = 0; i < nmbers.length; i++) {
//  pour chaque position (index) , j'incrémente de 1 et ajoute la case plus la suivante
              resultat = resultat + nmbers[i];
// je boucle
        }
        return resultat;
// j'affiche les résultats
    }
}
