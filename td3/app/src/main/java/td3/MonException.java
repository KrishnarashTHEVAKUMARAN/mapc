package td3;

public class MonException extends Exception {
    String message = "Client introuvable";

    public MonException(String erreur) {
        this.message = erreur;
    }
}