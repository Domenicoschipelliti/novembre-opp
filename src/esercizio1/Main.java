package esercizio1;

public class Main {
    public static void main(String[] args) {
         Dipendente area=new Dipendente();
         System.out.println(area.lavoro("289829","produttivo"));
         area.promuovi();
         area.aggiorna(12);
    }
}