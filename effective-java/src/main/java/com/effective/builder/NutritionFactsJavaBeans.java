package com.effective.builder;

/**
 * 描述
 *
 * @version 1.0
 * @Title:JavaBeans模式
 * @author: GONGHONGFU
 * @Description:
 * @date 2026/03/02 21:04:33
 * 缺点：JavaBeans 模式自身有着很严重的缺点。 因为构造过程被分到了几个调用中，
 * 在构造过程中JavaBean 可能处于不一致的状态；JavaBeans模式使得把
 * 类做成不可变的可能性不复存在
 */
public class NutritionFactsJavaBeans {
    private  int servingSize =-1;  //(ml)             required 食用量
    private  int servings =-1;     //(per container)  required 供应量
    private  int calories=0;     //(per serving)    optional 热量
    private  int fat=0;          //(g/serving)      optional 脂肪
    private  int sodium=0;       //(mg/serving)     optional 钠
    private  int carbohydrate=0; //(g/serving)      optional 碳水化合物

    public NutritionFactsJavaBeans() { }
    //Setters

    public void setServingSize(int val){ servingSize=val; }
    public void setServings(int val) { servings=val;}
    public void setCalories(int val) {calories=val;}
    public void setFat(int val) {fat=val;}
    public void setSodium(int val) {sodium=val;}
    public void setCarbohydrate(int val) {carbohydrate=val;}
}
