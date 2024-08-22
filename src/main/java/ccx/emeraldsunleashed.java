package ccx;
import ccx.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(emeraldsunleashed.ID)
public class emeraldsunleashed {
    public static final String ID = "emeraldsunleashed";

    public emeraldsunleashed() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
    }
}
