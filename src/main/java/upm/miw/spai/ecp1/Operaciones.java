package upm.miw.spai.ecp1;

public class Operaciones {

    private int int1, int2;

    public Operaciones(int int1, int int2) {
        this.int1 = int1;
        this.int2 = int2;
    }

    public int sumarInts(int int1, int int2) {
        return int1 + int2;
    }

    public float sumarFloats(float float1, float float2) {
        return float1 + float2;
    }

    public int getInt1() {
        return int1;
    }

    public void setInt1(int int1) {
        this.int1 = int1;
    }

    public int getInt2() {
        return int2;
    }

    public void setInt2(int int2) {
        this.int2 = int2;
    }

}
