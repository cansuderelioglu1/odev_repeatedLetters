
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] kelimeList = new String[]{"kalem","elalem,", "kelam","kelime"};

        ArrayList<Character> harfListesi = new ArrayList<>();

        // Tekrar eden harf içeren kelimelerin harflerini harfListesi'ne ekle
        for (String kelime : kelimeList) {
            for (int i = 0; i < kelime.length(); i++) {
                for (int j = i + 1; j < kelime.length(); j++) {
                    if (kelime.charAt(i) == kelime.charAt(j)) {
                        for (char harf : kelime.toCharArray()) {
                            if (!harfListesi.contains(harf)) {
                                harfListesi.add(harf);
                            }
                        }
                        break;
                    }
                }
            }
        }

        // Yeni metni oluştur
        StringBuilder yeniMetin = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 10; i++) { // Yeni metnin uzunluğu, istediğiniz uzunluğa göre ayarlanabilir
            char rastgeleHarf = harfListesi.get(random.nextInt(harfListesi.size()));
            yeniMetin.append(rastgeleHarf);
        }

        System.out.println("Oluşturulan metin: " + yeniMetin.toString());
    }
}
