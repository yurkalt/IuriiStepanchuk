package Week1;

/**
 * Created by Iurii on 20.01.2016.
 */
public class Fraction {

    private int chysel;
    private int znam;

    public Fraction  (int chysel, int znam) {
        this.chysel = chysel;
        this.znam = znam;
    }

    public Fraction sum (Fraction other) {
        Fraction fr = new Fraction ( (this.chysel * other.znam) + (other.chysel * this.znam), this.znam * other.znam );
        fr.optimizer();
        return  fr;
    }

    public Fraction rob (Fraction other) {
        Fraction fr = new Fraction ( (this.chysel * other.znam) - (other.chysel * this.znam), this.znam * other.znam );
        fr.optimizer();
        return  fr;
    }


    public Fraction mult (Fraction other) {
        Fraction fr = new Fraction ( this.chysel  * other.chysel , this.znam * other.znam );
        fr.optimizer();
        return  fr;
    }

    public Fraction div (Fraction other) {
        Fraction fr = new Fraction ( this.chysel * other.znam, this.znam * other.chysel );
        fr.optimizer();
        return  fr;
    }

    public Fraction optimizer () {
        int bigger;
        if (this.chysel > this.znam) {
             bigger = this.chysel;
        }
        else bigger = this.znam;
        for (int i = bigger/2; i > 0 ; i--) {
            if ((this.chysel % i == 0) && (this.znam % i == 0)) {
                this.chysel = this.chysel/i;
                this.znam = this.znam/i;
                return this;
            }
        }
        return this;
    }

    public void print(Fraction drib1, String znak , Fraction drib2) {

        System.out.println(drib1.chysel + "    " + drib2.chysel + "      " + this.chysel  );
        System.out.println( "-  " + znak + "  -  =   -"   );
        System.out.println(drib1.znam + "     " + drib2.znam + "      " + this.znam  );
    }

    public int getChysel() {
        return chysel;
    }

    public int getZnam() {
        return znam;
    }

    public void setChysel(int chysel) {
        this.chysel = chysel;
    }
}
