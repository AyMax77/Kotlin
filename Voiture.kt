class Voiture {
    var marque: String = ""
    var modele: String = ""
    var vitesse: Int = 0
    constructor(){
    }

    constructor(marque: String, modele: String, vitesse: Int) {
        this.marque = marque
        this.modele = modele
        this.vitesse = vitesse
    }
    fun accelerer(vitesse:Int){
        this.vitesse +=vitesse
    }
    fun ralentir(vitesse:Int){
        this.vitesse-= vitesse
    }
    fun retourneVitesse() :String{
        return "la vitesse actuelle est de ${this.vitesse}"
    }

    override fun toString(): String {
        return "Voiture(marque='$marque',modele='$modele',vitesse=$vitesse)"
    }

}
