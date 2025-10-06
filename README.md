Özgeçmiş Oluşturucu
Bu proje, Java ve iText kütüphanesi kullanarak kişisel özgeçmiş (CV) PDF dosyaları oluşturmayı sağlar.

🚀 Özellikler
PDF formatında özgeçmiş oluşturma

Fotoğraf ekleme desteği

Kişisel bilgiler, eğitim, deneyim ve yetenekler bölümleri

Otomatik masaüstüne kaydetme

PDF'in otomatik açılması

📋 Gereksinimler
Java 8 veya üzeri

Maven

iText 5.5.13.3 kütüphanesi

🛠 Kurulum
Projeyi klonlayın veya indirin

Maven bağımlılıklarını yükleyin:

bash
mvn clean install
pom.xml dosyasına iText bağımlılığını ekleyin:

xml
<dependency>
    <groupId>com.itextpdf</groupId>
    <artifactId>itextpdf</artifactId>
    <version>5.5.13.3</version>
</dependency>
📝 Kullanım
Temel Kullanım
java
public static void main(String[] args) {
    // Kod otomatik olarak masaüstüne "ozgecmis.pdf" dosyası oluşturur
}
Özelleştirme
Aşağıdaki bilgileri kendi bilgilerinizle değiştirin:

Kişisel Bilgiler: İsim, telefon, e-posta, adres

Eğitim: Üniversite, bölüm, tarih aralığı

Deneyim: Şirket adı, pozisyon, çalışma süresi

Yetenekler: Teknik beceriler ve araçlar

Fotoğraf Yolu: C:\Users\BETÜL\IdeaProjects\odevv\src\main\resources\foto.jpeg

🖼 Fotoğraf Ekleme
Fotoğrafı src/main/resources/ klasörüne ekleyin

Fotoğraf yolunu koda güncelleyin:

java
String fotoYolu = "C:\\Users\\BETÜL\\IdeaProjects\\odevv\\src\\main\\resources\\foto.jpeg";
📂 Çıktı
PDF dosyası masaüstüne kaydedilir: C:\Users\BETÜL\Desktop\ozgecmis.pdf

Konsolda kayıt yeri ve durum bilgisi görüntülenir

PDF otomatik olarak açılır

⚠️ Sorun Giderme
PDF Chrome'da Açılıyorsa
Masaüstündeki PDF dosyasını sağ tıklayın

"Birlikte aç" → "Adobe Acrobat Reader" seçin

"Her zaman bu uygulamayı kullan"ı işaretleyin

Fotoğraf Eklenmezse
Fotoğraf yolunun doğru olduğundan emin olun

Dosya uzantısının (.jpeg, .jpg, .png) doğru olduğunu kontrol edin
