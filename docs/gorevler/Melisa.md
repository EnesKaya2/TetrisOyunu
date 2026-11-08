# 👤 Melisa — Satır Temizleme ve Puanlama
📹 5. video: Clearing complete lines
📹 Destek: 3. video
Dal: `melisa-satir-puan`

## Görevler
- [ ] `GameArea.java` → "Yerleşme, satır ve puan" bölümü:
  - [ ] Yere oturan bloğu arka plana (background) kaydet
  - [ ] Yerleşmiş blokları çiz
  - [ ] Dolu satırları bul ve temizle
  - [ ] Üstteki satırları aşağı kaydır
  - [ ] Temizlenen satır sayısını döndür
- [ ] Puan ve seviye hesabı (`GameThread.java` içinde Ceren ile birlikte)
- [ ] Yeni blok için yer kalmadığında oyunu bitir

## Dosyaların
`GameArea.java` (ortak) · `GameThread.java` (Ceren ile)

## Kimden ne alacak / kime ne verecek?
- Ceren → yere oturan blok
- Enes → "yeni blok üret" sinyali
- Emir → puan, seviye, oyun bitti bilgisi
- Görkem → oyun sonu puanı
