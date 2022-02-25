import { Component, OnInit } from '@angular/core';
import {Article} from '../hacker-news/article';
import {articleList} from '../hacker-news/articleList';

@Component({
  selector: 'app-article-create',
  templateUrl: './article-create.component.html',
  styleUrls: ['./article-create.component.css']
})
export class ArticleCreateComponent implements OnInit {
  articles = articleList ;
  articleForm: Article = {
    title: '',
    url: ''
  } ;
  constructor() { }

  ngOnInit(): void {
  }
  handleClick() {
    articleList.push(this.articleForm);
    this.articles = articleList;
    this.articleForm = {
      title: '',
      url: ''
    };
  }

}
