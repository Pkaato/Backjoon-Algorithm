import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String last = "??!";

        String readValue = br.readLine();
        System.out.println(readValue + last);
    }
}
