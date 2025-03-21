class Enginestart {
    public static void main(String[] args) {

        // Create an instance of the Engine class
        Engine engine = new Engine();  

        // Initializing variables
        String engineType = "Petrol";
        int numCylinders = 4;
        String cylinderArrangement = "Inline";
        int displacement = 1500;
        double compressionRatio = 10.5;
        int horsepower = 150;
        int torque = 250;
        int rpm = 6500;
        double powerToWeightRatio = 100.0;
        double specificOutput = 100.0;
        String fuelType = "Petrol";
        String fuelInjection = "Direct Injection";
        double fuelConsumption = 15.0;
        double thermalEfficiency = 30.0;
        String airFuelRatio = "14.7:1";
        double strokeLength = 85.0;
        double boreDiameter = 75.0;
        String valveConfig = "DOHC";
        String coolingSystem = "Liquid-cooled";
        String lubricationSystem = "Wet sump";
        String emissionCompliance = "Euro 6";
        boolean hasEGR = true;
        String catalyticConverter = "High Efficiency";
        boolean hasTurbo = true;
        boolean hasStartStop = true;

        // Calling the method with initialized variables
        engine.d_eng(
            engineType, numCylinders, cylinderArrangement, displacement, compressionRatio,
            horsepower, torque, rpm, powerToWeightRatio, specificOutput,
            fuelType, fuelInjection, fuelConsumption, thermalEfficiency, airFuelRatio,
            strokeLength, boreDiameter, valveConfig, coolingSystem, lubricationSystem,
            emissionCompliance, hasEGR, catalyticConverter, hasTurbo, hasStartStop);
			
 engineType = "Diesel";
 numCylinders = 6;
 cylinderArrangement = "V6";
 displacement = 3000;
 compressionRatio = 18.0;
horsepower = 250;
 torque = 500;
 rpm = 5500;
 powerToWeightRatio = 120.0;
 specificOutput = 110.0;
 fuelType = "Diesel";
fuelInjection = "Common Rail Injection";
 fuelConsumption = 12.0;
 thermalEfficiency = 40.0;
 airFuelRatio = "16:1";
 strokeLength = 95.0;
 boreDiameter = 85.0;
 valveConfig = "SOHC";
 coolingSystem = "Air-cooled";
 lubricationSystem = "Dry sump";
 emissionCompliance = "Euro 7";
 hasEGR = false;
 catalyticConverter = "Ultra Low NOx";
 hasTurbo = true;
 hasStartStop = false;

engine.d_eng(
            engineType, numCylinders, cylinderArrangement, displacement, compressionRatio,
            horsepower, torque, rpm, powerToWeightRatio, specificOutput,
            fuelType, fuelInjection, fuelConsumption, thermalEfficiency, airFuelRatio,
            strokeLength, boreDiameter, valveConfig, coolingSystem, lubricationSystem,
            emissionCompliance, hasEGR, catalyticConverter, hasTurbo, hasStartStop);
			
engineType = "Hybrid";
 numCylinders = 3;
cylinderArrangement = "Inline";
 displacement = 1800;
 compressionRatio = 14.0;
horsepower = 200;
 torque = 300;
 rpm = 6000;
powerToWeightRatio = 130.0;
 specificOutput = 120.0;
 fuelType = "Electric + Petrol";
 fuelInjection = "Port Injection";
 fuelConsumption = 20.0;
 thermalEfficiency = 45.0;
 airFuelRatio = "13.5:1";
 strokeLength = 80.0;
 boreDiameter = 70.0;
valveConfig = "DOHC VVT";
 coolingSystem = "Liquid-cooled with Electric Assist";
 lubricationSystem = "Hybrid Oil System";
emissionCompliance = "Zero Emission Capable";
hasEGR = true;
 catalyticConverter = "Low Resistance";
hasTurbo = false;
hasStartStop = true;

engine.d_eng(
            engineType, numCylinders, cylinderArrangement, displacement, compressionRatio,
            horsepower, torque, rpm, powerToWeightRatio, specificOutput,
            fuelType, fuelInjection, fuelConsumption, thermalEfficiency, airFuelRatio,
            strokeLength, boreDiameter, valveConfig, coolingSystem, lubricationSystem,
            emissionCompliance, hasEGR, catalyticConverter, hasTurbo, hasStartStop);


engineType = "Electric";
numCylinders = 0;
cylinderArrangement = "N/A";
 displacement = 0;
 compressionRatio = 0.0;
 horsepower = 350;
 torque = 600;
 rpm = 12000;
 powerToWeightRatio = 180.0;
specificOutput = 150.0;
fuelType = "Electric";
 fuelInjection = "N/A";
 fuelConsumption = 0.0;
thermalEfficiency = 90.0;
airFuelRatio = "N/A";
 strokeLength = 0.0;
boreDiameter = 0.0;
valveConfig = "N/A";
coolingSystem = "Liquid-cooled Battery";
lubricationSystem = "Minimal Lubrication";
emissionCompliance = "Zero Emissions";
hasEGR = false;
catalyticConverter = "None";
hasTurbo = false;
 hasStartStop = true;
engine.d_eng(
            engineType, numCylinders, cylinderArrangement, displacement, compressionRatio,
            horsepower, torque, rpm, powerToWeightRatio, specificOutput,
            fuelType, fuelInjection, fuelConsumption, thermalEfficiency, airFuelRatio,
            strokeLength, boreDiameter, valveConfig, coolingSystem, lubricationSystem,
            emissionCompliance, hasEGR, catalyticConverter, hasTurbo, hasStartStop);
  
 engineType = "Turbocharged Petrol";
numCylinders = 8;
cylinderArrangement = "V8";
displacement = 4000;
compressionRatio = 9.5;
horsepower = 600;
 torque = 750;
 rpm = 7000;
 powerToWeightRatio = 220.0;
specificOutput = 150.0;
fuelType = "Petrol";
fuelInjection = "Direct & Port Injection";
fuelConsumption = 8.0;
 thermalEfficiency = 38.0;
 airFuelRatio = "12.5:1";
 strokeLength = 92.0;
 boreDiameter = 88.0;
valveConfig = "DOHC with VVT";
 coolingSystem = "Liquid-cooled with Intercooler";
 lubricationSystem = "Dry Sump";
emissionCompliance = "Euro 6d";
hasEGR = false;
catalyticConverter = "High Flow Sports";
hasTurbo = true;
hasStartStop = false;


engine.d_eng(
            engineType, numCylinders, cylinderArrangement, displacement, compressionRatio,
            horsepower, torque, rpm, powerToWeightRatio, specificOutput,
            fuelType, fuelInjection, fuelConsumption, thermalEfficiency, airFuelRatio,
            strokeLength, boreDiameter, valveConfig, coolingSystem, lubricationSystem,
            emissionCompliance, hasEGR, catalyticConverter, hasTurbo, hasStartStop);
  }
}
