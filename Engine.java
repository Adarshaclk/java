
class Engine {
    
    public void d_eng(
        String engineType, int numCylinders, String cylinderArrangement, int displacement, double compressionRatio,
        int horsepower, int torque, int rpm, double powerToWeightRatio, double specificOutput,
        String fuelType, String fuelInjection, double fuelConsumption, double thermalEfficiency, String airFuelRatio,
        double strokeLength, double boreDiameter, String valveConfig, String coolingSystem, String lubricationSystem,
        String emissionCompliance, boolean hasEGR, String catalyticConverter, boolean hasTurbo, boolean hasStartStop)
     {
        
        System.out.println("~~~~ ENGINE PARAMETERS ~~~~");
        System.out.println("1. Engine Type: " + engineType);
        System.out.println("2. Number of Cylinders: " + numCylinders);
        System.out.println("3. Cylinder Arrangement: " + cylinderArrangement);
        System.out.println("4. Displacement : " + displacement + " cc");
        System.out.println("5. Compression Ratio: " + compressionRatio); 
        System.out.println("6. Horsepower (HP): " + horsepower + " HP");
        System.out.println("7. Torque (Nm): " + torque + " Nm");
        System.out.println("8. RPM: " + rpm + " RPM");
        System.out.println("9. Power-to-Weight Ratio: " + powerToWeightRatio + " HP per ton");
        System.out.println("10. Specific Output: " + specificOutput + " HP/L");
       System.out.println("11. Fuel Type: " + fuelType);
        System.out.println("12. Fuel Injection System: " + fuelInjection);
        System.out.println("13. Fuel Consumption: " + fuelConsumption + " km/L");
        System.out.println("14. Thermal Efficiency: " + thermalEfficiency + "%");
        System.out.println("15. Air-Fuel Ratio : " + airFuelRatio);
        System.out.println("\n16. Stroke Length: " + strokeLength + " mm");
        System.out.println("17. Bore Diameter: " + boreDiameter + " mm");
        System.out.println("18. Valve Configuration: " + valveConfig);
        System.out.println("19. Cooling System: " + coolingSystem);
        System.out.println("20. Lubrication System: " + lubricationSystem);
        System.out.println("\n21. Emission Compliance: " + emissionCompliance);
        System.out.println("22. Exhaust Gas Recirculation (EGR): " + (hasEGR ? "Present" : "Not Present"));
        System.out.println("23. Catalytic Converter: " + catalyticConverter);
        System.out.println("24. Turbocharger/Supercharger: " + (hasTurbo ? "Yes" : "No"));
        System.out.println("25. Start-Stop System: " + (hasStartStop ? "Available" : "Not Available"));
		System.out.prrintln("");
		

        
    }
}



