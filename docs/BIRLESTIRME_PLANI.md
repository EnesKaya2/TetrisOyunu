# Birleştirme Planı / İlerleme Sırası

Kodlar her aşamada birleştirilip kontrol edilecek. Videolar birbirinin üzerine kurulduğu için **sıra önemli**.

- [ ] **Aşama 1** — Emir: `Tetris`, `GameForm`, `GameArea` (ızgara) — 1. video
- [ ] **Aşama 2** — Enes: `TetrisBlock` + `GameArea`'da blok üretme — 1. ve 3. video
- [ ] **Aşama 3** — Ceren: `GameThread` + aşağı inme + klavye kontrolleri — 2. ve 4. video
- [ ] **Aşama 4** — Melisa: yerleşme, satır temizleme, puan, oyun bitti — 5. video
- [ ] **Aşama 5** — Enes: 7 blok türü (`tetrisblocks/`) — 6. video
- [ ] **Paralel** — Görkem: `LeaderboardForm` örnek puanlarla — 7. video (Aşama 1'den itibaren başlayabilir)
- [ ] **Aşama 6** — Görkem: `StartupForm` bağlantısı, skor kaydet/yükle — 7. ve 8. video
- [ ] **Aşama 7** — Görkem: `AudioPlayer`, sesler, JAR paketleme — 9. video
- [ ] **Aşama 8** — Emir: puan/seviye/sıradaki blok alanlarını ve START/RESET'i gerçek verilere bağlama
- [ ] **Aşama 9** — Herkes: son testler, hata düzeltmeleri, sunum — 10. video

## Paketler Arası Bağlantılar

| Veren | Alan | Ne aktarılıyor |
|-------|------|----------------|
| Enes   | Emir   | Sıradaki blok bilgisi |
| Enes   | Ceren  | Hareket ettirilecek aktif blok |
| Ceren  | Melisa | Yere oturan blok |
| Melisa | Enes   | "Blok yerleşti, yenisini üret" sinyali |
| Melisa | Emir   | Puan, seviye, oyun bitti bilgisi |
| Melisa | Görkem | Oyun sonu puanı |
| Görkem | Herkes | Ses çalma işlemi |
