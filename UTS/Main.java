package UTS;

public class Main {
    public static void main(String[] args){
        stackme stack = new Stack();
        String inputan = stackme.Input_Stack();

        String cek = stackme.convStrToStack(inputan);
        if (cek != "x"){
            stackme.cekInput(stackme.stackAngka,inputan);
        }
    }
}