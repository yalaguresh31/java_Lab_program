public class LP5b_Box {
    double width;
    double height;
    double depth;
    // constructor used when all dimensions specified
    LP5b_Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
    }
    // constructor used when no dimensions specified
    LP5b_Box() {
    width = -1;
    height = -1;
    depth = -1;
    }
    // constructor used when cube is created
    LP5b_Box(double len) {
    width = height = depth = len;
    }
    // compute and return volume
    double volume() {
    return width * height * depth;
    }
    public static void main(String[] args) {
    // create boxes using the various constructors
    LP5b_Box mybox1 = new LP5b_Box(10, 20, 15);
    LP5b_Box mybox2 = new LP5b_Box();
    LP5b_Box mycube = new LP5b_Box(7);
    double vol;
    // get volume of first box
    vol = mybox1.volume();
    System.out.println("Volume of Box 1 is "+ vol);
    // get volume of second box
    vol = mybox2.volume();
    System.out.println("Volume of Box with unknown dimensions is "+ vol);
    // get volume of cube
    vol = mycube.volume();
    System.out.println("Volume of Cube is " + vol);
    }
    }