package org.example.beans;

import java.util.Objects;

public class Goods extends Object{

    // 필드를 설계할 때 private, protected 제한자를 사용
    private Long goodsId;   // 상품번호
    private String goodsName;   // 상품명
    private Integer price;  // 상품가격

    // 기본 생성자는 필수
    public Goods() {
        this.goodsId = 1L;
    }

    public Goods(String goodsName, int price) {
        this();
        this.goodsName = goodsName;
        this. price = price;
    }

    // setter, getter는 상황에 따라 선택

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("상품번호: %d, 상품명: %s, 상품가격: %d원"
                , goodsId, goodsName, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return Objects.equals(goodsId, goods.goodsId)
                && Objects.equals(goodsName, goods.goodsName)
                && Objects.equals(price, goods.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodsId, goodsName, price);
    }
}
