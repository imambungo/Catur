class Benteng {
    private String warna = "hitam";
    private int posX = 1;
    private int posY = 1;
    private boolean status = true;
    private char pion = 9820;

    void setWarna(String warna) {
        if (warna.toLowerCase().equals("hitam") || warna.toLowerCase().equals("putih")) {
            this.warna = warna.toLowerCase();
            setPion();
        } else {
            System.out.println("Warna tidak valid");
        }
    }

    void setPosX(int posX) {
        if (posX > 0 && posX < 9) {
            this.posX = posX;
        } else {
            System.out.println("Posisi terhadap sumbu X tidak valid");
        }
    }

    void setPosY(int posY) {
        if (posY > 0 && posY < 9) {
            this.posY = posY;
        } else {
            System.out.println("Posisi terhadap sumbu Y tidak valid");
        }
    }

    void setStatus(boolean status) {
        this.status = status;
    }

    void setPion() {
        if (this.warna.toLowerCase().equals("hitam")) {
            this.pion = 9820;
        } else if (warna.toLowerCase().equals("putih")) {
            this.pion = 9814;
        }
    }

    String getWarna() {
        return this.warna;
    }

    int getPosX() {
        return this.posX;
    }

    int getPosY() {
        return this.posY;
    }

    boolean getStatus() {
        return this.status;
    }

    char getPion() {
        return this.pion;
    }

    void cegahKeluarBatas() {
        if (this.posY > 8) {
            this.posY = 8;
        }
        if (this.posY < 1) {
            this.posY = 1;
        }
        if (this.posX > 8) {
            this.posX = 8;
        }
        if (this.posX < 1) {
            this.posX = 1;
        }
    }

    void maju(int maju) {
        this.posY += maju;
        cegahKeluarBatas();
    }
    void mundur(int mundur) {
        this.posY -= mundur;
        cegahKeluarBatas();
    }
    void kanan(int kanan) {
        this.posX += kanan;
        cegahKeluarBatas();
    }
    void kiri(int kiri) {
        this.posX -= kiri;
        cegahKeluarBatas();
    }

    Benteng() {
    //     this.warna = "hitam";
    //     this.posX = 1;
    //     this.posY = 1;
    //     this.status = true;
    }

    Benteng(String warna, int posX, int posY, boolean status) {
        setWarna(warna);
        setPosX(posX);
        setPosY(posY);
        setStatus(status);
    }

    Benteng(int posX, int posY) {
        setPosX(posX);
        setPosY(posY);
    }
}
