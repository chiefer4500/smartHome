import java.util.ArrayList;
import java.util.List;

public class SmartHomeZentrale {

    private String hausName;
    ArrayList<IoTDevice> geraeteListe = new ArrayList<>();

    public SmartHomeZentrale(String hausName) {
        this.hausName = hausName;
    }

    public void geraetHinzufuegen(IoTDevice geraet) {
        geraeteListe.add(geraet);
        System.out.println("Erfolgreich hinzugefügt!");

    }

    public ArrayList<IoTDevice> findeGeraeteNachRaum(String raum) {
        ArrayList<IoTDevice> devices = new ArrayList<>();

        for (IoTDevice device : geraeteListe) {
            if (device.getRaum() == raum) {
                devices.add(device);

            }
        }
        return devices;

    }

    public void schalteRaumEin(String raum) {

        for (IoTDevice device : geraeteListe) {
            if (device.getRaum() == raum) {
                device.einschalten();

            }
        }
    }


    public int anzahlAktiveGeraete() {
        int zaehler = 0;
        for (IoTDevice device : geraeteListe) {
            if (device.istEingeschaltet() == true) {
                zaehler++;

            }
        }
        return zaehler;
    }

    public void druckeStatusbericht() {

        for (IoTDevice device : geraeteListe) {
            System.out.println(device.getStatusDetails());
        }


    }
}


