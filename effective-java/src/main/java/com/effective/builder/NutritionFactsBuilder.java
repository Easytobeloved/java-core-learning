package com.effective.builder;

/**
 * 描述
 *
 * @version 1.0
 * @Title:
 * @author: GONGHONGFU
 * @Description:
 * @date 2026/03/02 21:23:56
 */
public class NutritionFactsBuilder {
    private final int servingSize;  //(ml)             required 食用量
    private final int servings;     //(per container)  required 供应量
    private final int calories;     //(per serving)    optional 热量
    private final int fat;          //(g/serving)      optional 脂肪
    private final int sodium;       //(mg/serving)     optional 钠
    private final int carbohydrate; //(g/serving)      optional 碳水化合物



    public static class Builder {
        //Required parameters
        private final int servingSize;
        private final int servings;

        //Optional parameters - initialized to default values
        private int calories;
        private int fat;
        private int sodium;
        private int carbohydrate;

        public Builder(int servingSize,int servings){
            this.servingSize=servingSize;
            this.servings=servings;
        }
        public Builder calories(int val){
            calories=val;
            return this;
        }public Builder fat(int val){
            fat=val;
            return this;
        }public Builder sodium(int val){
            sodium=val;
            return this;
        }public Builder carbohydrate(int val){
            carbohydrate=val;
            return this;
        }
        public NutritionFactsBuilder builder(){
            return  new NutritionFactsBuilder(this);
        }
    }
    public NutritionFactsBuilder(Builder builder){
        servingSize = builder.servingSize;
        servings=builder.servings;
        calories= builder.calories;
        fat= builder.fat;
        sodium= builder.sodium;
        carbohydrate= builder.carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFactsBuilder builder = new Builder(240, 8).calories(100).sodium(35).carbohydrate(27).builder();
    }
}
