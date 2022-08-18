import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-jsonpipe',
  templateUrl: './jsonpipe.component.html',
  styleUrls: ['./jsonpipe.component.css']
})
export class JsonpipeComponent implements OnInit {

  constructor() { }
object = {"fname":"Mohnish","lname":"Pawar","email":"mohnishpwr10@gmail.com"}
  ngOnInit(): void {
  }

}
