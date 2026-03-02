package com.effective.builder;

/**
 * 描述
 *
 * @version 1.0
 * @Title:重叠构造器（telescoping constructor）模式
 * @author: GONGHONGFU
 * @Description:
 * @date 2026/02/27 21:29:38
 */
public class NutritionFacts {
    private final int servingSize;  //(ml)             required 食用量
    private final int servings;     //(per container)  required 供应量
    private final int calories;     //(per serving)    optional 热量
    private final int fat;          //(g/serving)      optional 脂肪
    private final int sodium;       //(mg/serving)     optional 钠
    private final int carbohydrate; //(g/serving)      optional 碳水化合物

    public NutritionFacts(int servingSize, int servings) {
        this(servingSize,servings,0);
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize,servings,calories,0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize,servings,calories,fat,0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize,servings,calories,fat,sodium,0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts(1, 2);
        System.out.println(nutritionFacts.servings);
    }
}
