package com.example.crud.domain.product;

import org.antlr.v4.runtime.misc.NotNull;

import java.util.UUID;

public record RequestProduct(

        String id,


        String name,

        @NotNull
        Integer price_in_cents) {


}
