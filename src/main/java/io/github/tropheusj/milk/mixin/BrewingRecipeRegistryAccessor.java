package io.github.tropheusj.milk.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.item.Item;
import net.minecraft.recipe.BrewingRecipeRegistry;

@Mixin(BrewingRecipeRegistry.class)
public interface BrewingRecipeRegistryAccessor {
	@Invoker("registerPotionType")
	static void invokeRegisterPotionType(Item item) {
		throw new RuntimeException("Mixin application failed!");
	}

	@Invoker("registerItemRecipe")
	static void invokeRegisterItemRecipe(Item input, Item ingredient, Item output) {
		throw new RuntimeException("Mixin application failed!");
	}
}
