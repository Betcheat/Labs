package analyzer;


public class Analyze implements ObjectSaver {

    public void anArrSrtGR() {
        long start = System.nanoTime();
        arS.srtArr(arrGr.arrGenR());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anArrSrtMiMa() {
        long start = System.nanoTime();
        arS.srtArr(MiMa.arrMiMa());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anArrSrtMiMaRx() {
        long start = System.nanoTime();
        arS.srtArr(MiMaRx.arrMiMaRX());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anArrSrtMaMi() {
        long start = System.nanoTime();
        arS.srtArr(MaMi.arrMaMi());
        long end = System.nanoTime();

        System.out.println(end - start);
    }


    public void anBubStaGR() {
        long start = System.nanoTime();
        bSta.srtBubSta(arrGr.arrGenR());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anBubStaMiMa() {
        long start = System.nanoTime();
        bSta.srtBubSta(MiMa.arrMiMa());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anBubStaMiMaRx() {
        long start = System.nanoTime();
        bSta.srtBubSta(MiMaRx.arrMiMaRX());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anBubStaMaMi() {
        long start = System.nanoTime();
        bSta.srtBubSta(MaMi.arrMaMi());
        long end = System.nanoTime();

        System.out.println(end - start);
    }


    public void anBubEndGR() {
        long start = System.nanoTime();
        bEnd.srtBubEnd(arrGr.arrGenR());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anBubEndMiMa() {
        long start = System.nanoTime();
        bEnd.srtBubEnd(MiMa.arrMiMa());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anBubEndMiMaRx() {
        long start = System.nanoTime();
        bEnd.srtBubEnd(MiMaRx.arrMiMaRX());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anBubEndMaMi() {
        long start = System.nanoTime();
        bEnd.srtBubEnd(MaMi.arrMaMi());
        long end = System.nanoTime();

        System.out.println(end - start);
    }


    public void anQuickGR() {
        long start = System.nanoTime();
        quSrt.srtQuick(arrGr.arrGenR());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anQuickMiMa() {
        long start = System.nanoTime();
        quSrt.srtQuick(MiMa.arrMiMa());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anQuickMiMaRx() {
        long start = System.nanoTime();
        quSrt.srtQuick(MiMaRx.arrMiMaRX());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anQuickMaMi() {
        long start = System.nanoTime();
        quSrt.srtQuick(MaMi.arrMaMi());
        long end = System.nanoTime();

        System.out.println(end - start);
    }


    public void anMerArrSrtGR() {
        long start = System.nanoTime();
        meSrt.meArrSrt(arrGr.arrGenR());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerArrSrtMiMa() {
        long start = System.nanoTime();
        meSrt.meArrSrt(MiMa.arrMiMa());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerArrSrtMiMaRx() {
        long start = System.nanoTime();
        meSrt.meArrSrt(MiMaRx.arrMiMaRX());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerArrSrtMaMi() {
        long start = System.nanoTime();
        meSrt.meArrSrt(MaMi.arrMaMi());
        long end = System.nanoTime();

        System.out.println(end - start);
    }


    public void anMerBubStaGR() {
        long start = System.nanoTime();
        meSrt.meBubSta(arrGr.arrGenR());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerBubStaMiMa() {
        long start = System.nanoTime();
        meSrt.meBubSta(MiMa.arrMiMa());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerBubStaMiMaRx() {
        long start = System.nanoTime();
        meSrt.meBubSta(MiMaRx.arrMiMaRX());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerBubStaMaMi() {
        long start = System.nanoTime();
        meSrt.meBubSta(MaMi.arrMaMi());
        long end = System.nanoTime();

        System.out.println(end - start);
    }


    public void anMerBubEndGR() {
        long start = System.nanoTime();
        meSrt.meArrSrt(arrGr.arrGenR());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerBubEndMiMa() {
        long start = System.nanoTime();
        meSrt.meBubEnd(MiMa.arrMiMa());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerBubEndMiMaRx() {
        long start = System.nanoTime();
        meSrt.meBubEnd(MiMaRx.arrMiMaRX());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerBubEndMaMi() {
        long start = System.nanoTime();
        meSrt.meBubEnd(MaMi.arrMaMi());
        long end = System.nanoTime();

        System.out.println(end - start);
    }


    public void anMerQuickGR() {
        long start = System.nanoTime();
        meSrt.meQuick(arrGr.arrGenR());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerQuickMiMa() {
        long start = System.nanoTime();
        meSrt.meQuick(MiMa.arrMiMa());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerQuickMiMaRx() {
        long start = System.nanoTime();
        meSrt.meQuick(MiMaRx.arrMiMaRX());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerQuickMaMi() {
        long start = System.nanoTime();
        meSrt.meQuick(MaMi.arrMaMi());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

}
