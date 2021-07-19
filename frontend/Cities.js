'use strict'

const NAME = document.querySelector("#name");
const CONTINENT = document.querySelector(#"continent");
const TOURISTS = document.querySelector(#"noOfTourists");
const BEACH = document.querySelector(#"hasBeach");

Let searchButton = document.querySelector("#srch");

const createHoliday = (e) => {
    e.preventDefault();

const NAME_VALUE = NAME.value;
const CONTINENT_VALUE = CONTINENT.value;
const TOURISTS_VALUE = TOURISTS.value;
const BEACH_VALUE = BEACH.value;

console.log(NAME_VALUE, CONTINENT_VALUE, TOURISTS_VALUE, BEACH_VALUE);

}

searchButton.addeventListener('click', createHoliday);


