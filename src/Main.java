public class Main {
    public static void main(String[] args) {
        // Erstellung mit korrigierter Parameterreihenfolge (Name, Raum, spezifische Werte)
        SmartLight smartLight1 = new SmartLight("Deckenlicht", "Flur", 100, "Weiss");
        SmartLight smartLight2 = new SmartLight("Ofenlicht", "Kueche", 100, "Weiss");

        SmartThermostat smartThermostat1 = new SmartThermostat("Heizung", "Bad", 21.0, 19.5);
        SmartThermostat smartThermostat2 = new SmartThermostat("Heizung", "Wohnzimmer", 22.0, 20.0);

        SmartHomeZentrale smartHomeZentrale = new SmartHomeZentrale("Mein Smart Home");

        // Nutzung der dafür vorgesehenen Methode statt .geraeteListe.add(...)
        smartHomeZentrale.geraetHinzufuegen(smartLight1);
        smartHomeZentrale.geraetHinzufuegen(smartLight2);
        smartHomeZentrale.geraetHinzufuegen(smartThermostat1);
        smartHomeZentrale.geraetHinzufuegen(smartThermostat2);

        // Geräte einschalten und dimmen
        smartLight1.einschalten();
        smartLight1.dimmen(25);

        smartLight2.einschalten();
        smartLight2.dimmen(34);

        smartThermostat1.einschalten();

        // Statusbericht ausgeben
        smartHomeZentrale.druckeStatusbericht();

        System.out.println("Anzahl aktiver Geraete: " + smartHomeZentrale.anzahlAktiveGeraete());
    }
}