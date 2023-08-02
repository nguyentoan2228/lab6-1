class Bus extends  Vehicle{

    public Bus() {
        super("Bus", 20);
    }

    @Override
    public void print() {
        System.out.println("phương tiện: " + getName());
        System.out.println("tốc độ: " + getSpeed()+" km/h");
    }
}
