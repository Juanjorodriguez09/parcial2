public enum TipoTenis {
    ARCILLA("Arcilla", "Rojo", 42, 100) {
        @Override
        public void usarTenis() {
            System.out.println("Jugando en arcilla con tenis " + this.name());
        }
    },
    PASTO("Césped", "Verde", 39, 120) {
        @Override
        public void usarTenis() {
            System.out.println("Jugando en pasto con tenis " + this.name());
        }
    },
    DURA("Cemento", "Azul", 44, 150) {
        @Override
        public void usarTenis() {
            System.out.println("Jugando en pista dura con tenis " + this.name());
        }
    },
    TIERRA_BATIDA("Tierra Batida", "Marrón", 41, 80) {
        @Override
        public void usarTenis() {
            System.out.println("Jugando en tierra batida con tenis " + this.name());
        }
    };

    private String material;
    private String color;
    private int talla;
    private int precio;

    TipoTenis(String material, String color, int talla, int precio) {
        this.material = material;
        this.color = color;
        this.talla = talla;
        this.precio = precio;
    }

    public static void mostrarTenis() {
        System.out.println("Tipos de tenis disponibles:");
        for (TipoTenis tenis : TipoTenis.values()) {
            System.out.println(tenis + ": Material= " + tenis.material + ", Color= " + tenis.color + ", Talla= " + tenis.talla + ", Precio= $" + tenis.precio);
        }
    }

    public abstract void usarTenis();

    public static void main(String[] args) {
        mostrarTenis();
        System.out.println();

        for (TipoTenis tenis : TipoTenis.values()) {
            tenis.usarTenis();
        }
    }
}