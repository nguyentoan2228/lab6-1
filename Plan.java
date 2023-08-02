class Plan extends Vehicle{
    public Plan() {
        super("máy bay", 80);
    }

    @Override
    public void print() {
        System.out.println("phương tiện: "+getName());
        System.out.println("vận tốc: " + getSpeed() +" km/h");
    }
}
