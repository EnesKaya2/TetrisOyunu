# Birleştirme Planı / İlerleme Sırası

Kodlar her aşamada birleştirilip kontrol edilecek.

- [ ] **Aşama 1** — Emir'in ekranı (`ui`) + Enes'in ilk blok yapısı (`blocks`) birleştirilecek.
- [ ] **Aşama 2** — Ceren hareketleri ekleyecek (`controls`).
- [ ] **Aşama 3** — Melisa yerleşme ve satır temizlemeyi ekleyecek (`board`).
- [ ] **Paralel** — Görkem bu sırada örnek puanlarla skor tablosunu hazırlayacak (`leaderboard`).
- [ ] **Aşama 4** — Görkem skor kaydı/yükleme ve sesleri ekleyecek (`leaderboard`, `audio`).
- [ ] **Aşama 5** — Emir puan/seviye/sıradaki blok alanlarını ve START/RESET düğmelerini gerçek verilere bağlayacak.
- [ ] **Aşama 6** — Görkem oyunu JAR olarak paketleyecek (`dist/`).
- [ ] **Aşama 7** — Herkes: son testler, hata düzeltmeleri, sunum (10. video).

## Paketler Arası Bağlantılar

| Veren | Alan | Ne aktarılıyor |
|-------|------|----------------|
| Enes (`blocks`)    | Emir (`ui`)            | Sıradaki blok bilgisi |
| Enes (`blocks`)    | Ceren (`controls`)     | Hareket ettirilecek aktif blok |
| Ceren (`controls`) | Melisa (`board`)       | Yere oturan blok |
| Melisa (`board`)   | Enes (`blocks`)        | "Blok yerleşti, yenisini üret" sinyali |
| Melisa (`board`)   | Emir (`ui`)            | Puan, seviye, oyun bitti bilgisi |
| Melisa (`board`)   | Görkem (`leaderboard`) | Oyun sonu puanı |
| Görkem (`audio`)   | Herkes                 | Ses çalma işlemi |
