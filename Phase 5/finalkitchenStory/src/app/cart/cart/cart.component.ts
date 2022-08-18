import { Component, OnInit } from '@angular/core';
import { SearchService } from 'src/app/search/search.service'; 
import { IFood } from 'src/app/model/food'; 

@Component({
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  cart: IFood[] = [];
  total: number = this.searchService.absoluteTotal;
  constructor(private searchService: SearchService) { }

  ngOnInit(): void {
    this.cart = this.searchService.getCart();
    this.searchService.getTotal()
    this.total = this.searchService.getTotal()
  }


  removeItem(food: IFood) {
    this.searchService.removeItem(food)
    this.total = this.searchService.getTotal()
  }
}