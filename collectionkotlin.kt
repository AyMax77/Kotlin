/*fun main(){      //EXO 1
    val planetes = arrayOf("mercure","Venus","terre","Mars","Jupiter","Saturne","Uranus","Neptune")

    println(planetes.first())
    println(planetes.last())
    println(planetes.get(2))
    println(planetes.indexOf("terre"))
    println(planetes.filter { it.startsWith('M')})
    /*for (planete in planetes){
    println(planete.lowercase())}*/
    println(planetes.contentToString())
    println(planetes.map {it.capitalize()})
 */

/*fun main(){      //EXO 2
    val entier = mutableListOf<Int>()
    for (i in 1..10){
        entier.add( (1..100).random())
    }
    println(entier)
    println(entier.sum())
    println(entier.min())
    println(entier.max())
    var listePair = mutableListOf<Int>()
    var listeImpair = mutableListOf<Int>()
    for (nombre in entier){
        if (nombre % 2 == 0){
            listePair.add(nombre)
        } else {
            listeImpair.add(nombre)
        }
    }
    println(listePair)
    println(listeImpair)

}*/

/*fun main (){    //EXO3
    val notes = mutableMapOf<String, MutableList<Int>>("Adrien" to mutableListOf(15,12,
        10),"Bertrand" to mutableListOf(12,10))
    notes.getOrPut("Toto") { mutableListOf() }.add(8)

    notes.getOrPut("Adrien") { mutableListOf() }.add(6)

    for (eleve in notes){
        println(eleve.key)
        val moyenne = eleve.value.sum().toDouble() / eleve.value.size
        println("moyenne de ${moyenne}")
    }
    for (eleve in notes){
        val moyenne = eleve.value.sum().toDouble() / eleve.value.size
        if (moyenne > 10){
            println ("${eleve.key}------${moyenne}")
        }
    }

}*/

/*fun main(){   //EXO4
    fun serie(n : Int): Array<Int> {
        val liste = mutableListOf<Int>()
        for (i in 1..n) {
            liste.add(i)
        }
        return liste.toTypedArray()
    }
    fun serieInverse(n : Int): List<Int> {  //4.2
        val liste = mutableListOf<Int>()
        for (i in n downTo 1) {
            liste.add(i)
        }
        return liste
    }
    fun serieInversed(n : Int): List<Int> = serie(n).reversed()
}*/

fun main() {   //EXO 4.3
    fun listePair(tab: Array<Int>): List<Int> {
        val listePair = mutableListOf<Int>()
        for (i in tab) {
            if (i % 2 == 0)
                listePair.add(i)
        }
        return listePair
    }

    fun listeImpair(tab: Array<Int>): List<Int> {  //4.4
        val listeImpair = mutableListOf<Int>()
        for (i in tab) {
            if (i % 2 != 0)
                listeImpair.add(i)
        }
        return listeImpair
    }

    fun listeDiviseurs(nombre: Int): List<Int> {   //4.5
        var diviseurs = mutableListOf<Int>()
        for (i in 1..nombre) {
            if (nombre % i == 0) {
                diviseurs.add(i)
            }
        }
        return diviseurs
    }
    fun estPremier(nombre: Int): Boolean = if (listeDiviseurs(nombre).size == 2) true  //4.6
    else false


    fun estParfait(nombre: Int): Boolean{   //4.7
        val parfait = arrayOf(6,28,496,8128)
        if ( nombre in parfait){
            return true
        }
        else{
            return false
        }
    }
    fun sommeChiffres(nombre: Int): Int{   //4.8
        var somme = 0
        var nb = nombre
        while (nb != 0){
            somme += nb % 10
            nb /= 10
        }
        return somme
    }

    fun nombresAmis(nombre1: Int,nombre2: Int): Boolean = if ( sommeChiffres(nombre2) ==  //4.9
        sommeChiffres(nombre1)) true else false


    fun parite(tab: Array<Int>): MutableMap<String,MutableList<Int>>{    //4.10
        val liste = mutableMapOf<String, MutableList<Int>>("pair" to mutableListOf(),
            "impair" to mutableListOf())
        for ( nb in tab ){
            if ( nb % 2 == 0 ){
                liste.getOrPut("pair") { mutableListOf() }.add(nb)
            }
            else {
                liste.getOrPut("impair") { mutableListOf() }.add(nb)
            }
        }
        return liste
    }
}