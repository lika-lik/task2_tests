package task2.graphics_impl;

import arc.BrezArcDrawer;
import task2.graphics_impl.arc.ArcDrawerFactoryByPixelDrawer;
import task2.graphics_impl.pie.PieFillerFactoryByPixelDrawer;

public class MyFactoryImpl extends PrimitivesFactoryWithDefaultGraphicsImplementation {
    @Override
    protected ArcDrawerFactoryByPixelDrawer getCustomArcDrawerFactory() {
        return BrezArcDrawer::new;
    }

    @Override
    protected PieFillerFactoryByPixelDrawer getCustomPieFillerFactory() {
        return BrezArcDrawer::new;
    }
}
