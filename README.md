# Tetris Oyunu — Java Proje Ödevi

Java Swing ile yazılacak Tetris oyunu. **"Tetris Game with Java Swing"** video serisi (10 video) takip edilerek ekip halinde geliştirilecek.

📺 Oynatma listesi: https://www.youtube.com/playlist?list=PL8wKnrrMApCoP9xTwOmQRHsZ8_Kr9c_DY

## Dosya Yapısı

```
TetrisOyunu/
└── src/tetris/
    ├── Tetris.java        → Ana sınıf (main)            Emir + Görkem
    ├── GameForm.java      → Oyun penceresi              Emir (klavye: Ceren)
    ├── GameArea.java      → Izgara + oyun mantığı       Emir + Enes + Ceren + Melisa
    ├── GameThread.java    → Otomatik aşağı inme         Ceren (puan/seviye: Melisa)
    └── TetrisBlock.java   → Blok yapısı                 Enes
```

Videolar ilerledikçe yeni dosyalar eklenecek:
- **Enes (6. video):** `src/tetrisblocks/` klasörü ve 7 blok türü (`IShape`, `JShape`, `LShape`, `OShape`, `SShape`, `TShape`, `ZShape`)
- **Görkem (7–9. video):** skor tablosu, giriş menüsü ve ses dosyaları

---

# 👥 Görev Dağılımı

## 👤 Emir — Oyun arayüzü
📹 1. video: Drawing a Tetris block
**Dosyalar:** `GameForm.java`, `Tetris.java`, `GameArea.java` (ızgara bölümü)
**Dal:** `emir-arayuz`

- [ ] Oyun penceresini oluştur/düzenle
- [ ] Izgarayı çiz (`GameArea`: satır, sütun, hücre boyutu ayrı değişkenlerde olsun)
- [ ] Puan alanını hazırla
- [ ] Seviye alanını hazırla
- [ ] Sıradaki blok alanını hazırla
- [ ] START ve RESET düğmeleri
- [ ] Diğer bölümler bitince alanları gerçek verilere, düğmeleri oyun işlemlerine bağla

## 👤 Enes — Bloklar ve yeni blok üretimi
📹 3. video: Spawning new blocks
📹 6. video: Adding other block types
**Dosyalar:** `TetrisBlock.java`, `GameArea.java` (blok üretme bölümü), `tetrisblocks/` (6. video)
**Dal:** `enes-bloklar`

- [ ] Blok yapısı: şekil, renk, konum bilgisi
- [ ] Blokların 4 dönüş hâli
- [ ] Yeni blok oluşturma (`spawnBlock`)
- [ ] Rastgele blok seçimi
- [ ] 7 blok türü: I, J, L, O, S, T, Z
- [ ] Bir blok yerleşince yenisinin gelmesi
- [ ] Sıradaki blok bilgisini Emir'e aktar

## 👤 Ceren — Hareket ve klavye kontrolleri
📹 2. video: Moving block down
📹 4. video: Adding controls using key bindings
**Dosyalar:** `GameThread.java`, `GameArea.java` (hareket bölümü), `GameForm.java` (klavye bölümü), `TetrisBlock.java` (hareket metotları)
**Dal:** `ceren-kontroller`

- [ ] Bloğun kendiliğinden aşağı inmesi (`GameThread`)
- [ ] Sağa / sola hareket
- [ ] Döndürme
- [ ] Hızlı indirme
- [ ] Duvarlardan geçmeyi engelle
- [ ] Yerleşmiş blokların içinden geçmeyi engelle
- [ ] Klavye tuş atamaları (key bindings)

## 👤 Melisa — Satır temizleme ve puanlama
📹 5. video: Clearing complete lines
📹 Destek: 3. video
**Dosyalar:** `GameArea.java` (yerleşme ve satır bölümü), `GameThread.java` (puan/seviye)
**Dal:** `melisa-satir-puan`

- [ ] Yerleşmiş blokları oyun alanında tut (arka plan)
- [ ] Dolu satırları bul ve temizle
- [ ] Üstteki blokları aşağı kaydır
- [ ] Puan ve seviye hesabı
- [ ] Yeni blok için yer kalmadığında oyunu bitir

## 👤 Görkem — Skor tablosu, kayıt ve ses
📹 7. video: Adding a leaderboard
📹 8. video: Saving/loading the leaderboard data
📹 9. video: Adding sounds and building the game
**Dosyalar:** `Tetris.java` + videolarda eklenecek yeni dosyalar
**Dal:** `gorkem-skor-ses`

