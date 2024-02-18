package com.viktoria.cs.lesson4.task2.spaceObject;


import com.viktoria.cs.lesson4.task2.actions.SatelliteRefersToAPlanet;

public class Satellite extends SpaceObject implements SatelliteRefersToAPlanet {


    private static final String NEPTUNE = "NEPTUNE";
    private static final String EARTH = "EARTH";
    private static final String MARS = "MARS";
    private static final String JUPITER = "JUPITER";
    private static final String SATURN = "SATURN";
    private static final String URANUS = "URANUS";


    private static final String IO = "IO";
    private static final String DIONE = "DIONE";
    private static final String TITANIA = "TITANIA";
    private static final String MOON = "MOON";
    private static final String PHOBOS = "PHOBOS";
    private static final String DEIMOS = "DEIMOS";
    private static final String EUROPA = "EUROPA";
    private static final String GANYMEDE = "GANYMEDE";
    private static final String CALLISTO = "CALLISTO";
    private static final String AMALTHEA = "AMALTHEA";
    private static final String TITAN = "TITAN";
    private static final String ENCELADUS = "ENCELADUS";
    private static final String MIMAS = "MIMAS";
    private static final String IAPETUS = "IAPETUS";
    private static final String MIRANDA = "MIRANDA";
    private static final String CUPID = "CUPID";
    private static final String OBERON = "OBERON";
    private static final String ARIEL = "ARIEL";
    private static final String TRITON = "TRITON";
    private static final String THALASSA = "THALASSA";
    private static final String HIPPOCAMPUS = "HIPPOCAMPUS";
    private static final String NEREID = "NEREID";
    private static final String GALATEA = "GALATEA";

    public Satellite(String name, double weight, double radius) {
        super(name, weight, radius);
    }


    @Override
    public void satelliteRefersToAPlanet(SpaceObject spaceObject) {
        switch (this.getName()) {
            case MOON -> System.out.println(this.getName() + " является спутником " + EARTH);
            case PHOBOS, DEIMOS -> System.out.println(this.getName() + " является спутником " + MARS);
            case EUROPA, IO, GANYMEDE, CALLISTO, AMALTHEA ->
                    System.out.println(this.getName() + " является спутником " + JUPITER);
            case TITAN, ENCELADUS, MIMAS, DIONE, IAPETUS ->
                    System.out.println(this.getName() + " является спутником " + SATURN);
            case TITANIA, MIRANDA, CUPID, OBERON, ARIEL ->
                    System.out.println(this.getName() + " является спутником " + URANUS);
            case TRITON, THALASSA, HIPPOCAMPUS, NEREID, GALATEA ->
                    System.out.println(this.getName() + " является спутником " + NEPTUNE);
        }

    }

    @Override
    public String toString() {
        return "Satellite {" + "name='" + super.getName() + '\'' +
                ", weight=" + super.getWeight() + '\'' +
                ", radius=" + super.getRadius() +
                '}';
    }
}
