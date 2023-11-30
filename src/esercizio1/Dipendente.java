package esercizio1;


public class Dipendente {
     public static double stipendioBase=1000;
     protected static String matricola;
     protected static double stipendio;

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

     public  double lavoro(String matricola,String Dipartimento){
          stipendio=stipendioBase;
          importoOrarioStraordinario=30;
          String mat=matricola;
          String di=Dipartimento;
          System.out.println("Sarai la matricola  "+ mat);
          System.out.println("Lavorerai nel dipartimento  " + di);
          Livello livello1 =  Livello.OPERAIO;
          System.out.println("Partirà da grado  "+ livello1);
          System.out.println("Per ogni straordinario piglia  " + importoOrarioStraordinario + "  Euro"  );
          return stipendio;

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

     public Livello promuovi(){
        Livello impiegato=Livello.IMPIEGATO;
        if (Livello.OPERAIO!=impiegato){
           System.out.println("complimenti sei stato promosso ad  "+ Livello.IMPIEGATO);
        }else {
            System.out.println("niente");
        }

        return impiegato; //meglio uno switch



     }



     public float aggiorna(float i){
         Livello impiegato=Livello.IMPIEGATO;



         if (impiegato==Livello.IMPIEGATO){
           System.out.println(stipendioBase*i);
         }else {
             System.out.println("nada");
         }
         return i;
     }




}
