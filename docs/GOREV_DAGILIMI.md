# Görev Dağılımı

Ayrıntılı, işaretlenebilir görev listeleri: [gorevler/](gorevler/)

## 👤 Emir — Oyun arayüzü → [Emir.md](gorevler/Emir.md)
📹 1. video: Drawing a Tetris block
Mevcut oyun penceresini ve ızgarayı düzenleyecek. Puan, seviye ve sıradaki blok alanlarını hazırlayacak. Diğer bölümler tamamlandığında bu alanları gerçek verilere, START ve RESET düğmelerini oyun işlemlerine bağlayacak.
**Dosyalar:** `GameForm.java`, `StartupForm.java`, `Tetris.java`*, `GameArea.java`*

## 👤 Enes — Bloklar ve yeni blok üretimi → [Enes.md](gorevler/Enes.md)
📹 3. video: Spawning new blocks
📹 6. video: Adding other block types
Blokların şekil, renk ve konum bilgilerini oluşturacak. Yedi blok türünü hazırlayacak, rastgele blok seçimini ve bir blok yerleşince yenisinin gelmesini sağlayacak. Sıradaki blok bilgisini Emir'e aktaracak.
**Dosyalar:** `TetrisBlock.java`, `tetrisblocks/*Shape.java`, `GameArea.java`*

## 👤 Ceren — Hareket ve klavye kontrolleri → [Ceren.md](gorevler/Ceren.md)
📹 2. video: Moving block down
📹 4. video: Adding controls using key bindings
Blokların kendiliğinden aşağı inmesini, sağa-sola hareketini, döndürülmesini ve hızlı indirilmesini yapacak. Blokların duvarlardan ve yerleşmiş blokların içinden geçmesini engelleyecek.
**Dosyalar:** `GameThread.java`, `GameArea.java`*, `GameForm.java`*

## 👤 Melisa — Satır temizleme ve puanlama → [Melisa.md](gorevler/Melisa.md)
📹 5. video: Clearing complete lines
📹 Destek olarak 3. video
Yerleşmiş blokları oyun alanında tutacak. Dolu satırları temizleyip üstteki blokları aşağı kaydıracak. Puanı hesaplayacak ve yeni blok için yer kalmadığında oyunun bitmesini sağlayacak.
**Dosyalar:** `GameArea.java`*, `GameThread.java`*

## 👤 Görkem — Skor tablosu, kayıt ve ses → [Gorkem.md](gorevler/Gorkem.md)
📹 7. video: Adding a leaderboard
📹 8. video: Saving/loading the leaderboard data
📹 9. video: Adding sounds and building the game
Oyuncu adı ve puanların sıralandığı tabloyu hazırlayacak. Skorları dosyaya kaydedip tekrar yükleyecek, sesleri ekleyecek ve birleştirilen oyunu çalıştırılabilir JAR olarak paketleyecek.
**Dosyalar:** `LeaderboardForm.java`, `AudioPlayer.java`, `Tetris.java`*

## 👥 Herkes
📹 10. video: Summary & Wrap-Up
Son testleri, hata düzeltmelerini ve sunumu birlikte yapacağız. Herkes kendi yazdığı bölümü açıklayabilecek şekilde hazırlanacak.

\* Ortak dosya — bkz. [ORTAK_DOSYALAR.md](ORTAK_DOSYALAR.md)
