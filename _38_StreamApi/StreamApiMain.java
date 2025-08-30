package com.study._38_StreamApi;

import com.study._37_Lambda.Person;

import java.util.List;
import java.util.stream.Collectors;

public class StreamApiMain {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("갤럭시북1", "삼성", 1850000),
                new Product("갤럭시북2", "삼성", 1350000),
                new Product("갤럭시북3", "삼성", 1590000),
                new Product("맥북에어", "애플", 1690000),
                new Product("아이패드", "애플", 1300000),
                new Product("그램", "LG", 1300000),
                new Product("울트라 pc", "LG", 1140000)
        );

        // 1. 삼성브랜드 이면서 150만원 이하의 상품들만 모아주세요.
        List<Product> result1 = products.stream()
                .filter(product -> product.getName().equals("삼성"))
                // 삼성 아닌 제품들은 걸러짐
                .filter(samsung -> samsung.getPrice() <= 1500000)
                .collect(Collectors.toList());

        // 2. '북'이 포함된 상품 중 150만원 이상 180만원 이하의 상품들만 모아서
        // forEach로 출력해주세요(상품이름: ~원)
        products.stream()
                .filter(p -> p.getName().contains("북"))
                .filter(p -> p.getPrice() >= 1500000 && p.getPrice() <= 1800000)
                .forEach(p -> System.out.println(p.getName() + ": " + p.getPrice() + "원"));

    }
}
