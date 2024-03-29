package com.pyn.springboot_03.entity.custom;

import com.pyn.springboot_03.entity.Tag;

/**
 * 文章标签的信息的扩展
 */
public class TagCustom extends Tag {
	//标签对应的文章数目
	private Integer articleCount;

	public Integer getArticleCount() {
		return articleCount;
	}

	public void setArticleCount(Integer articleCount) {
		this.articleCount = articleCount;
	}
}
