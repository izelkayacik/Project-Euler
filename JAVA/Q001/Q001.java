package Q001;

/**
 *
 * @author İzel Kayacık
 */
public class Q001 
{
 /*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.

3'ün veya 5'in katı olan 10'dan küçük tüm doğal sayıları listelersek, 
3, 5, 6, ve 9'u elde ederiz. Bu katların toplamı 23'tür.
3'ün veya 5'in 1000'den küçük tüm katlarının toplamını bulunuz.
*/
    public static void main(String[] args) 
    {
        int a, toplam = 0, hedef = 1000; //Gerekli olan değişkenlerin tanımlanması
        for(a = 1; a < hedef; a++) //İstenilen değere kadar (hedef) sayıların elde edilmesi
            if(a % 3 == 0 || a % 5 == 0) //Elde edilen sayının 3 VEYA 5'e bölünebilirlik kontrolü
                toplam += a; //İstenilen koşula uyan sayının toplam değişkenine eklenmesi
        System.out.println("Sonuç = " + toplam); //Ekrana sonucun bastırılması
    }
}
