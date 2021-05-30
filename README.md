<div align="center"><h1>Human Resources Management System</h1> </div>
<div align="center"><h2>İnsan Kaynakları Yönetim Projesi</h2> </div>

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




