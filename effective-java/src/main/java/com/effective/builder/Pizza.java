package com.effective.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * 描述
 *
 * @version 1.0
 * @Title:Builder 模式也适用于类层次结构
 * @author: GONGHONGFU
 * @Description:
 * @date 2026/03/02 21:56:41
 */
public abstract class Pizza {
    public enum Topping {HAM,MUSHROOM,ONION,PEPPER,SAUSAGE}
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        abstract Pizza build();
        protected abstract T self();
    }
    Pizza(Builder<?> builder){
        toppings=builder.toppings.clone();
    }
}
