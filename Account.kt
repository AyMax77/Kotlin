class Account {
    var solde = 0.0
    constructor()



    constructor(solde: Double) {
        this.solde = solde
    }

    fun getBalance() = this.solde
    fun deposer(ajout:Double){
        this.solde += ajout
    }
    fun retirer(retirer:Double){
        this.solde -= retirer
    }
    fun interet(interet:Double){
        this.solde *= (interet +1)
    }
    override fun toString(): String {
        return "Compte(solde = $solde)"
    }
}