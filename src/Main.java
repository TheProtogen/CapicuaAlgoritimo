import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String string = "10000700001";
        String[] newNum = string.split("");

        System.out.println(newNum.length);

        System.out.println(numProcesso(newNum));
    }
    public static String numProcesso(String[] newNum){
        int fim = newNum.length - 1;

        for (int i = 0; i < newNum.length/2; i++) {
            if(Objects.equals(newNum[i], newNum[fim])) fim--;
            else return "Não é capicua";
        }
        return "É capicua";
    }
}