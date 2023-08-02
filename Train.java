class Train extends Vehicle{
    public Train() {
        super("Train", 40);
    }

    @Override
    public void print() {
        System.out.println("phương tiện: " + getName());
        System.out.println("vận tốc: " + getSpeed() +" km/h");
    }
}
