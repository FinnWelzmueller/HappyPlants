import java.util.Set;
import java.util.HashSet;
import java.util.*;
public class PlantManager {

    private Set<Plant> _plants;  //all plants
    private Set<Plant> _plantsAutoWatering;  //all plants with auto watering

    public PlantManager(){
        _plants = new HashSet<Plant>();
        _plantsAutoWatering = new HashSet<Plant>();
    }
    //add and remove plants
    public void addPlant(String name, String nameLatin, int maxDaysWithoutWater, boolean autoWatering) {

        Plant plant = new Plant(name, nameLatin, maxDaysWithoutWater, autoWatering); // autogenereate instance name?
        _plants.add(plant);

        if (autoWatering == true) {
            _plantsAutoWatering.add(plant);
        }
    }

    //getter
    public Set<Plant> getPlants(){
        return _plants;
    }
    public Set<Plant> getPlantsAutoWatering() {
        return _plantsAutoWatering;
    }

    //Remove Plants
    public void removeFromSet(Set<Plant> set, Plant plant){
        Iterator<Plant> plants = set.iterator();
        while(plants.hasNext()){
            if (plants.next() == plant){
                _plants.remove(plants.next());
            }
        }
    }
    public void removePlant(Plant plant) {
            removeFromSet(_plants, plant);
            if (plant.getAutoWatering() == true) {
                removeFromSet(_plantsAutoWatering, plant);
            }
    }

    //care about plant watering
    public void plantsNeedWater() {
        //create set with all plants that need water
        Iterator<Plant> plants = _plants.iterator();

        while(plants.hasNext()) {
            if(plants.next().getNeedWater() && !plants.next().getAutoWatering()){
                System.out.println(plants.next().getName()+" need water!");
            }
            else if (plants.next().getNeedWater() && plants.next().getAutoWatering()) {
                callWatering(plants.next());
            }
        }
    }
    private void callWatering(Plant plant) {
        //add water output
    }


    //priter
    public void listAllPlants(){
        Iterator<Plant> plants = _plants.iterator();
        while(plants.hasNext()){
            System.out.println("Name: "+plants.next().getName()+", Latin Name: "+plants.next().getNameLatin());
        }
    }
}