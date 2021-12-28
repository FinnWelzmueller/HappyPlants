/** 
 * Plant class.
 * A plant can need a name, a latin name, an amount of days until the next watering is needed, and it keeps 
 * 
*/


public class Plant{
    private String _name;
    private String _nameLatin;
    private boolean _needWater;
    private int _maxDaysWithoutWater;
    private boolean _autoWatering;
    private int _daysFromLastWater;

    public Plant(String name, String nameLatin, int maxDaysWithoutWater, boolean autoWatering){
        _name = name;
        _nameLatin = nameLatin;
        _needWater = true;
        _maxDaysWithoutWater = maxDaysWithoutWater;
        _autoWatering = autoWatering;
        _daysFromLastWater = 0;
    }


    public String getName() {
        return _name;
    }
    public void setName(String name) {
        _name = name;
    }

    public String getNameLatin() {
        return _nameLatin;
    }
    public void setNameLatin(String nameLatin) {
        _nameLatin = nameLatin;
    }

    public boolean getNeedWater(){
        return _needWater;
    }
    public void setNeedWater(boolean needWater) {
        _needWater = needWater;
    }

    public int getMaxDaysWithoutWater() {
        return _maxDaysWithoutWater;
    }
    public void setMaxDaysWithoutWater(int maxDaysWithoutWater) {
        _maxDaysWithoutWater = maxDaysWithoutWater;
    }

    public boolean getAutoWatering() {
        return _autoWatering;
    }
    public void setAutoWatering(boolean autoWatering) {
        _autoWatering = autoWatering;
    }

    public int getDaysFromLastWater() {
        return _daysFromLastWater;
    }
    public void setDaysFromLastWater(int daysFromLastWater) {
        _daysFromLastWater = daysFromLastWater;
    }
    /** 
     * Ticks the amount of days when the plant was watered at last.
     * switches _needWater if necessary and sets the 
    */
    public void tickDaysFromWater() {
        setDaysFromLastWater(_daysFromLastWater + 1);
        if (_daysFromLastWater == _maxDaysWithoutWater) {
            setNeedWater(true);
            setDaysFromLastWater(0);
        }
    }
}