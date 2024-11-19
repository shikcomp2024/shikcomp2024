
import java.util.Scanner;

public class Number_System_Conversion {
    static String BNo = "", DNo = "", ONo = "", HNo = "";
    static char C;

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number System");
        System.out.println("B-Binary, D-Decimal, O-Octal, H-Hexadecimal");
        C = in.next().charAt(0);
        System.out.println("Enter a Number");
        if (C == 'B') {
            BNo = in.next();
        }
        if (C == 'D') {
            DNo = in.next();
        }
        if (C == 'O') {
            ONo = in.next();
        }
        if (C == 'H') {
            HNo = in.next();
        }
    }

    public void BtoD() {
        int pointIndex = BNo.indexOf('.');
        if (pointIndex == -1) pointIndex = BNo.length();

        double result = 0;
        for (int i = 0; i < pointIndex; i++) {
            result = result * 2 + (BNo.charAt(i) - '0');
        }
        for (int i = pointIndex + 1; i < BNo.length(); i++) {
            result += (BNo.charAt(i) - '0') / Math.pow(2, i - pointIndex);
        }
        DNo = String.valueOf(result);
    }

    public void DtoB() {
        double num = Double.parseDouble(DNo);
        int intPart = (int) num;
        double fracPart = num - intPart;
        StringBuilder binary = new StringBuilder();

        while (intPart > 0) {
            binary.insert(0, intPart % 2);
            intPart /= 2;
        }

        binary.append('.');
        for (int i = 0; i < 4; i++) {
            fracPart *= 2;
            if (fracPart >= 1) {
                binary.append(1);
                fracPart -= 1;
            } else {
                binary.append(0);
            }
        }

        BNo = binary.toString();
    }

    public void DtoH() {
        double num = Double.parseDouble(DNo);
        int intPart = (int) num;
        double fracPart = num - intPart;
        StringBuilder hex = new StringBuilder();

        while (intPart > 0) {
            int remainder = intPart % 16;
            hex.insert(0, Integer.toHexString(remainder).toUpperCase());
            intPart /= 16;
        }

        hex.append('.');
        for (int i = 0; i < 4; i++) {
            fracPart *= 16;
            int digit = (int) fracPart;
            hex.append(Integer.toHexString(digit).toUpperCase());
            fracPart -= digit;
        }

        HNo = hex.toString();
    }

    public void HtoD() {
        int pointIndex = HNo.indexOf('.');
        if (pointIndex == -1) pointIndex = HNo.length();

        double result = 0;
        for (int i = 0; i < pointIndex; i++) {
            result = result * 16 + Integer.parseInt(String.valueOf(HNo.charAt(i)), 16);
        }
        for (int i = pointIndex + 1; i < HNo.length(); i++) {
            result += Integer.parseInt(String.valueOf(HNo.charAt(i)), 16) / Math.pow(16, i - pointIndex);
        }
        DNo = String.valueOf(result);
    }

    public void DtoO() {
        double num = Double.parseDouble(DNo);
        int intPart = (int) num;
        double fracPart = num - intPart;
        StringBuilder octal = new StringBuilder();

        while (intPart > 0) {
            octal.insert(0, intPart % 8);
            intPart /= 8;
        }

        octal.append('.');
        for (int i = 0; i < 4; i++) {
            fracPart *= 8;
            int digit = (int) fracPart;
            octal.append(digit);
            fracPart -= digit;
        }

        ONo = octal.toString();
    }

    public void OtoD() {
        int pointIndex = ONo.indexOf('.');
        if (pointIndex == -1) pointIndex = ONo.length();

        double result = 0;
        for (int i = 0; i < pointIndex; i++) {
            result = result * 8 + (ONo.charAt(i) - '0');
        }
        for (int i = pointIndex + 1; i < ONo.length(); i++) {
            result += (ONo.charAt(i) - '0') / Math.pow(8, i - pointIndex);
        }
        DNo = String.valueOf(result);
    }

    public static void main(String[] args) {
        Number_System_Conversion ob = new Number_System_Conversion();
        ob.input();
        if (C == 'B') {
            ob.BtoD();
            ob.DtoO();
            ob.DtoH();
        }
        if (C == 'D') {
            ob.DtoB();
            ob.DtoO();
            ob.DtoH();
        }
        if (C == 'O') {
            ob.OtoD();
            ob.DtoB();
            ob.DtoH();
        }
        if (C == 'H') {
            ob.HtoD();
            ob.DtoB();
            ob.DtoO();
        }
        System.out.println("Binary Number= " + BNo);
        System.out.println("Decimal Number= " + DNo);
        System.out.println("Octal Number= " + ONo);
        System.out.println("Hexadecimal Number= " + HNo);
    }
}
