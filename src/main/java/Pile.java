
public class Pile {
    private int elements[];
    private int indiceSommet;

    /**Constructeur paramétrique de la pile
     * @param pfTaille IN
     * Préconditon : pfTaille > 0
     */
    
    public Pile(int pfTaille) {
        this.indiceSommet = -1;
        this.elements = new int[pfTaille];
    }


    /*
     * Permet de savoir si la pile est vide
     * @return true si vide false sinon
     */
    public boolean est_vide() {
        if(this.indiceSommet == -1){
            return true;
        }
        return false;
    }

    /**
     * Empile un élément au sommmet de la pile
     * @param pfElt IN
     * Précondition : ! this.estPlein
     */
    public void empiler(int pfElt) {
        this.indiceSommet ++;
        this.elements[indiceSommet] = pfElt;
        
    }


    /**
     * Dépile le sommet
     * Précondition : ! this.estVide
     * @return sommet
     */    
    public int depiler() {
        int sommet = this.elements[indiceSommet];
        this.indiceSommet --;
        return sommet;
    }
  
    /**
     * Renvoie le sommet de la pile
     * Précondition : ! this.estVide
     * @return le sommet de la pile
     */    
    public int sommet() {
        return this.elements[indiceSommet];
    }

    /*
     * Permet de savoir si la pile est pleine
     * @return true si plein, faux sinon
     */
    public boolean est_plein() {
        return this.indiceSommet == this.elements.length-1;
    }
    
    /*
     * Vider la pile
     * 
     */
    public void Vider(){
        this.indiceSommet = -1;
    }

}
