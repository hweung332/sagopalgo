package org.trinityfforce.sagopalgo.item.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.trinityfforce.sagopalgo.category.entity.Category;
import org.trinityfforce.sagopalgo.global.common.Timestamped;
import org.trinityfforce.sagopalgo.user.entity.User;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Item")
public class Item extends Timestamped {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 시작가
    @Column(nullable = false)
    private Integer startPrice;

    // 입찰가
    @Column(nullable = false)
    private Integer bidUnit;

    // 입찰 수
    @Column(nullable = false)
    private Integer bidCount;

    // 마감일
    @Column
    private LocalDateTime deadline;

    // 현재가(최고가)
    @Column
    private Integer highestPrice;

    // 카테고리
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    // 작성자(게시자)
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}