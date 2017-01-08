package net.yamanoboriold.designpattern.decorator.ramenshop;

public final class Main {

    public static void main(final String[] args) {

        RamenNoZairyo tonkotsuBase = new TonkotsuSoup();
        RamenNoZairyo misoBase = new MisoSoup();

        tonkotsuBase = new Aghitama(tonkotsuBase);
        System.out.print(
                String.format("ラーメン %s %d円\n", tonkotsuBase.getDescription(), tonkotsuBase.cost()));

        tonkotsuBase = new Nori(tonkotsuBase);
        System.out.print(
                String.format("ラーメン %s %d円\n", tonkotsuBase.getDescription(), tonkotsuBase.cost()));

        tonkotsuBase = new Chahsyu(tonkotsuBase);
        System.out.print(
                String.format("ラーメン %s %d円\n", tonkotsuBase.getDescription(), tonkotsuBase.cost()));

        misoBase = new Aghitama(misoBase);
        System.out.print(String.format("ラーメン %s %d円\n", misoBase.getDescription(), misoBase.cost()));

        misoBase = new Nori(misoBase);
        System.out.print(String.format("ラーメン %s %d円\n", misoBase.getDescription(), misoBase.cost()));

        misoBase = new Chahsyu(misoBase);
        System.out.print(String.format("ラーメン %s %d円\n", misoBase.getDescription(), misoBase.cost()));
    }
}
