public class Industry{
    public static void main(String args[]){
        ChocolateBoiler florybal = ChocolateBoiler.getInstance();
        florybal.ChocolateBoilerStatus("Florybal");
        florybal.fill();
        florybal.ChocolateBoilerStatus("Florybal");
        florybal.boil();
        florybal.ChocolateBoilerStatus("Florybal");
        florybal.drain();
        florybal.ChocolateBoilerStatus("Florybal");

        ChocolateBoiler gramadoWay = ChocolateBoiler.getInstance();
        gramadoWay.ChocolateBoilerStatus("Gramado Way");
        gramadoWay.fill();
        gramadoWay.ChocolateBoilerStatus("Gramado Way");

        //ChocolateBoiler caracol = ChocolateBoiler.getInstance();
        //Empty: true Boil: false
    }
}