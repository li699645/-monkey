public enum Enum1 {
    a(1,"aa"),
    b(2,"cc"),
    c(3,"cc"),
    d(4,"dd");
    private int code;
    private String value;
    Enum1(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
