Functional Interface lar:<br>
1.**Runnable**(Thread larda ish-di)<br>
2.**Callable**(Bu ham threadlarda ish-di asosan)<br>
3.**Function**<Integer,String> bunda 2ta qiymat qabul qiladi.Birinchisi kirib keladi va 2 chisi cqb ketadi.Asosiy funcsiyasi .apply() funksiyasi.<br>
4.**Predicate** -doim boolean qayataradigan abstract class predicate deyiladi.Bunda qanday method kirib kelishidan qat’iy nazar boolean qiymat chiqib ketadi.Asosiy methodi .test()<br>
5.**Supplier**-bu hech qanaqa qiymat qabul qilmaydi.Lekin nma chiqarishi user tomonidan kiritiladi. Masalan: Supplier<Integer > sup=()->{} bunda hech qanaqa qiymat qabul qilmaydi lekin integer qaytaradi. Asosiy methodi .get().<br>
6.**Consumer**-Bu Supplier ning teskarisi aslida.Bunda kirib keladigan qiymatni user belgilaydi, ammo chiqib ketadigan qiymati yo’q.Asosiy funcsiasi .accept() va bu method void method.<br>
7.**BiFunction**-bunda esa 2ta qiymat kirib keladi lekn bitta qiymat chiqadi Masalan:
BiFunction<Integer,integer>sum=(a,b)->a+b;<br>
8.**UnaryOperator**-bitta qiymat qabul qiladi va o’sha type dagi ma’lumotni qaytarishi kerak.<br>
9.**BinaryOperator**-Bu ikta qiymat qabul qiladi va ikkalasini compare qilib bitta qiymat chiqaradi.