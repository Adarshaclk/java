class Soap{
	public static void main(String[] args){
	byte weightInGrams=100;
    short priceInCents=50;
    int manufacturingYear=2023;
    long batchNumber=53463447;
    float length_cm=10.8f;
    double pHValue=6.564;
    char grade='A';
    boolean isOrganic=true;
    String brandName="cintol";	
	
		System.out.println("---Soap Details---");
		System.out.println("");
        System.out.println("Brand Name: " + brandName);
        System.out.println("Weight (grams): " + weightInGrams);
        System.out.println("Price (cents): " + priceInCents);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("Batch Number: " + batchNumber);
        System.out.println("Length (cm): " + length_cm);
        System.out.println("pH Value: " + pHValue);
        System.out.println("Grade: " + grade);		
        System.out.println("Is Organic: " + isOrganic);
		System.out.println("");
		
	brandName="MS";
	weightInGrams=50;
	priceInCents=75;
	manufacturingYear=2022;
	batchNumber=34636346;
	length_cm=9;
	pHValue=7.466;
	isOrganic=true;
	grade='B';
		
		System.out.println("--- Re-initilized values ---");
		System.out.println("");
		System.out.println("Brand Name: " + brandName);
		System.out.println("Weight (grams): " + weightInGrams);
		System.out.println("Price (cents): " + priceInCents);
		System.out.println("Manufacturing Year: " + manufacturingYear);	
		System.out.println("Batch Number: " + batchNumber);	
		System.out.println("Length (cm): " + length_cm);
	    System.out.println("pH Value: " + pHValue);
		System.out.println("Grade: " + grade);
		System.out.println("Is Organic: " + isOrganic);
	}
}