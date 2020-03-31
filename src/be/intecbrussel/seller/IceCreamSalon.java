package be.intecbrussel.seller;

import be.intecbrussel.eatbles.Cone;
import be.intecbrussel.eatbles.IceRocket;
import be.intecbrussel.eatbles.Magnum;


public class IceCreamSalon implements IceCreamSeller {

    PriceList pricelist ;
    double totalProfit ;






    @Override
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavor) {
        Cone hoorntje = new Cone(flavor);
        totalProfit += pricelist.getBallPrice() * flavor.length;

        return hoorntje;

    }

    @Override
    public IceRocket orderIceRocket() {

        IceRocket raketijsje = new IceRocket();
        totalProfit = totalProfit + pricelist.getRocketPrice();

        return raketijsje;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        Magnum armin = new Magnum(magnumType);
        totalProfit +=pricelist.getMagnumPrice(magnumType);

        return armin;
    }





}
