import java.util.Scanner;
import java.util.SortedMap;

public abstract class IoTDevice implements steuerbar {
 Scanner scanner=new Scanner(System.in);
    private int geraeteTd;
    private static int naeschteTd = 5000;
    private String name;
    private String raum;
    private boolean eingeschaltet;

    public IoTDevice(String name, String raum) {
        this.geraeteTd = naeschteTd;//wird automatisch erzeugt
        this.name = name;
        this.raum = raum;
        this.eingeschaltet = false;
        naeschteTd++;
    }

    @Override
    public  boolean istEingeschaltet() {

        return false;
    }

    @Override
    public void ausschalten() {
this.eingeschaltet=false;

    }

    @Override
    public void einschalten() {
this.eingeschaltet=true;
    }
    public String getName() { return name; }
    public String getRaum() { return raum; }
    public int getGeraeteId() { return geraeteTd; }

    public abstract String getStatusDetails();//ohne implemenieren ,soll aber in dem Unterklasse die von dieser Klasee verebt.

    @Override
    public String toString() {
        return "IoTDevice [ID=" + geraeteId + ", Name=" + name + ", Raum="  + raum + ", An=" + eingeschaltet + "]";
    }
}