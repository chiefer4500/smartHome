public class SmartHomeVerwalter {

    public static boolean schalteGeraetSicherUm(IoTDevice geraet, boolean zielStatus) {

        if (geraet == null)
            return false;

        else if (zielStatus) {
            geraet.einschalten();
            return true;
        } else {
            geraet.ausschalten();

        }
        return true;

    }
}