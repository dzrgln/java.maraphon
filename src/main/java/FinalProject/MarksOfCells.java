package FinalProject;

public enum MarksOfCells {
    MARK_SHOT("\uD83D\uDDA4"), MARK_EMPTY("🟩"), MARK_SHIP("🛥"), MARK_OREOL("\uD83D\uDFEB"), MARK_KILL("\uD83D\uDC94");
    private String p;

    public String getP() {
        return p;
    }

    MarksOfCells(String p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return p;
    }
}
