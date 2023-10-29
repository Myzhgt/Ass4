class ServerFactory implements ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Server();
    }
}