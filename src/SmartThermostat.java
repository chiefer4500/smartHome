public class SmartThermostat extends IoTDevice{
    private double zielTemperatur;
    private double aktuellerMesswert;

    public SmartThermostat(String name, String raum, double zielTemperatur, double aktuellerMesswert){
        super(name,raum);
        this.zielTemperatur=zielTemperatur;
        this.aktuellerMesswert=aktuellerMesswert;

    }

    public void setzeZielTemperatur(double temp){
        if(temp>=10.0 && temp<=30.0){
            this.aktuellerMesswert=temp;
        }


    }




@Override
    public String getStatusDetails(){

    return "Smart Thermostat [" + getName() + " im " + getRaum() + "] - Ziel-Temperatur: " + zielTemperatur + "°C | Aktuell: " + aktuellerMesswert + "°C";
}


    @Override
    public String toString() {

        return super.toString() + "\nSmart Thermostat [Ziel-Temperatur=" + zielTemperatur + "°C, Aktuell=" + aktuellerMesswert + "°C]";
    }




}
