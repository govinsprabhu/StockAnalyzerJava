package com.govind.sample.payload;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * Created by 609600403 on 03/10/2017.
 */
@Document(collection = "company")
public class Company {
    @Id
    private String id;

    private String points;

    @Field("share_price")
    private String sharePrice;

    private String eps;

    private String pe;

    @Field("industry_pe")
    private String industryPE;

    @Field("market_cap")
    private String marketCap;

    @Field("book_value")
    private String bookValue;

    @Field("price_by_book")
    private String priceByBook;

    private String div;

    private List<String> sector;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(String sharePrice) {
        this.sharePrice = sharePrice;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getPe() {
        return pe;
    }

    public void setPe(String pe) {
        this.pe = pe;
    }

    public String getIndustryPE() {
        return industryPE;
    }

    public void setIndustryPE(String industryPE) {
        this.industryPE = industryPE;
    }

    public String getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap;
    }

    public String getBookValue() {
        return bookValue;
    }

    public void setBookValue(String bookValue) {
        this.bookValue = bookValue;
    }

    public String getPriceByBook() {
        return priceByBook;
    }

    public void setPriceByBook(String priceByBook) {
        this.priceByBook = priceByBook;
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    public List<String> getSector() {
        return sector;
    }

    public void setSector(List<String> sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", points='" + points + '\'' +
                ", sharePrice='" + sharePrice + '\'' +
                ", eps='" + eps + '\'' +
                ", pe='" + pe + '\'' +
                ", industryPE='" + industryPE + '\'' +
                ", marketCap='" + marketCap + '\'' +
                ", bookValue='" + bookValue + '\'' +
                ", priceByBook='" + priceByBook + '\'' +
                ", div='" + div + '\'' +
                '}';
    }
}
