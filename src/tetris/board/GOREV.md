# 👤 Melisa — Satır Temizleme ve Puanlama
📹 5. video: Clearing complete lines
📹 Destek: 3. video

## Görevler
- [ ] Yerleşmiş blokları oyun alanında tut
- [ ] Dolu satırları bul ve temizle
- [ ] Üstteki blokları aşağı kaydır
- [ ] Puanı hesapla (seviye bilgisi dahil)
- [ ] Yeni blok için yer kalmadığında oyunu bitir

## Dosyalar
| Dosya | Açıklama |
|-------|----------|
| `Board.java`           | Yerleşmiş blokların tutulduğu oyun alanı (arka plan) |
| `LineClearer.java`     | Dolu satır bulma, temizleme ve aşağı kaydırma |
| `ScoreManager.java`    | Puan ve seviye hesaplama |
| `GameOverChecker.java` | Oyun bitti kontrolü |

## Kimden ne alacak / kime ne verecek?
- Ceren → yere oturan blok
- Enes → "yeni blok üret" sinyali
- Emir → puan, seviye, oyun bitti bilgisi
- Görkem → oyun sonu puanı
