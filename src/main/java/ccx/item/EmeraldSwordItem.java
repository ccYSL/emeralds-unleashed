package ccx.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class EmeraldSwordItem extends SwordItem {
    public EmeraldSwordItem(Tier mat, Properties props) {
        super(mat, 3, -2.4F, props);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker){
        boolean result = super.hurtEnemy(stack, target, attacker);

        if (result){
            target.setSecondsOnFire(7);
        }
        return result;
    }
}
//useless rn since it doesn't add any new features instead we just made a new instance of sworditem