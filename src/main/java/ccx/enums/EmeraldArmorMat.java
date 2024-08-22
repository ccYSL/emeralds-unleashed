package ccx.enums;

import ccx.emeraldsunleashed;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum EmeraldArmorMat implements ArmorMaterial {
    ARMOR_EMERALD("emerald", new int[]{2,4,8,3}, 12, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.5F,() -> Ingredient.of(Items.EMERALD));

    private static final int[] HEALTH_PER_SLOT = new int[]{234, 270, 288, 198};
    private final String name;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final Supplier<Ingredient> repairIngredient;

    EmeraldArmorMat(String name, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot equipmentSlot) {
        return HEALTH_PER_SLOT[equipmentSlot.getIndex()];
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot equipmentSlot) {
        return slotProtections[equipmentSlot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }

    @Override
    public String getName() {
        return emeraldsunleashed.ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0F;
    }
}
