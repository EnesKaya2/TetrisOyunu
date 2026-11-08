# 👤 Enes — Bloklar ve Yeni Blok Üretimi
📹 3. video: Spawning new blocks
📹 6. video: Adding other block types

## Görevler
- [ ] Blok yapısını oluştur (şekil, renk, konum bilgisi)
- [ ] 7 blok türünü hazırla: I, J, L, O, S, T, Z
- [ ] Rastgele blok seçimini yap
- [ ] Blok yerleşince yeni blok gelmesini sağla
- [ ] Sıradaki blok bilgisini Emir'e aktar

## Dosyalar
| Dosya | Açıklama |
|-------|----------|
| `TetrisBlock.java`  | Tüm blokların temel sınıfı (şekil, renk, konum) |
| `BlockSpawner.java` | Rastgele blok seçimi, yeni blok üretimi, sıradaki blok |
| `shapes/IShape.java` … `shapes/ZShape.java` | 7 blok türü |

## Kime ne verecek?
- Emir → sıradaki blok bilgisi
- Ceren → hareket ettirilecek aktif blok
