import java.util.HashSet;
import java.util.Set;

public class TaskSeven {
    public String first;
    public String last;

    public TaskSeven(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode() && this.getClass().equals(o.getClass());
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = hash * 23 + first.hashCode();
        hash = hash * 23 + last.hashCode();
        return hash;
    }

    public static void main(String[] args) {
        Set<TaskSeven> s = new HashSet<>();
        s.add(new TaskSeven("Donald", "Duck"));
        System.out.println(s.contains(new TaskSeven("Donald", "Duck")));
    }
}