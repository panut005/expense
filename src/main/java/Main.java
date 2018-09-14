import java.io.*;

public class Main {
    private static final String FILENAME = "the-file-name.txt";
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        BufferedWriter bw = null;
        FileWriter fw = null;
        BufferedReader br = null;
        FileReader fr = null;

        Account oat =new Account();
        try {

        br = new BufferedReader(new FileReader(FILENAME));
        fr = new FileReader(FILENAME);
        br = new BufferedReader(fr);

        String sCurrentLine;

        while ((sCurrentLine = br.readLine()) != null) {
            String temp[]=sCurrentLine.split(":");
            oat.addHistory(temp[0],temp[1],Double.parseDouble(temp[2]),Double.parseDouble(temp[3]));
        }

    } catch (IOException e) {

        e.printStackTrace();

    } finally {

        try {

            if (br != null)
                br.close();

            if (fr != null)
                fr.close();

        } catch (IOException ex) {

            ex.printStackTrace();

        }

    }

        oat.addData("pasttime","+",500);
        oat.addData("buy Hotdog","-",100);
        System.out.println(oat.toString());

         /*     try {

            String content = oat.getBalance()+"\n";

            fw = new FileWriter(FILENAME,true);
            bw = new BufferedWriter(fw);

            bw.write(content);

            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }*/



    }
}
