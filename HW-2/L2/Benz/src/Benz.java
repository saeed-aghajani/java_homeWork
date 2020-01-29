public class Benz {
    String model;
    String color;
    String type;
    double topSpeed;
    double price;
    Benz(String model,String color,String type, double price, double topSpeed){
        this.color=color;
        this.model=model;
        this.price=price;
        this.type=type;
        this.topSpeed=topSpeed;
    }
    public  void print(){
        System.out.println("\nmodel= "+model
        +"\ntopspeed= "+topSpeed
        +"\n type="+type
        +"\ncolor="+color
        +"\nprice="+price +"\n____________________\n"
        );
    }

}

