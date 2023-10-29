class ProductionStage {
    private String name;
    private ProductionSystem productionSystem;

    public ProductionStage(String name, ProductionSystem productionSystem) {
        this.name = name;
        this.productionSystem = productionSystem;
    }

    public void triggerEvent(String event) {
        productionSystem.triggerEvent(name + " - " + event);
    }
}