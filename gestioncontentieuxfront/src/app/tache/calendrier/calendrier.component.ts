import { 
  Component, OnInit } from '@angular/core';
import {
  ChangeDetectionStrategy,ViewChild,TemplateRef,} from '@angular/core';
import {
  ActivatedRoute, Router, Params} from '@angular/router';
import {
  TacheService } from 'src/service/tache.service';

import {
  startOfDay,
  endOfDay,
  subDays,
  addDays,
  endOfMonth,
  isSameDay,
  isSameMonth,
  addHours, parseISO } from 'date-fns';

import { Subject } from 'rxjs';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import {
  CalendarEvent,
  CalendarEventAction,
  CalendarEventTimesChangedEvent,
  CalendarView,
} from 'angular-calendar';

const colors: any = {
  red: {
    primary: '#ad2121',
    secondary: '#FAE3E3',
  },
  blue: {
    primary: '#1e90ff',
    secondary: '#D1E8FF',
  },
  yellow: {
    primary: '#e3bc08',
    secondary: '#FDF1BA',
  },
};




@Component({
  selector: 'app-calendrier',
  changeDetection: ChangeDetectionStrategy.OnPush,
  templateUrl: './calendrier.component.html',
  styleUrls: ['./calendrier.component.css']
})

export class CalendrierComponent{

  @ViewChild('modalContent', { static: true }) modalContent: TemplateRef<any>;

  view: CalendarView = CalendarView.Month;

  CalendarView = CalendarView;

  viewDate: Date = new Date();

  modalData: {
    action: string;
    event: CalendarEvent;
  };

  
  actions: CalendarEventAction[] = [  ];

  refresh: Subject<any> = new Subject();

  events: CalendarEvent[] = [
  ];

  tachesList: any[] = [];

  evenement: CalendarEvent;

  activeDayIsOpen: boolean = true;

  ngOnInit(): void {
    this.findAll();
    
  }

  constructor(private modal: NgbModal, private Router: Router, private tacheService: TacheService) { }

  dayClicked({ date, events }: { date: Date; events: CalendarEvent[] }): void {
    if (isSameMonth(date, this.viewDate)) {
      if (
        (isSameDay(this.viewDate, date) && this.activeDayIsOpen === true) ||
        events.length === 0
      ) {
        this.activeDayIsOpen = false;
      } else {
        this.activeDayIsOpen = true;
      }
      this.viewDate = date;
    }
  }

  eventTimesChanged({
    event,
    newStart,
    newEnd,
  }: CalendarEventTimesChangedEvent): void {
    this.events = this.events.map((iEvent) => {
      if (iEvent === event) {
        return {
          ...event,
          start: newStart,
          end: newEnd,
        };
      }
      return iEvent;
    });
    this.handleEvent('Dropped or resized', event);
  }

  handleEvent(action: string, event: CalendarEvent): void {
    this.modalData = { event, action };
    this.modal.open(this.modalContent, { size: 'lg' });
  }

  addEvent(): void {
    this.events = [
      ...this.events,
      {
        title: 'Nouvel événement',
        start: startOfDay(new Date()),
        end: endOfDay(new Date()),
        color: colors.red,
        draggable: true,
        resizable: {
          beforeStart: true,
          afterEnd: true,
        },
      },
    ];
  }

  deleteEvent(eventToDelete: CalendarEvent) {
    this.events = this.events.filter((event) => event !== eventToDelete);
  }

  setView(view: CalendarView) {
    this.view = view;
  }

  closeOpenMonthViewDay() {
    this.activeDayIsOpen = false;
  }

  findAll() {
    this.tacheService.findall().subscribe(data => {
      this.tachesList = data as [];

      this.tachesList.forEach(tache => {

        this.events = [
          ...this.events,
          {
            title: tache.titre,
            start: parseISO(tache.dateCreation),
            end: parseISO(tache.dateCreation),
            color: colors.red,
            draggable: true,
            resizable: {
              beforeStart: true,
              afterEnd: true,
            },
          },
        ];

        console.log(this.events);
  
        
      });
    })
  }

 


}

