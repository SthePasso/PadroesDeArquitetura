public class ChocolateBoiler{
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoiler getInstance(){
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    // public static ChocolateBoiler getInstance(){
    //     if (uniqueInstance == null) {
    //         synchronized (ChocolateBoiler.class) {
    //             if(uniqueInstance == null) {
    //                 uniqueInstance = new ChocolateBoiler();
    //             }
    //         }
    //     }
    //     return uniqueInstance;
    // }

    public void fill(){
        if (isEmpty()){
            empty = false;
            boiled = false;
        }
    }
    public void drain(){
        if (!isEmpty() && isBoiled()){
            empty = true;
        }
    }

    public void boil(){
        if (!isEmpty() && !isBoiled()){
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }

    public void ChocolateBoilerStatus(String name){
        System.out.println("Industry: "+ name);
        System.out.println("Empty: "+ empty);
        System.out.println("Boil: "+ boiled);
        System.out.println("******************\n");
    }
}