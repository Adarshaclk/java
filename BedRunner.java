class BedRunner{

public static void main(String... args){
Bed bed=new Bed();
System.out.println("the legnth is :"+bed.legnth);
System.out.println("the width is :"+bed.width);
System.out.println("is it waterProof :"+bed.waterProof);
System.out.println("Brand name :"+bed.Brand);

bed.legnth=6;
bed.width=4;
bed.waterProof=true;
bed.Brand="Sleepwell";

System.out.println("updated the legnth is :"+bed.legnth);
System.out.println("updated the width is :"+bed.width);
System.out.println("updated: is it waterProof :"+bed.waterProof);
System.out.println("updated Brand name :"+bed.Brand);

}
}