import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CartComponent } from './cart/cart/cart.component';
import { CheckoutComponent } from './cart/checkout/checkout.component';
import { PurchaseComponent } from './cart/purchase/purchase.component';
import { InventoryComponent } from './inventory/inventory/inventory.component';
import { ChangeComponent } from './login/change/change.component';
import { LoginComponent } from './login/login/login.component';
import { SearchComponent } from './search/search/search.component';
import { ReactiveFormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    AppComponent,
    CartComponent,
    CheckoutComponent,
    PurchaseComponent,
    InventoryComponent,
    ChangeComponent,
    LoginComponent,
    SearchComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
