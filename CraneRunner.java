class CraneRunner{
public static void main(String... args){

Crane crane=new Crane();

   System.out.println("the name of the company is :"+crane.comp);
   System.out.println("the type of the crane is :"+crane.type);
      System.out.println("the capacity of the company is :"+crane.capacity);
	     System.out.println("the fuel required :"+crane.fuel+" ltrs");
 
 crane.comp="hithachi";
 crane.type="lifter";
 crane.capacity=400;
 crane.fuel=100;

   System.out.println("the updated  name of the company is :"+crane.comp);
   System.out.println("the updated type of the crane is :"+crane.type);
      System.out.println("the updated  capacity of the crane is :"+crane.capacity);
	     System.out.println("the updated fuel required :"+crane.fuel+" ltrs");




}

}