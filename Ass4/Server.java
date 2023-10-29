class Server implements Computer {
    @Override
    public void assemble() {
        System.out.println("Assembling a server");
    }

    @Override
    public void runQualityControl() {
        System.out.println("Running quality control for a server");
    }

    @Override
    public void runTests() {
        System.out.println("Running tests for a server");
    }
}
