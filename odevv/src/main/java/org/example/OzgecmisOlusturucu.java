import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.File;
import java.awt.Desktop;

public class OzgecmisOlusturucu {

    public static void main(String[] args) {
        String masaustuYolu = System.getProperty("user.home") + "\\Desktop\\ozgecmis.pdf";

        try {
            System.out.println("Özgeçmiş PDF oluşturuluyor...");

            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(masaustuYolu));
            document.open();

            // FOTOĞRAF EKLE
            try {
                String fotoYolu = "C:\\Users\\BETÜL\\IdeaProjects\\odevv\\src\\main\\resources\\foto.jpeg";
                Image foto = Image.getInstance(fotoYolu);
                foto.scaleToFit(150, 150); // Boyut ayarla
                foto.setAlignment(Image.ALIGN_CENTER);
                document.add(foto);
                System.out.println("Fotoğraf eklendi");
            } catch (Exception e) {
                System.out.println(" Fotoğraf eklenemedi: " + e.getMessage());
            }

            document.add(new Paragraph(" "));

            // BAŞLIK
            Paragraph baslik = new Paragraph("BETÜL SEZEN");
            baslik.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(baslik);

            document.add(new Paragraph(" "));

            // İLETİŞİM
            document.add(new Paragraph("Telefon: 0555 555 55 55"));
            document.add(new Paragraph("E-posta: betulsezn@gmail.com"));
            document.add(new Paragraph("Adres: Istanbul, Turkiye"));

            document.add(new Paragraph(" "));

            // EĞİTİM
            document.add(new Paragraph("Egitim:"));
            document.add(new Paragraph("Kirklareli Universitesi"));
            document.add(new Paragraph("Yazilim Muhendisligi (2024-2028)"));

            document.add(new Paragraph(" "));

            // DENEYİM
            document.add(new Paragraph("Deneyim:"));
            document.add(new Paragraph("A Teknoloji - Kidemli Yazilim Gelistirici"));
            document.add(new Paragraph("B şirketi siber güvenlik uzmanı 2022-2023"));
            document.add(new Paragraph("Metro istanbul - yazilim test uzmani 2023- devam ediyor"));

            document.add(new Paragraph(" "));

            // YETENEKLER
            document.add(new Paragraph("Yetenekler:"));
            document.add(new Paragraph("Java, Spring Boot, MySQL, Docker"));

            document.close();

            // KONTROL ET
            File pdfDosyasi = new File(masaustuYolu);
            if (pdfDosyasi.exists()) {
                System.out.println(" PDF oluşturuldu: " + masaustuYolu);

                // PDF'İ AÇ
                try {
                    Desktop.getDesktop().open(pdfDosyasi);
                } catch (Exception e) {
                    System.out.println("PDF manuel açılmalı");
                }
            }

        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
