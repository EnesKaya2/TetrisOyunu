# ⚠️ Ortak Dosyalar — Dikkat!

Videodaki yapıda bazı dosyalara birden fazla kişi kod yazıyor. Çakışma (conflict) yaşamamak için kurallar:

## `GameArea.java` — Enes + Ceren + Melisa

Oyunun kalbi bu dosya. Videolarda adım adım büyüyor. Dosyanın içinde herkes **sadece kendi bölümüne** yazacak:

| Bölüm | Sorumlu | Video | İçerik |
|-------|---------|-------|--------|
| Izgara ve çizim            | Emir   | 1    | Izgara boyutu, hücre boyutu, ızgarayı ve bloğu çizme |
| Blok üretme                | Enes   | 3, 6 | Yeni blok oluşturma, rastgele blok seçme, bloğun dışarı taşıp taşmadığı |
| Hareket ve çarpışma        | Ceren  | 2, 4 | Aşağı/sağa/sola hareket, döndürme, hızlı indirme, alt/yan çarpışma kontrolleri |
| Yerleşme, satır ve puan    | Melisa | 5    | Bloğu arka plana yerleştirme, dolu satırları silme, satırları aşağı kaydırma, temizlenen satır sayısı |

**Sıra:** Emir ızgarayı yazıp birleştirir → Enes → Ceren → Melisa. Her kişi bir önceki birleştirildikten sonra `main`'den güncelleme alıp kendi bölümünü ekler.

## `GameForm.java` — Emir + Ceren

| Bölüm | Sorumlu | Video |
|-------|---------|-------|
| Pencere, puan/seviye yazıları, sıradaki blok alanı | Emir  | 1 |
| Klavye tuş atamaları (key bindings)                | Ceren | 4 |

## `Tetris.java` — Emir + Görkem

| Bölüm | Sorumlu | Video |
|-------|---------|-------|
| `main`, oyunu başlatma, pencere geçişleri | Emir   | 1, 7 |
| Skor tablosu açma, oyun bitti → isim sorma | Görkem | 7, 8 |
| Ses çalma çağrıları                        | Görkem | 9 |

## Altın kural
Birisi ortak dosyada çalışmaya başlamadan önce WhatsApp grubuna **"GameArea'da çalışıyorum"** yazsın. Bitince push edip haber versin.
