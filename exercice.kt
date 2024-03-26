/*fun main() {
    print("Entrez votre âge : ")
    val age = readLine()?.toIntOrNull()

    if (age != null) {
        if (age < 18 || age > 65)
            println("tarif réduit")
        else
            println("tarif normal")
    } else {
        println("Veuillez entrer un âge valide.")
    }
}*/

/*fun main() {
    var dep: Int
    do {
        print("Entrer votre département: ")
        dep = readLine()?.toIntOrNull() ?: 0
    } while (dep < 1 || dep > 99)

    val lesDepartements = listOf(75, 77, 78, 91, 92, 93, 94)
    if (dep in lesDepartements)
        println("Vous habitez en Île-De-France")
    else
        println("Vous n'habitez pas en Île-De-France")
}*/

/*fun main() {
    print("Entrer un premier nombre : ")
    val nombre1 = readLine()?.toIntOrNull() ?: 0.0
    print("Entrer un second nombre : ")
    val nombre2 = readLine()?.toIntOrNull() ?: 0.0

    if ((nombre1 > 0 && nombre2 > 0) || (nombre1 < 0 && nombre2 < 0))
        println("Résultat positif")
    else
        println("Résultat négatif")
}*/
/*import kotlin.math.sqrt
fun main() {
    print("Entrez un premier nombre : ")
    val nombre1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Entrez un second nombre : ")
    val nombre2 = readLine()?.toDoubleOrNull() ?: 0.0

    if (nombre1 >= 0 && nombre2 >= 0) {
        val produit = nombre1 * nombre2
        val racinecarre = sqrt(produit)
        println("La racine carré du produit de $nombre1 par $nombre2 est: $racinecarre")
    } else {
        println("Erreur : Les nombres doivent être positifs!")
    }
}*/

/*fun main(){
    print("Entrez une année: ")
    val annee = readln().toInt()

    if ((annee % 4 ==0 && annee % 100 != 0) || (annee % 400 == 0)){
        println("Année bissextile.")

    } else {
        println("Année non bissextile.")
    }

}*/
/*fun main() {
    val x = 11
    if (x * 2 + 1 < 23 && x % 2 == 1) {
        print("1")
        print(if (x == 1) "2" else "3")
    } else if (x != 0){
        print("4")
    }
    print("5")
}*/

fun prix_total(modele:String,carburant:String,jour:Int,km:Float,offre:Boolean): Double {
    var prix_location = 0
    var prix_carbu_km = 0.0
    var PrixTotal = 0.0
    if (modele == "Citadine"){

        prix_location = 80

    } else if (modele == "Berline"){
        prix_location = 100

    } else if (modele == "Sportive"){

        prix_location =130

    } else {
        println("Erreur")
    }
    if (carburant == "Essence"){

        prix_carbu_km = 1.93

    } else if (carburant == "Diesel"){

        prix_carbu_km = 1.89

    } else {

        println("Erreur")
    }
    PrixTotal = (prix_location * jour) + (prix_carbu_km*km) + 30

    if (offre == true){

        PrixTotal = PrixTotal * 0.9

    } else {

        PrixTotal = PrixTotal
    }
    return PrixTotal
}
