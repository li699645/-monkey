package org.example.practice2.baseEnum;

public enum BaseEnum {
    a(1, "成功"),
    b(2,"失败"),
    c(3,"有所收获" );

    public Integer getCode;
    private int code;
    private String desc;
    BaseEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }


    public String getDesc() {
        return desc;
    }
}
