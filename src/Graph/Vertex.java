package Graph;

public class Vertex {

    private char label;
    private boolean flagVisited;

    public Vertex(char label) {
        this.label = label;
        this.flagVisited = false;
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public boolean isFlagVisited() {
        return flagVisited;
    }

    public void setFlagVisited(boolean flagVisited) {
        this.flagVisited = flagVisited;
    }

}
