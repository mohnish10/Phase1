import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CasepipeComponent } from './casepipe/casepipe.component';
import { CurrencypipeComponent } from './currencypipe/currencypipe.component';
import { DatepipeComponent } from './datepipe/datepipe.component';
import { DecimalpipeComponent } from './decimalpipe/decimalpipe.component';
import { JsonpipeComponent } from './jsonpipe/jsonpipe.component';

@NgModule({
  declarations: [
    AppComponent,
    CasepipeComponent,
    CurrencypipeComponent,
    DatepipeComponent,
    DecimalpipeComponent,
    JsonpipeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
