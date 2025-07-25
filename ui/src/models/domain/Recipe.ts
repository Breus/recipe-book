import type Ingredient from "./Ingredient.ts";
import type PreparationStep from "./PreparationStep.ts";

export default interface Recipe {
    id: number;
    title: string;
    description: string;
    author: string;
    ingredients: Ingredient[];
    preparationSteps: PreparationStep[];
}
