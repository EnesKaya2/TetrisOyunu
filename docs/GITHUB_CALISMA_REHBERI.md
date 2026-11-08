# GitHub Çalışma Rehberi

Repo: https://github.com/EnesKaya2/TetrisOyunu

## 0. Bir kerelik hazırlık

1. GitHub hesabı açın ve kullanıcı adınızı Enes'e gönderin. Enes sizi **Settings → Collaborators** bölümünden ekleyecek, gelen daveti e-postadan kabul edin.
2. [GitHub Desktop](https://desktop.github.com/) kurun ve hesabınızla giriş yapın.
3. VS Code'a **Extension Pack for Java** eklentisini kurun.

## 1. Projeyi bilgisayarınıza indirin (clone)

GitHub Desktop → **File → Clone repository → URL** → `EnesKaya2/TetrisOyunu` → **Clone**

Sonra **Repository → Open in Visual Studio Code**.

## 2. Kendi dalınızı (branch) açın

**main dalına doğrudan yazmıyoruz.** Herkes kendi dalında çalışır.

GitHub Desktop → **Current Branch → New Branch** → isim:

| Kişi | Dal adı |
|------|---------|
| Emir   | `emir-arayuz` |
| Enes   | `enes-bloklar` |
| Ceren  | `ceren-kontroller` |
| Melisa | `melisa-satir-puan` |
| Görkem | `gorkem-skor-ses` |

## 3. Çalışma döngüsü

1. Başlamadan önce: **Fetch origin** → main'deki son değişiklikleri almak için **Branch → Update from main**.
2. Sadece **size ait dosyaları / bölümleri** değiştirin (bkz. `docs/gorevler/<Adınız>.md` ve `docs/ORTAK_DOSYALAR.md`).
3. Bir parça bitince GitHub Desktop'ta sol altta kısa bir açıklama yazın → **Commit**.
4. **Push origin** ile GitHub'a gönderin.
5. `docs/gorevler/<Adınız>.md` içindeki bitirdiğiniz maddeleri `- [x]` olarak işaretleyin.

## 4. Birleştirme (Pull Request)

Bir bölüm çalışır hale gelince:

1. GitHub Desktop → **Branch → Create Pull Request**.
2. Açılan sayfada ne yaptığınızı kısaca yazın → **Create pull request**.
3. Ekipten biri kontrol edip **Merge** eder.

Birleştirme sırası için: [BIRLESTIRME_PLANI.md](BIRLESTIRME_PLANI.md)

## 5. İlerlemeyi takip

- Repo sayfasında **Commits**: kim ne zaman ne yaptı.
- **Pull requests**: birleştirilmeyi bekleyen işler.
- `docs/gorevler/` içindeki kişi dosyaları: işaretlenmiş görevler.

## Kurallar

- Başkasının dosyasını veya ortak dosyadaki başkasının bölümünü değiştirmeden önce ona haber verin.
- Çalışmayan (derlenmeyen) kodu main'e birleştirmeyin.
- Sık sık commit + push yapın, işi biriktirmeyin.
