# Tetris Oyunu — Java Proje Ödevi

Java Swing ile yazılacak Tetris oyunu. **"Tetris Game with Java Swing"** video serisi (10 video) takip edilerek ekip halinde geliştirilecek.
Dosya ve sınıf adları videodaki projeyle aynı tutuldu, böylece herkes videoyu izlerken kendi dosyasını kolayca bulur.

📺 Oynatma listesi: https://www.youtube.com/playlist?list=PL8wKnrrMApCoP9xTwOmQRHsZ8_Kr9c_DY

**➡️ İlk önce okuyun: [docs/GITHUB_CALISMA_REHBERI.md](docs/GITHUB_CALISMA_REHBERI.md)**
**⚠️ Ortak dosya kuralları: [docs/ORTAK_DOSYALAR.md](docs/ORTAK_DOSYALAR.md)**

## Klasör Yapısı

```
TetrisOyunu/
├── src/
│   ├── tetris/
│   │   ├── Tetris.java           → Ana sınıf (main)             ORTAK: Emir + Görkem
│   │   ├── GameForm.java         → Oyun penceresi               Emir (+ Ceren: klavye)
│   │   ├── GameArea.java         → Izgara + oyun mantığı        ORTAK: Emir, Enes, Ceren, Melisa
│   │   ├── GameThread.java       → Otomatik aşağı inme döngüsü  Ceren
│   │   ├── TetrisBlock.java      → Blok yapısı                  Enes
│   │   ├── StartupForm.java      → Giriş menüsü (START)         Emir
│   │   ├── LeaderboardForm.java  → Skor tablosu + kayıt         Görkem
│   │   └── AudioPlayer.java      → Sesler                       Görkem
│   └── tetrisblocks/             → 7 blok türü (I J L O S T Z)  Enes
├── resources/sounds/             → Ses dosyaları                Görkem
├── data/                         → Skor kayıt dosyası           Görkem
├── dist/                         → Çalıştırılabilir JAR         Görkem
├── lib/                          → Harici kütüphaneler (gerekirse)
└── docs/
    ├── gorevler/                 → Kişi başı görev listeleri (Emir.md, Enes.md, ...)
    ├── GOREV_DAGILIMI.md
    ├── BIRLESTIRME_PLANI.md
    ├── ORTAK_DOSYALAR.md
    ├── VIDEOLAR.md
    └── GITHUB_CALISMA_REHBERI.md
```

## Ekip ve Görevler

| Kişi | Videolar | Dosyalar | Görev listesi |
|------|----------|----------|---------------|
| Emir   | 1             | `GameForm`, `StartupForm`, `Tetris`*, `GameArea`*      | [Emir.md](docs/gorevler/Emir.md) |
| Enes   | 3, 6          | `TetrisBlock`, `tetrisblocks/*`, `GameArea`*           | [Enes.md](docs/gorevler/Enes.md) |
| Ceren  | 2, 4          | `GameThread`, `GameArea`*, `GameForm`*                 | [Ceren.md](docs/gorevler/Ceren.md) |
| Melisa | 5 (+3 destek) | `GameArea`*, `GameThread`*                             | [Melisa.md](docs/gorevler/Melisa.md) |
| Görkem | 7, 8, 9       | `LeaderboardForm`, `AudioPlayer`, `Tetris`*            | [Gorkem.md](docs/gorevler/Gorkem.md) |
| Herkes | 10            | Son testler, hata düzeltme, sunum                      | |

\* Ortak dosya — [ORTAK_DOSYALAR.md](docs/ORTAK_DOSYALAR.md) kurallarına uyun.

## Çalıştırma (VS Code)

1. VS Code'a **Extension Pack for Java** eklentisini kurun.
2. `TetrisOyunu` klasörünü VS Code ile açın.
3. `src/tetris/Tetris.java` dosyasını açıp **Run** deyin.

> **Not:** Videoda pencereler (GameForm, StartupForm, LeaderboardForm) NetBeans'in sürükle-bırak tasarım aracıyla yapılıyorsa, VS Code'da bu araç yok. O kısımlarda düğme/yazı gibi öğeleri kodla eklemek gerekecek; mantık kısmı (GameArea, GameThread, TetrisBlock) videodakiyle aynı yazılabilir.
