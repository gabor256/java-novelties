package java9.trywithresources;

public class Test {
    public static void main(String[] args) {
        // Java 9: Autoclosable resource korábban csak úgy volt használható, hogy a try with blokk belsejében volt inicializálva
        // most már előre is lehet inicializálni
        MyWorker myWorker = new MyWorker();
        try (myWorker){
            myWorker.doSomething();
        } catch (Exception e) {

        }
    }
}
