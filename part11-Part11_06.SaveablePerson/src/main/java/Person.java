public class Person implements Saveable {
    private String name;
    private String address;

    @Override
    public void save() {
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void load(String address) {
        throw new UnsupportedOperationException("Unimplemented method 'load'");
    }

}
