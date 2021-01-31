public class Cat implements Person {
    private String name;
    private final int jump = 1;
    private final int run = 1000;
    private boolean ignore;

    public Cat(String name) {

        this.name = name;
        ignore = false;
    }

    @Override
    public boolean run(int length) {
        if(run>length)
            return true;
        return false;
    }

    @Override
    public boolean jump(int length) {
        if(jump>=length)
            return true;
        return false;
    }

    public boolean passTheBarrier(Barrier barrier){
        Enum<Type> newType = barrier.getType();
        if(newType == Type.WALL){
            if(jump(barrier.getLength())){
                System.out.println(name + " пеерепрыгнул препятствие в " + barrier.getLength() + "м");
                return true;
            }
            else{
                System.out.println(name + " не смог перепрыгнуть " + barrier.getLength() + "м");
                return false;
            }
        }else if(newType == Type.TREADMILL){
            if(run(barrier.getLength())){
                System.out.println(name + " перебежал растояние в " + barrier.getLength() + "м");
                return true;
            }
            else{
                System.out.println(name + " не смог пробежать " + barrier.getLength() + "м");
                return false;
            }
        }
        return false;
    }

    @Override
    public void setIgnore(boolean ignore) {
        this.ignore = ignore;
    }

    @Override
    public boolean getIgnore() {
        return ignore;
    }

}
