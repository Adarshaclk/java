class Bombstart{
public static void main(String[] args){


String bombType = "High-Explosive";
double explosiveMass = 500.0; 
String explosiveMaterial = "TNT";
double blastRadius = 300.0; 
double detonationVelocity = 7500.0; 
double pressureWave = 20.0; 
double fragmentationRange = 500.0; 
boolean hasProximityFuse = true;
boolean hasTimerFuse = false;
boolean hasRemoteDetonation = true;


Bomb.d_bomb(bombType,explosiveMass,explosiveMaterial,blastRadius,detonationVelocity,pressureWave,
fragmentationRange,hasProximityFuse,hasTimerFuse,hasRemoteDetonation);

bombType = "Thermobaric";
explosiveMass = 750.0;
explosiveMaterial = "RDX";
blastRadius = 500.0;
detonationVelocity = 8500.0;
pressureWave = 25.0;
fragmentationRange = 700.0;
hasProximityFuse = false;
hasTimerFuse = true;
hasRemoteDetonation = true;

Bomb.d_bomb(bombType,explosiveMass,explosiveMaterial,blastRadius,detonationVelocity,pressureWave,
fragmentationRange,hasProximityFuse,hasTimerFuse,hasRemoteDetonation);


bombType = "Nuclear";
explosiveMass = 10000.0;
explosiveMaterial = "Uranium-235";
blastRadius = 5000.0;
detonationVelocity = 10000.0;
pressureWave = 50.0;
fragmentationRange = 10000.0;
hasProximityFuse = true;
hasTimerFuse = false;
hasRemoteDetonation = true;

Bomb.d_bomb(bombType,explosiveMass,explosiveMaterial,blastRadius,detonationVelocity,pressureWave,
fragmentationRange,hasProximityFuse,hasTimerFuse,hasRemoteDetonation);

bombType = "Thermobaric";
explosiveMass = 900.0;
explosiveMaterial = "HMX";
blastRadius = 600.0;
detonationVelocity = 9500.0;
pressureWave = 30.0;
fragmentationRange = 800.0;
hasProximityFuse = true;
hasTimerFuse = true;
hasRemoteDetonation = false;

Bomb.d_bomb(bombType,explosiveMass,explosiveMaterial,blastRadius,detonationVelocity,pressureWave,
fragmentationRange,hasProximityFuse,hasTimerFuse,hasRemoteDetonation);
bombType = "Chemical";
explosiveMass = 400.0;
explosiveMaterial = "Sarin Gas";
blastRadius = 200.0;
detonationVelocity = 500.0;
pressureWave = 10.0;
fragmentationRange = 300.0;
hasProximityFuse = false;
hasTimerFuse = true;
hasRemoteDetonation = true;
 Bomb.d_bomb(bombType,explosiveMass,explosiveMaterial,blastRadius,detonationVelocity,pressureWave,
fragmentationRange,hasProximityFuse,hasTimerFuse,hasRemoteDetonation);
 
 
}
}
