
public class Ejercicio5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int alturas[]={9,5,7,9,6,2,3,4,8,1,10};
        int mediaAlturas=0;
        int SuperiorMedia=0;
        int MenorMedia=0;
        int TotalAlturas=0;

        for(int i=0;i<alturas.length;i++){
            TotalAlturas=TotalAlturas+alturas[i];

        }
        mediaAlturas=TotalAlturas/alturas.length;

        for (int i=0;i<alturas.length;i++){
            if(alturas[i]>mediaAlturas){
                SuperiorMedia++;

            }
            else if(alturas[i]<mediaAlturas){

                MenorMedia++;

            }


        }
        System.out.println("La media de alturas es de "+mediaAlturas);
        System.out.println("Hay "+SuperiorMedia+" alturas superiores a la media");
        System.out.println("Hay "+MenorMedia+" alturas inferiores a la media");



    }

}