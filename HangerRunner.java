class HangerRunner{
public static void main(String... args){

Hanger hanger=new Hanger();

System.out.println("capacity of the hanger is "+hanger.capacity);
System.out.println("color of the hanger is "+hanger.color);
System.out.println("brand of the hanger is "+hanger.brand);
System.out.println("is it Strecthable "+hanger.strecth);


hanger.capacity=10;
hanger.color="blue";
hanger.brand="horse";
hanger.strecth=true;
System.out.println("");

System.out.println("updated capacity of the hanger is "+hanger.capacity);
System.out.println("updated color of the hanger is "+hanger.color);
System.out.println("updated brand of the hanger is "+hanger.brand);
System.out.println("updated :is it Strecthable "+hanger.strecth);
}
}