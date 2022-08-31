
public class Bottle {

        //attributes
        int volume;
        String material;

        //constructors
        Bottle() {
            //default constructor
            this(500, "plastic");

        }
        Bottle( int volume, String material){

            if (volume > 0)
                this.volume = volume;
            else {
               this. volume = 500;
            }
            this.material = material;
        }
    }

