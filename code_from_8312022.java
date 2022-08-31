public class code_from_8312022 {
    public static void main(String[] args){
        Bottle b1 = new Bottle();//water bottle
        Bottle b2 = new Bottle(1000, "steel"); //yeti
        Bottle b3 = new Bottle(-1000, "dark matter");//thanos bottle

        System.out.print("Water bottle volume" + b1.volume);
        System.out.print("Water bottle material: " + b1.material);
    }
}
