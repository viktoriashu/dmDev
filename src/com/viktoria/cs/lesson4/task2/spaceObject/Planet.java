package com.viktoria.cs.lesson4.task2.spaceObject;

import com.viktoria.cs.lesson4.task2.actions.PrintInformation;
import com.viktoria.cs.lesson4.task2.actions.SatelliteRefersToAPlanet;


public class Planet extends SpaceObject implements SatelliteRefersToAPlanet, Comparable<Planet>, PrintInformation {
    private static final String URANUS = "URANUS";
    private static final String NEPTUNE = "NEPTUNE";
    private static final String VENUS = "VENUS";
    private static final String MERCURY = "MERCURY";
    private static final String EARTH = "EARTH";
    private static final String MARS = "MARS";
    private static final String JUPITER = "JUPITER";
    private static final String SATURN = "SATURN";


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


    public Planet(String name, double weight, double radius) {
        super(name, weight, radius);
    }


    public void sortPhysicalProperties(Planet planet) {
        switch (planet.getName()) {
            case MERCURY, VENUS, EARTH, MARS ->
                    System.out.println(planet.getName() + " планета земной группы. Она относительно небольшая и " +
                            "плотная, " + "состоит из металлов и минералов.");
            case JUPITER, SATURN, URANUS, NEPTUNE ->
                    System.out.println(planet.getName() + " планета-гигант, она во много раз больше других планет, " +
                            "состоит из газов и льда");
        }
    }

    @Override
    public void satelliteRefersToAPlanet(SpaceObject spaceObject) {
        switch (this.getName()) {
            case EARTH -> System.out.println("Спутником " + this.getName() + " является " + MOON);
            case MARS -> System.out.println("Спутником " + this.getName() + " является " + PHOBOS + ", " + DEIMOS);
            case JUPITER ->
                    System.out.println("Спутником " + this.getName() + " является " + EUROPA + ", " + IO + ", " +
                            GANYMEDE + ", " + CALLISTO + ", " + AMALTHEA);
            case SATURN ->
                    System.out.println("Спутником " + this.getName() + " является " + TITAN + ", " + ENCELADUS + ", " +
                            MIMAS + ", " + DIONE + ", " + IAPETUS);
            case URANUS ->
                    System.out.println("Спутником " + this.getName() + " является " + TITANIA + ", " + MIRANDA + ", " +
                            CUPID + "," + OBERON + "," + ARIEL);
            case NEPTUNE ->
                    System.out.println("Спутником " + this.getName() + " является " + TRITON + ", " + THALASSA + ", " +
                            HIPPOCAMPUS + ", " + NEREID + ", " + GALATEA);
            case MERCURY, VENUS -> System.out.println("У " + this.getName() + " спутники отсутствуют");
        }
    }


    @Override
    public int compareTo(Planet o) {
        return (int) (this.getWeight() - o.getWeight());
    }

    @Override
    public void PrintInformation(SpaceObject spaceObject) {
        switch (this.getName()) {
            case MERCURY -> System.out.println("Самая близкая к Солнцу и самая маленькая планета солнечной системы — " +
                    "Меркурий лишь немного больше Луны. Меркурий получает в семь раз больше тепла и света, " +
                    "чем Земля, поэтому температура его поверхности колеблется от +430°C днём до ?190°C ночью. " +
                    "Это самый большой температурный перепад в солнечной системе.");
            case EARTH -> System.out.println("Земля — третья планета от Солнца и крупнейшая в " +
                    "земной группе. Уникальные условия Земли позволили развиться на планете жизни.");
            case MARS -> System.out.println("Марс — четвертая планета от Солнца — меньше Земли почти " +
                    "в два раза. Учёные считают Марс самой перспективной планетой для освоения, поскольку погодные " +
                    "условия на ней довольно приемлемы для человека. Если не считать низкое содержание кислорода в " +
                    "атмосфере, радиацию и пылевые бури, длящиеся по несколько месяцев.");
            case JUPITER -> System.out.println("Юпитер, самая большая из планет-гигантов, отделена от " +
                    "Марса поясом астероидов. Масса Юпитера в два раза больше, чем масса всех остальных " +
                    "планет, лун, комет и астероидов системы вместе взятых.");
            case SATURN -> System.out.println("Главная особенность Сатурна — впечатляющая система из семи колец. " +
                    "Они состоят из миллиардов ледяных осколков, которые отлично отражают свет, " +
                    "а потому хорошо заметны. Недавние исследования показали, что вокруг Сатурна " +
                    "вращаются 82 спутника — на данный момент это рекорд солнечной системы");
            case URANUS -> System.out.println("Уран — самая холодная планета в системе: средняя температура его " +
                    "поверхности составляет ?224°C. Как и Сатурн, Уран окружён кольцами.");
            case NEPTUNE ->
                    System.out.println("Нептун находится так далеко, что его нельзя увидеть с Земли невооружённым " +
                            "глазом. На настоящий момент учёные знают о 14 спутниках Нептуна, лишь один из " +
                            "которых (Тритон) обладает сферической формой. Это единственный в системе крупный " +
                            "спутник с обратным вращением. У Нептуна есть три кольца, хотя выражены они слабо. ");
            case VENUS -> System.out.println("Венера — вторая планета от Солнца и ближайшая к Земле. " +
                    "Венеру иногда называют «близнецом» нашей планеты: её размеры и масса очень близки к земным. " +
                    "Однако на этом сходство заканчивается. Венера окутана очень плотным слоем облаков, " +
                    "за которыми невозможно разглядеть поверхность. Из-за парникового эффекта она нагревается " +
                    "до 480°C — абсолютный рекорд для солнечной системы. Облака проливаются кислотными дождями и " +
                    "пропускают только 40% солнечного света, поэтому на планете царит вечный сумрак. " +
                    "Облака Венеры хорошо отражают солнечный свет, поэтому на земном небе планета светится ярче " +
                    "других.");
        }
    }

    @Override
    public String toString() {
        return "Planet {" + "name='" + super.getName() + '\'' +
                ", weight=" + super.getWeight() + '\'' +
                ", radius=" + super.getRadius() +
                '}';

    }
}