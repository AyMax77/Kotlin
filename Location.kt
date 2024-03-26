class Location {
    var nom = ""
    var categorie = 'x'
    var km = 0
    var jour = 0
    constructor(nom:String,categorie:Char ,km:Int,jour:Int){
        this.nom = nom
        this.categorie = categorie
        this.km = km
        this.jour = jour
    }
    constructor()

    fun montantJour():Int{
        var prix =0
        if (this.categorie=='E'){
            prix = 30
        } else if(this.categorie == 'C'){
            prix = 50
        } else if(this.categorie == 'L'){
            prix = 75
        }
        return prix
    }
    fun montantLocation():Int = this.montantJour() * this.jour

    fun Kmsupp():Int = this.km / this.jour

    fun pxkmsupp() :Int{
        var prixkm = this.Kmsupp() - 100; if(prixkm > 100){prixkm*0.50}
        return prixkm
    }
}