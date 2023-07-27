public class MobilePhone extends MobileEquipment{

    private boolean fastCharging;

    public MobilePhone(String name, Type type, Double price, SpecialOffer offer, Color color, Manufacturer manufacturer, double size) {
        super(name, type, price, offer, color, manufacturer, size);
    }

    public MobilePhone(String name, Type type, Double price, Color color, Manufacturer manufacturer, double size, boolean fastCharging) {
        super(name, type, price, color, manufacturer, size);
        this.fastCharging = fastCharging;
    }

    public MobilePhone(String name, Type type, Double price, Color color, double size, boolean fastCharging) {
        super(name, type, price, color, size);
        this.fastCharging = fastCharging;
    }

    public boolean isFastCharging() {
        return fastCharging;
    }

    public void setFastCharging(boolean fastCharging) {
        this.fastCharging = fastCharging;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                super.toString() +
                "fastCharging=" + fastCharging +
                '}';
    }




}
