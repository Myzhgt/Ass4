class LaptopFactory implements ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Laptop();
    }
}