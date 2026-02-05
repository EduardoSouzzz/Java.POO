import java.util.Set;
import java.util.HashSet;

public class EventSystem {

    private Set<String> doorA;
    private Set<String> doorB;

    public EventSystem(Set<String> doorA, Set<String> doorB) {
        this.doorA = doorA;
        this.doorB = doorB;
    }

    public Set<String> getDoorA() {
        return doorA;
    }

    public void setDoorA(Set<String> doorA) {
        this.doorA = doorA;
    }

    public Set<String> getDoorB() {
        return doorB;
    }

    public void setDoorB(Set<String> doorB) {
        this.doorB = doorB;
    }


    public void addToDoorA(String code) {
        doorA.add(code);
    }

    public void addToDoorB(String code) {
        doorB.add(code);
    }

    public Set<String> getAllParticipants() {
        Set<String> union = new HashSet<>(doorA);
        union.addAll(doorB); // add todos os participantes
        return union;
    }

    public Set<String> getBoth() {
        Set<String> inter = new HashSet<>(doorA);
        inter.retainAll(doorB); // encontra quem apareceu nas duas portas
        return inter;
    }

    public Set<String> getOnlyA() {
        Set<String> diff = new HashSet<>(doorA);
        diff.removeAll(doorB); // remove os participantes da porta B
        return diff;
    }

    public Set<String> getOnlyB() {
        Set<String> diff = new HashSet<>(doorB);
        diff.removeAll(doorA); // remove os participantes da porta A
        return diff;
    }
}
