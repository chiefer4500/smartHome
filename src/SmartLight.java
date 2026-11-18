public class SmartLight extends IoTDevice{
    private int helligkeit;
private String farbe;


 public SmartLight(String name, String raum, int helligkeit, String farbe) {

        super(name, raum);
        this.farbe = farbe;
        this.helligkeit = 100;
    }

    public void dimmen( int newHelligkeit){
        if (newHelligkeit >= 0 && newHelligkeit <= 100) {
            this.helligkeit = newHelligkeit;
        }
    }



    @Override
    public String getStatusDetails(){
        return "Smart Light [" + getName() + " im " + getRaum() + "] - Helligkeit: " + helligkeit + "% | Farbe: " + farbe;//die Ruekwerte kommen aus die Setter-Methode.


    }

    @Override
    public String toString() {
        return super.toString() + "\nSmart Light [Helligkeit=" + helligkeit + ", Farbe=" + farbe + "]";
    }
}
