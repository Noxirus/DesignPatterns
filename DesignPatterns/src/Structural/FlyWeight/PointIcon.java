package Structural.FlyWeight;

public class PointIcon {
    private final PointType type; //4 bytes
    private final byte[] icon; // 20KB

    public PointIcon(PointType type, byte[] icon) {
        this.type = type;
        this.icon = icon;
    }

    public PointType getType() {
        return type;
    }

    public byte[] getIcon() {
        return icon;
    }
}
