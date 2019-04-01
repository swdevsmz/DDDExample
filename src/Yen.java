public class Yen {

    int value;

    public Yen(){

    }

    public Yen(int value){
        this.value = value;
    }

    public int value(){
        return this.value;
    }

    public void add(Yen yen){
        this.value += yen.value();
    }
}
