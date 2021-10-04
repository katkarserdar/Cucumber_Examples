
  Feature: Login Test

    Scenario: Go to amazon website and test login page

      Given Amazon sitesine git
      And login butonuna tikla
      And isim gir
      And sifre gir
      When submit butonuna tikladigimda
      Then success mesajıni verify et