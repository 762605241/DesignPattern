package bridge;

public abstract class Shape {
    private DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

    public DrawAPI getDrawAPI() {
        return drawAPI;
    }

    public void setDrawAPI(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
}
