class FloorRunner{
public static void main(String... args){

Floor floor=new Floor();

System.out.println("the floor number is :"+floor.floor_no);
System.out.println("is the floor as elivator :"+floor.elivator);
System.out.println("the number of rooms  :"+floor.no_rooms);
System.out.println("the matirial used to built :"+floor.matirial);


floor.elivator=true;
floor.floor_no=10;
floor.no_rooms=8;
floor.matirial="granite";
System.out.println("updated :floor number is :"+floor.floor_no);
System.out.println("updated :is the floor as elivator :"+floor.elivator);
System.out.println("the number of rooms  :"+floor.no_rooms);
System.out.println("the matirial used to built :"+floor.matirial);



}


}