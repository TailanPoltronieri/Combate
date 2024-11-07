class Champion {
    private String name;
    private int health;
    private int attack;
    private int armor;

    public Champion(String name, int health, int attack, int armor) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.armor = armor;
    }

    public void takeDamage(Champion opponent) {
        int damageTaken = opponent.attack - this.armor;
        if (damageTaken < 1) {
            damageTaken = 1; // Dano mínimo de 1 ponto
        }
        this.health -= damageTaken;
        if (this.health < 0) {
            this.health = 0; // Vida não pode ser negativa
        }
    }
    public String status() {
        if (this.health == 0) {
            return this.name + ": morreu";
        } else {
            return this.name + ": " + this.health + " de vida";
        }
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}
