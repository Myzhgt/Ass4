class ProductionSystem {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void triggerEvent(String event) {
        System.out.println("Event: " + event);
        notifyObservers(event);  // Pass the event string to observers
    }
}

interface Observer {
    void update(String event);  // Corrected parameter type
}
