class ShirtRunner{
public static void main(String... args){

Shirt shirt=new Shirt();

System.out.println("the size of the shirt is:"+shirt.size);
System.out.println("the color of the shirt is:"+shirt.color);
System.out.println("the matirial of the shirt is:"+shirt.matiral);
System.out.println("full sleeve or half sleeve:"+shirt.sleeve);

shirt.size="xl";
shirt.color="Red";
shirt.matiral="lenin";
shirt.sleeve="full";
System.out.println("");

System.out.println("updated  size of the shirt is:"+shirt.size);
System.out.println("updated  color of the shirt is:"+shirt.color);
System.out.println("updated matirial of the shirt is:"+shirt.matiral);
System.out.println("updated full sleeve or half sleeve:"+shirt.sleeve);

}
}