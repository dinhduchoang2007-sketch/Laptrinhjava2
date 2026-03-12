package Slide1;

public class Xe {
	private String hangXe;
    private int NamSanXuat;

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public int getNamSanXuat() {
        return NamSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        NamSanXuat = namSanXuat;
    }

    @Override
    public String toString() {
        return "Xe [hangXe=" + hangXe + ", namSanXuat=" + NamSanXuat + "]";
    }
}
