import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person[] PersonaArray = {
                new Cat("Мурзик"),
                new Human("Адам"),
                new Robot("GX")
        };

        Barrier[] BarrierArray = {
                new Wall(2),
                new Treadmill(15000)
        };

       for(int i=0; i<BarrierArray.length; i++){
           for (int j=0; j<PersonaArray.length; j++){
               if(!PersonaArray[j].getIgnore())
                   if(!PersonaArray[j].passTheBarrier(BarrierArray[i]))
                       PersonaArray[j].setIgnore(true);

           }
       }
    }
}
