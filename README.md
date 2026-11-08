# Tetris Oyunu — Java Proje Ödevi

Java Swing ile yazılacak Tetris oyunu. 10 videoluk oynatma listesi takip edilerek ekip halinde geliştirilecek.

## Klasör Yapısı

```
TetrisOyunu/
├── .vscode/                 → VS Code Java ayarları
├── src/tetris/
│   ├── Main.java            → Programın giriş noktası (ORTAK)
│   ├── ui/                  → 👤 Emir    — Oyun arayüzü
│   ├── blocks/              → 👤 Enes    — Bloklar ve yeni blok üretimi
│   │   └── shapes/          →            7 blok türü (I, J, L, O, S, T, Z)
│   ├── controls/            → 👤 Ceren   — Hareket ve klavye kontrolleri
│   ├── board/               → 👤 Melisa  — Satır temizleme ve puanlama
│   ├── leaderboard/         → 👤 Görkem  — Skor tablosu ve kayıt
│   └── audio/               → 👤 Görkem  — Sesler
├── resources/sounds/        → Ses dosyaları (Görkem)
├── data/                    → Kaydedilen skor dosyası (Görkem)
├── dist/                    → Çalıştırılabilir JAR çıktısı (Görkem)
├── lib/                     → Harici kütüphaneler (gerekirse)
└── docs/                    → Görev dağılımı, videolar, birleştirme planı
```

Her paketin içinde o kişinin görevlerini anlatan bir **GOREV.md** dosyası var.

## Ekip ve Görevler

| Kişi | Paket | Videolar | Kısaca Görev |
|------|-------|----------|--------------|
| Emir   | `ui`                   | 1             | Oyun penceresi, ızgara, puan/seviye/sıradaki blok alanları, START/RESET |
| Enes   | `blocks`               | 3, 6          | Blok şekil/renk/konum, 7 blok türü, rastgele blok, yeni blok gelmesi |
| Ceren  | `controls`             | 2, 4          | Otomatik düşme, sağ-sol, döndürme, hızlı indirme, çarpışma kontrolü |
| Melisa | `board`                | 5 (+3 destek) | Yerleşmiş bloklar, satır temizleme, puan, oyun sonu |
| Görkem | `leaderboard`, `audio` | 7, 8, 9       | Skor tablosu, dosyaya kayıt/yükleme, sesler, JAR paketleme |
| Herkes | —                      | 10            | Son testler, hata düzeltme, sunum |

**➡️ Ekip olarak nasıl çalışacağız: [docs/GITHUB_CALISMA_REHBERI.md](docs/GITHUB_CALISMA_REHBERI.md)**

Detaylar: [docs/GOREV_DAGILIMI.md](docs/GOREV_DAGILIMI.md) · [docs/BIRLESTIRME_PLANI.md](docs/BIRLESTIRME_PLANI.md) · [docs/VIDEOLAR.md](docs/VIDEOLAR.md)

## Çalıştırma (VS Code)

1. VS Code'a **Extension Pack for Java** eklentisini kurun.
2. `TetrisOyunu` klasörünü VS Code ile açın.
3. `src/tetris/Main.java` dosyasını açıp **Run** deyin.
