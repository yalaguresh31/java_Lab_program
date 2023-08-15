public class LP5b_Box {
    double width,height,depth;

    LP5b_Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
    }
    

    LP5b_Box() {
    width = -1;
    height = -1;
    depth = -1;
    }
 
    LP5b_Box(double len) {
    width = height = depth = len;
    }
   
    double volume() {
    return width * height * depth;
    }
    public static void main(String[] args) {
    LP5b_Box mybox1 = new LP5b_Box(10, 20, 15);
    LP5b_Box mybox2 = new LP5b_Box();
    LP5b_Box mycube = new LP5b_Box(7);
    double vol;
    
    vol = mybox1.volume();
    System.out.println("Volume of Box 1 is "+ vol);
   
    vol = mybox2.volume();
    System.out.println("Volume of Box with unknown dimensions is "+ vol);
   
    vol = mycube.volume();
    System.out.println("Volume of Cube is " + vol);
    }
    }
    