- [ ] Oyuncu adı ve puanların sıralandığı tablo (önce örnek puanlarla)
- [ ] Skorları dosyaya kaydet
- [ ] Skorları dosyadan yükle
- [ ] Sesleri ekle
- [ ] Oyunu çalıştırılabilir JAR olarak paketle

## 👥 Herkes
📹 10. video: Summary & Wrap-Up
- [ ] Son testler ve hata düzeltmeleri
- [ ] Sunum — herkes kendi yazdığı bölümü açıklayabilecek şekilde hazırlanacak

---

# 🔀 İlerleme Sırası

Videolar birbirinin üzerine kurulduğu için **sıra önemli**. Her aşamada kodlar birleştirilip kontrol edilecek.

1. [ ] **Emir** — pencere ve ızgara (1. video)
2. [ ] **Enes** — `TetrisBlock` ve yeni blok üretme (3. video)
3. [ ] **Ceren** — aşağı inme ve klavye kontrolleri (2. ve 4. video)
4. [ ] **Melisa** — yerleşme, satır temizleme, puan, oyun sonu (5. video)
5. [ ] **Enes** — 7 blok türü (6. video)
6. [ ] **Görkem** — skor tablosu (bu sırada örnek puanlarla hazırlayabilir), kayıt, ses, JAR (7–9. video)
7. [ ] **Emir** — puan, seviye, sıradaki blok ve START/RESET'i gerçek verilere bağlama
8. [ ] **Herkes** — test, hata düzeltme, sunum (10. video)

## ⚠️ Ortak Dosyalar

`GameArea.java`, `GameForm.java`, `Tetris.java` ve `TetrisBlock.java` dosyalarına birden fazla kişi yazıyor.

- Herkes **sadece kendi bölümüne** yazar.
- Ortak dosyada çalışmaya başlamadan önce gruba **"GameArea'da çalışıyorum"** gibi haber verin, bitince push edip yine haber verin.
- Bir önceki kişinin kodu `main`'e birleşmeden ortak dosyaya başlamayın.

---

# 🛠️ GitHub Çalışma Rehberi

## 0. Bir kerelik hazırlık

1. GitHub hesabı açın ve kullanıcı adınızı Enes'e gönderin. Enes sizi **Settings → Collaborators** bölümünden ekleyecek, gelen daveti e-postadan kabul edin.
2. [GitHub Desktop](https://desktop.github.com/) kurun ve hesabınızla giriş yapın.
3. VS Code'a **Extension Pack for Java** eklentisini kurun.

## 1. Projeyi bilgisayarınıza indirin (clone)

GitHub Desktop → **File → Clone repository → URL** → `EnesKaya2/TetrisOyunu` → **Clone**

Sonra **Repository → Open in Visual Studio Code**.

## 2. Kendi dalınızı (branch) açın

**`main` dalına doğrudan yazmıyoruz.** Herkes kendi dalında çalışır.

GitHub Desktop → **Current Branch → New Branch** → yukarıdaki görev listesinde yazan dal adınızı girin.

## 3. Çalışma döngüsü

1. Başlamadan önce: **Fetch origin** → **Branch → Update from main** (son değişiklikleri alın).
2. Sadece size ait dosyaları / bölümleri değiştirin.
3. Bir parça bitince sol altta kısa bir açıklama yazın → **Commit**.
4. **Push origin** ile GitHub'a gönderin.
5. Bu README'deki görev listenizde bitirdiğiniz maddeleri `- [x]` yapın.

> ⚠️ `bin/` klasörünü ve `.class` dosyalarını commit'e **eklemeyin** (GitHub Desktop'ta tiklerini kaldırın).

## 4. Birleştirme (Pull Request)

Bir bölüm çalışır hale gelince:

1. GitHub Desktop → **Branch → Create Pull Request**.
2. Açılan sayfada ne yaptığınızı kısaca yazın → **Create pull request**.
3. Ekipten biri kontrol edip **Merge** eder.

## 5. İlerlemeyi takip

- **Commits** sekmesi: kim ne zaman ne yaptı.
- **Pull requests** sekmesi: birleştirilmeyi bekleyen işler.
- Bu README'deki görev listeleri: işaretlenmiş maddeler.

## Kurallar

- Başkasının bölümünü değiştirmeden önce ona haber verin.
- Çalışmayan (derlenmeyen) kodu `main`'e birleştirmeyin.
- Sık sık commit + push yapın, işi biriktirmeyin.

---

## ▶️ Çalıştırma (VS Code)

1. VS Code'a **Extension Pack for Java** eklentisini kurun.
2. `TetrisOyunu` klasörünü VS Code ile açın.
3. `src/tetris/Tetris.java` dosyasını açıp **Run** deyin.
