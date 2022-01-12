import java.awt.*;

public class colorData extends Color {
     int v1;
     int v2;
     int v3;


    public colorData(int v1, int v2, int v3) {
        super(v1, v2, v3);
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }

    public int getV3() {
        return v3;
    }

    public void setV3(int v3) {
        this.v3 = v3;
    }

}
