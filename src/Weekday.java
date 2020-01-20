public enum Weekday {

    Sunday(1,"Sunday"),
    Monday(2, "Monday"),
    Tuesday(3,"Tuesday"),
    Wednesday(4, "Wednesday"),
    Thursday(5, "Thursday"),
    Friday(6, "Friday"),
    Saturday(7,"Saturday");

    private final int value;
    private final String desc;

    Weekday(final int id, final String newDesc) {
        value = id;
        desc = newDesc;
    }

}
