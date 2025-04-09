import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Nacitani {
    private String text;
    int pocitadloRadku;


    public Nacitani() {
        this.text = "";
        this.pocitadloRadku = 0;
    }

    public String nacteniTextu() throws IOException {
        FileReader fileReader = new FileReader("text.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine())!=null){
            text = text+line;
            pocitadloRadku++;
        }
        bufferedReader.close();
        fileReader.close();
        return "Nahráno1";
    }
    public String nahrani() throws IOException {
        FileWriter fileWriter = new FileWriter("text_comma.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(text.replaceAll(",",""));
        bufferedWriter.close();
        return "Nahráno2";
    }
    public String nalezeniOtec(){
        int pocitadlo = 0;
        Pattern p = Pattern.compile("otec");
        Matcher m = p.matcher(text);
        while (m.find()){
            pocitadlo++;
        }
        return "V textu se nachází "+pocitadlo+" otců";
    }
    public String pocetRadku() {
        String[] radky = text.split("\\n");
        return "Počet radku"+ radky.length;
    }
    public String pocetSlov() {
        String[] slova = text.split("\\s+");
        return "Počet slov: "+slova.length;
    }
    public String pocetRadku2(){
        return "Počet řádků 2 je: "+pocitadloRadku;
    }
}
