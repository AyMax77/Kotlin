import java.time.LocalDate
import java.time.LocalTime
class Employe {
    var Matricule = ""
    var Nom = ""
    var Prenom = ""
    var AnneeEmbauche = 0
    var Salaire =  0.0

    constructor(Matricule: String, Nom: String, Prenom: String, AnneeEmbauche: Int, Salaire: Double) {
        this.Matricule = Matricule
        this.Nom = Nom
        this.Prenom = Prenom
        this.AnneeEmbauche = AnneeEmbauche
        this.Salaire = Salaire
    }
    fun anciennete(AnneeEmbauche: Int){
        val anneeEnCours = LocalDate.now().year
        anneeEnCours - this.AnneeEmbauche
    }
    fun AugmentationDuSalaire(anciennete : Double){
        if (anciennete <= 5 ){
            this.Salaire *= 1.02
        } else if (anciennete <= 10){
            this.Salaire *= 1.05
        } else {
            this.Salaire *= 1.10
        }
    }

    

}