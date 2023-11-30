package esercizio1;


public class Dipendente {
     protected static int stipendioBase;
     protected static String matricola;
     protected static int stipendio;

     private static int importoOrarioStraordinario;

    public enum Livello {
        OPERAIO,
        IMPIEGATO,
        QUADRO,
        DIRIGENTE
    }

    public enum Dipartimento {

        PRODUZIONE,
        AMMINISTRAZIONE,
        VENDITE
    }

     public  int lavoro(String matricola,String Dipartimento){
          stipendio=stipendioBase;
          importoOrarioStraordinario=30;
          Livello livello1 =  Livello.OPERAIO;

     }

     public int tuttiParametri(){
       stipendio=stipendioBase;
       importoOrarioStraordinario=30;
       Livello li=Livello.OPERAIO;
       Livello livello=Livello.IMPIEGATO;
       Livello livello2=Livello.DIRIGENTE;
       Livello livello3=Livello.QUADRO;
       Dipartimento dipa=Dipartimento.PRODUZIONE;
       Dipartimento di=Dipartimento.VENDITE;
       Dipartimento da=Dipartimento.AMMINISTRAZIONE;
        return tuttiParametri();

     }


     public static void  stampaDatiDipendente(){
         System.out.println(matricola);
         System.out.println(stipendio);
     }


}
