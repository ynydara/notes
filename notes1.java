public class notes1 {
//----------------------8/31/2022-----------------------------------------------------------------
    //constructors are used to initilize object.
    //main{
    //    Marker o = new [Marker()] - constructor;
    //if no constructor is specified, java adds a default empty one.
    //
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //main {
    //  Bottle b = new Bottle();
    //      b.volume = 500; | b.material = "plastic"; V
    //      wouldn't be needed if have the Bottle() constructors because all bottles will have these attributes.
    //if its a different one than the default.
    //  Bottle c = new Bottle ()
    //Sys.out.print(c.volume);//console:500
    //
//}
    // --> constructor can be overloaded.
    //   class Bottle{
    //   characteristics://list of attributes;
    //          int volume;
    //          string material;
    //   constructors need to be defined
    //      Bottle(){
    //          volume = 500;
    //          material = "plastic";
    //}
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// main{
    //Bottle b = new Bottle (1000, "steel"); java will use the one with the signature.
    //sys.out....(b.volume); |console: 1000

//Bottle c = new Bottle (); java will use the default values
    //sys.out....(c.volume); |console: 500
//}
    //class Bottle{
    //int volume;
    //String materal;
    //constructors
    //Bottle(){
    //volume = 500;
    // material = "plastic";
    //you can have the same constructors only if they have different signatures/
//this is example of overloading.
//}
    //Bottle(int vol, String mat){
        //volume = vol;
    //material = mat;


    //}


    //}
//}
//---------------------------------------------------------------------------------------------
    // "this"
    //      -used inside of classes
    //it is a reference to the object being created.
    //instead of <line 40>
    // Bottle(){
    // this(500, "plastic");

    //}end bottle
    //Bottle(int vol, string mat){
        //make sure there cant have a negative volume.
        //if(vol>0){
    //      volume = vol;
    //} end if

    //}end Bottle

// -"this" is used to access resources inside the class itself.
    //can reference attributes.
    //------------------------------------------------------------------------------------------
}
