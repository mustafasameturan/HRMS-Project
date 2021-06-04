<div align="center"><h1>Human Resources Management System</h1> </div>
<div align="center"><h2>İnsan Kaynakları Yönetim Projesi</h2> </div>

<div align="center"><h3>🚨 Projem güncellendikçe README.md dosyamda güncellemeleri açıklıyorum. Daha detaylı bilgi için projeyi inceleyebilirsiniz. 🚨</h3> </div>
<div align="center"><h3>🚨 Sorularınız için profilimde bulunan Discord linkinden bana ulaşabilirsiniz. 🚨</h3> </div>

## Initial Commit 

✅ Projemde ilk adım olarak database oluşturdum. Database detaylarına [buradan](https://github.com/mustafasameturan/hrms-database)  ulaşabilirsiniz. <br>
✅ Spring initializr aracılığı ile proje dosyasını oluşturdum ve IDE üzerine bir "Maven Project" olarak entegre ettim. Kullanılan paketleri alt kısımda görebilirsiniz. <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;🔹Spring Boot Dev Tools<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;🔹Spring Web<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;🔹Spring Data JPA<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;🔹PostgreSQL Driver<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;🔹Lombok<br><br>
✅ Proje katmanlı bir mimari olacağı için katmanlarını isimlendirme standartlarına uygun bir biçimde oluşturdum. <br>
✅ Spring ve Lombok paketleri ile gelen eklentiler projemde etkin olarak kullandım. Detaylar için projemi inceyelebilirsiniz. <br>
✅ "job_title" adlı tablomuzun içerisindeki verileri yazdırdım. <br>

![Output](https://user-images.githubusercontent.com/77546366/118363707-59252980-b59e-11eb-9097-1e0c6c506df8.PNG)

## Commit 2 

✅ Projeme swagger desteği ekledim. <br>
✅ User(Kullanıcı), Employee(İşçi), Employer(İş Veren), Candidate(İş Arayanlar) nesnelerini dahil ettim ve bunlar için gerekli olan interface ve classları yazdım.<br>
✅ Candidate (İş Arayanlar) kullanıcıların sisteme kayıt olmasını sağlayacak kodları [AuthManager](https://github.com/mustafasameturan/HRMS-Project/blob/main/HRMS/src/main/java/kodlamaio/hrms/business/concretes/AuthManager.java) sınıfı içerisine yazdım.<br>
✅ Employer(İş Veren) kullanıcıların sisteme kayıt olmasını sağlayacak kodları [AuthManager](https://github.com/mustafasameturan/HRMS-Project/blob/main/HRMS/src/main/java/kodlamaio/hrms/business/concretes/AuthManager.java) sınıfı içerisine yazdım.<br>
✅ Candidate (İş Arayanlar) ve Employer(İş Veren) kullanıcılar sisteme kayıt olurken bazı doğrulama ve kurallar mevcuttur.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;🔹Tüm alanlar zorunludur.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;🔹Candidate (İş Arayanlar) kullanıcılar içim MERNIS(fake) doğrulaması eklenmiştir.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;🔹Daha önce kayıtlı bir e-posta veya TC Kimlik numarası var ise kullanıcı sisteme kabul edilmez.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;🔹Kayıtların gerçekleşmesi için bir e-posta doğrulaması(fake) gereklidir.<br><br>
✅ Sisteme JobTitle(İş Pozisyonu) eklenebilir.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;🔹Tüm alanlar zorunludur.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;🔹Pozisyonlar tekrar edemez. Kullanıcı uyarılır.<br><br>
✅Tüm nesneleri listeleme imkanı sağlayacak kodlar yazılmıştır.<br>

![Output](https://user-images.githubusercontent.com/77546366/119478700-afd9f280-bd58-11eb-9e18-e37f95e248ba.PNG)


## Commit 3
✅ Projemde iş verenlerin sisteme iş ilanı(Job Posting) ekleyebileceği bir ortam hazırlandı. <br>
✅ Sistemdeki tüm aktif iş ilanları listenebilmektedir.<br>
✅ Sistemdeki tüm aktif iş ilanları tarihe göre listenebilmektedir.<br>
✅ Sistemde bir firmaya ait iş ilanları listenebilmektedir.<br>
✅ Sistemdeki bir iş ilanı aktif konumdan kapalı konuma getirilebilmektedir.

![Output](https://user-images.githubusercontent.com/77546366/120867121-f5d55880-c599-11eb-9153-55f0153cf8f0.PNG)

## Commit 4
✅ Sisteme iş arayanların(candidates) bir veya birden fazla CV girme olasılığını sağladım.<br>
✅ İş arayan sisteme cv girerken aşşağıda belirteceğim bilgiler doldurabilmektedirler.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;🔹İş arayanlar okuduğu okulları sisteme girebilir.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;🔹İş arayanlar iş tecrübelerini sisteme girebilir.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;🔹İş arayanlar bildiği yabancı dilleri ve seviyesini sisteme girebilir.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;🔹İş arayanlar fotoğraflarını sisteme yükleyebilmektedir (Fotoğraflar Cloudinary bulut sisteminde tutulmaktadır.).<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;🔹İş arayanlar Github ve LinkedIn adreslerini sisteme girebilir.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;🔹İş arayanlar sisteme ön yazı girebilir.<br><br>
✅ İş arayanların iş tecrübeleri ve okul bilgileri tarihe göre sıralanabilmektedir. <br>
✅ Sisteme Spring Boot Validation entegre edildi.

![Output](https://user-images.githubusercontent.com/77546366/120867666-118d2e80-c59b-11eb-87f4-c2a227bd891a.PNG)
