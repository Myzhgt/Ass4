
public class ComputerFactoryDemo {
    public static void main(String[] args) {
        // Controller Model
        ProductionSystem productionSystem = new ProductionSystem();
        Worker assemblyWorker = new Worker("Assembly Worker");
        productionSystem.addObserver(assemblyWorker);

        // Factory Model
        ComputerFactory laptopFactory = new LaptopFactory();
        ComputerFactory desktopFactory = new DesktopFactory();

        // Simulate production
        ProductionStage assemblyStage = new ProductionStage("Assembly", productionSystem);
        assemblyStage.triggerEvent("Item A assembled");
        assemblyStage.triggerEvent("Item B assembled");

        // Create computers
        Computer laptop = laptopFactory.createComputer();
        laptop.assemble();

        Computer desktop = desktopFactory.createComputer();
        desktop.assemble();
    }
}