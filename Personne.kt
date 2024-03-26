class Personne (val nom: String, val taille : Double, val poids : Double){
    fun imc() {
        println(poids/(taille*taille))
    }

}
    fun main(){
        val Maxime = Personne("Dehay",1.76,85.5)
            println(Maxime.imc())
        }

