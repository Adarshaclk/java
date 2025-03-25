class JamoonRunner{
public static void main(String... args){
Jamoon jamoon=new Jamoon();

System.out.println("the name of the sweet is :"+jamoon.name);
System.out.println(" is it dry  :"+jamoon.dry);
System.out.println("the name of the brand is :"+jamoon.brand);
System.out.println("quantity :"+jamoon.quantity);

jamoon.name="Gulab Jamoon";
jamoon.dry=false;
jamoon.brand="MTR";
jamoon.quantity=6;

System.out.println("");
System.out.println("the updated name of the sweet is :"+jamoon.name);
System.out.println("updated :is it dry  :"+jamoon.dry);
System.out.println("the updated name of the brand is :"+jamoon.brand);
System.out.println("updated quantity :"+jamoon.quantity);



}
}