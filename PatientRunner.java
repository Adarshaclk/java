class PatientRunner{
public static void main(String... args){
Patient patient=new Patient();

System.out.println("the name of patient is : "+patient.name);
System.out.println("the id of patient is : "+patient.id);
System.out.println("the blood group of patient is : "+patient.blood);
System.out.println("the hospiatl name of patient is : "+patient.h_name);

patient.name="dhamu";
patient.id=89;
patient.blood='o';
patient.h_name="ss hospiatl";

System.out.println("the updated name of patient is : "+patient.name);
System.out.println("the updated id of patient is : "+patient.id);
System.out.println("the updated blood group of patient is : "+patient.blood);
System.out.println("the updated hospiatl name of patient is : "+patient.h_name);
}

}