package core.basesyntax.service.operation;

import core.basesyntax.impl.FruitShopServiceImpl;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.service.FruitShopService;
import core.basesyntax.strategy.OperationHandler;

public class SupplyOperation implements OperationHandler {
    @Override
    public void processWithTransaction(FruitTransaction transaction) {
        FruitShopService fruitShopService = new FruitShopServiceImpl();
        fruitShopService.supplyFruit(transaction);
    }
}