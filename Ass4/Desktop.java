class Desktop implements Computer {
    @Override
    public void assemble() {
        System.out.println("Assembling a desktop");
    }

    @Override
    public void runQualityControl() {
        System.out.println("Running quality control for a desktop");
    }

    @Override
    public void runTests() {
        System.out.println("Running tests for a desktop");
    }
}