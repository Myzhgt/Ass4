class Worker implements Observer {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println(name + " received event: " + event);
    }
}