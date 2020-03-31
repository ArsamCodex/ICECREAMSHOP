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








//        Cone.Flavor [] balls ={Cone.Flavor.STRACIATELLA,
//                Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE, Cone.Flavor.LEMON, Cone.Flavor.MOKKA, Cone.Flavor.PISTACHE,
//                Cone.Flavor.STRAWBERRY, Cone.Flavor.STRAWBERRY, Cone.Flavor.VANILLA};
//
//        Cone orderCone = orderCone(balls);
//        if (Cone.Flavor.Cone.Flavor.VANILLA.equals(orderCone)) {
//            System.out.println("EATING Cone VANILA" + "Price is " + (balls.length + 1.50));
//        } else if (Cone.Flavor.Cone.Flavor.STRAWBERRY.equals(orderCone)) {
//            System.out.println("Eating cone Strawberry " + "price is " + (balls.length * 1.50));
//        } else if ( Cone.Flavor.CHOCOLATE.equals(orderCone)){
//            System.out.println("EATING CONE CHOCOLATE " + "PRICE IS "+ (balls.length * 1.50));}
//        else if (Cone.Flavor.BANANA.equals(orderCone)){
//            System.out.println("EATING CONE BANANA " + "PRICE IS "+ (balls.length * 1.50));}
//        else if (Cone.Flavor.LEMON.equals(orderCone)){
//            System.out.println("EATING CONE LEMON " + "PRICE IS "+ (balls.length * 1.50));}
//            else{
//            System.out.println("noting");
//



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
