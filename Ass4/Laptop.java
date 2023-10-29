class Laptop implements Computer {
    @Override
    public void assemble() {
        System.out.println("Assembling a laptop");
    }

    @Override
    public void runQualityControl() {
        System.out.println("Running quality control for a laptop");
    }

    @Override
    public void runTests() {
        System.out.println("Running tests for a laptop");
    }
}