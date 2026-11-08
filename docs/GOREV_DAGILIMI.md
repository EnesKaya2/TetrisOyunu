# Görev Dağılımı

## 👤 Emir — Oyun arayüzü (`src/tetris/ui`)
📹 1. video: Drawing a Tetris block
- Mevcut oyun penceresini ve ızgarayı düzenleyecek.
- Puan, seviye ve sıradaki blok alanlarını hazırlayacak.
- Diğer bölümler tamamlandığında bu alanları gerçek verilere bağlayacak.
- START ve RESET düğmelerini oyun işlemlerine bağlayacak.

## 👤 Enes — Bloklar ve yeni blok üretimi (`src/tetris/blocks`)
📹 3. video: Spawning new blocks
📹 6. video: Adding other block types
- Blokların şekil, renk ve konum bilgilerini oluşturacak.
- Yedi blok türünü (I, J, L, O, S, T, Z) hazırlayacak.
- Rastgele blok seçimini yapacak.
- Bir blok yerleşince yenisinin gelmesini sağlayacak.
- Sıradaki blok bilgisini Emir'e aktaracak.

## 👤 Ceren — Hareket ve klavye kontrolleri (`src/tetris/controls`)
📹 2. video: Moving block down
📹 4. video: Adding controls using key bindings
- Blokların kendiliğinden aşağı inmesini sağlayacak.
- Sağa-sola hareket, döndürme ve hızlı indirmeyi yapacak.
- Blokların duvarlardan ve yerleşmiş blokların içinden geçmesini engelleyecek.

## 👤 Melisa — Satır temizleme ve puanlama (`src/tetris/board`)
📹 5. video: Clearing complete lines
📹 Destek: 3. video
- Yerleşmiş blokları oyun alanında tutacak.
- Dolu satırları temizleyip üstteki blokları aşağı kaydıracak.
- Puanı hesaplayacak.
- Yeni blok için yer kalmadığında oyunun bitmesini sağlayacak.

## 👤 Görkem — Skor tablosu, kayıt ve ses (`src/tetris/leaderboard`, `src/tetris/audio`)
📹 7. video: Adding a leaderboard
📹 8. video: Saving/loading the leaderboard data
📹 9. video: Adding sounds and building the game
- Oyuncu adı ve puanların sıralandığı tabloyu hazırlayacak.
- Skorları dosyaya kaydedip tekrar yükleyecek (`data/` klasörü).
- Sesleri ekleyecek (`resources/sounds/` klasörü).
- Birleştirilen oyunu çalıştırılabilir JAR olarak paketleyecek (`dist/` klasörü).

## 👥 Herkes
📹 10. video: Summary & Wrap-Up
- Son testler, hata düzeltmeleri ve sunum birlikte yapılacak.
- Herkes kendi yazdığı bölümü açıklayabilecek şekilde hazırlanacak.
