class SirenRunner{
public static void main(String... args){
 Siren siren=new Siren();
 System.out.println("the siren used in"+siren.used);
  System.out.println("the brand of siren is"+siren.brand);
 System.out.println("the sound  in db"+siren.sound+" db");
 System.out.println("the type siren used in"+ siren.type);

siren.used="trian";
siren.brand="maker";
siren.sound=200;
siren.type="manual";

 System.out.println("the updated siren used in"+siren.used);
  System.out.println("the updated brand of siren is"+siren.brand);
 System.out.println("the updated sound  in db"+siren.sound+" db");
 System.out.println("the updated type siren used in"+ siren.type);

}
}