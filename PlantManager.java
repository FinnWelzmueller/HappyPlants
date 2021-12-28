import java.util.Set;
import java.util.HashSet;

public class PlantManager {

    private Set<Plant> _plants;  //all plants
    private Set<Plant> _plantsAutoWatering;  //all plants with auto watering

    public PlantManager(){
        _plants = new HashSet<Plant>();
        _plantsAutoWatering = new HashSet<Plant>();
    }

    public void addPlant(String name, String nameLatin, int maxDaysWithoutWater, boolean autoWatering) {

        Plant plant = new Plant(name, nameLatin, maxDaysWithoutWater, autoWatering); // autogenereate instance name?
        _plants.add(plant);

        if (autoWatering == true) {
            _plantsAutoWatering.add(plant);
        }
    }
}