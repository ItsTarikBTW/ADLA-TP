package org.example;

public class VehiculeFactoryImpl implements VehiculeFactory {
    @Override
    public Vehicule createVehicule(String type) {
        switch (type.toLowerCase()) {
            case "bus":
                return new Bus();
            case "bicyclette":
                return new Bicyclette();
            case "voiture":
                return new Voiture();
            case "camion":
                return new Camion();
            default:
                throw new IllegalArgumentException("Unknown vehicule type: " + type);
        }
    }
}