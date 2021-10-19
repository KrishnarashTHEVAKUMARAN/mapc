/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package td2;

import td2.SystemeFichier.*;

public class App {

    public static void main(String[] args) {
        /*Exercice 2 Systeme Fichier*/
        FSFactory fsFactory = FSFactory.getInstance();
        Owner owner1 = new Owner("Sarah");
        Composant f1 = fsFactory.createComposant(ComposantType.FICHIER, "Fichier 1", owner1);
        Composant r1 = fsFactory.createComposant(ComposantType.REPERTOIRE, "Repertoire 1", owner1);
        ((Composite<Composant>)r1).addChild(f1);
        f1.appendContent("Hello World\n");
        f1.appendContent("How are you doing?");
        System.out.println("-------------------------");
        System.out.println("Exercice 2 Systeme Forum");
        System.out.println(r1);
        System.out.println(f1);
        System.out.println("-------------------------\n");

        /*Exercice 2 Systeme Forum*/

    }
}
