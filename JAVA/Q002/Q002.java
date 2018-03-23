
package Q002;
/**
 *
 * @author İzel Kayacık
 */
public class Q002 
{  

/* Fibonacci serisinde her sayı, kendisinden önce gelen iki sayının toplamıdır. 
1 ve 2 ile başlayan serinin ilk 10 sayısı:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
Bu serinin dört milyondan küçük tüm çift sayılarının toplamını bulunuz.*/

    public static void main(String[] args) 
    {
        int a = 1 , b = 2, c, toplam = 0; //Gerekli değişkenleri kullandım
        while( a < 4000000 )//Soruda 4 milyondan küçük sayıları istiyor
        {
           c = a; //İlk değerimi elimde tutmam lazım bu yüzden başka bir değişkene aktardım
           a = b; //İkinci değerimde belli olduğu için ilk sayımın yerine aktardım
           b = a + c;//Kendisinden önce gelen iki sayıyı toplattırmam lazım
           
           if(a % 2 == 0 ) //Çift sayıları istediği için modunu aldım ve if döngüsünde kontrol ettim
            toplam += a; //Elde edeceğim sayıyı toplam değişkenine aktardım
        }
        
        System.out.println(toplam); //Sayımı ekrana yazdırdım
    
        
    }  
    
}
