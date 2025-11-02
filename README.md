# Recursive Asal Sayı Kontrol Programı (Java)

Bu proje, Java kullanarak **recursive (özyinelemeli)** yöntemle bir sayının asal olup olmadığını kontrol eden basit bir uygulamadır.

Program, 1'den başlayarak verilen sayıya kadar bölen olup olmadığını recursive şekilde kontrol eder.

---

## 📌 Proje Hakkında

- Döngü yerine **recursive fonksiyon** kullanılmıştır
- `isPrime(number, 1)` ile başlar
- `i` her adımda 1 artırılır
- Eğer bölen bulunursa sayı **asal değildir**
- Sayıya ulaşılırsa **asaldır**

---

##  Asal Sayı Mantığı

Bir sayı, **1 ve kendisi dışında böleni yoksa** asaldır.

Recursive kontrol mantığı:

1 → 2 → 3 → ... → number

- Eğer bir bölen bulunursa → ❌ Asal değil  
- Eğer hiç bulunmazsa → ✅ Asal

