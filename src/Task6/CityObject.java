package Task6;

abstract class CityObject {
    public final void render() {
        prepare();
        draw();
        finish();
    }
    private void prepare() {
        System.out.println("Подготовка к отрисовке объекта...");
    }

    protected abstract void draw();

    private void finish() {
        System.out.println("Завершение отрисовки объекта.\n");
    }

    protected void hook() {}
}
