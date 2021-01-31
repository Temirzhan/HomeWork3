public class Treadmill implements Barrier {
    private int length;
    private final Enum<Type> TYPE = Type.TREADMILL;

    public Treadmill(int length) {

        this.length = length;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public Enum<Type> getType() {
        return TYPE;
    }
}
