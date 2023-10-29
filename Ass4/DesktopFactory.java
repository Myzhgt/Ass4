class DesktopFactory implements ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Desktop();
    }
}
