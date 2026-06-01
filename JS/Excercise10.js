// const for fixed data
const events = [
    {
        name: "Music Festival",
        category: "Music",
        seats: 50
    },
    {
        name: "Coding Workshop",
        category: "Technology",
        seats: 30
    },
    {
        name: "Art Exhibition",
        category: "Art",
        seats: 20
    }
];

// Default parameter
function addEvent(
    name = "New Event",
    category = "General",
    seats = 0
) {
    return { name, category, seats };
}

// Create new event
const newEvent = addEvent(
    "Dance Show",
    "Entertainment",
    40
);

console.log("New Event:");
console.log(newEvent);

// Destructuring
const { name, category, seats } = events[0];

console.log("\nUsing Destructuring:");
console.log(`Name: ${name}`);
console.log(`Category: ${category}`);
console.log(`Seats: ${seats}`);

// Spread operator
const clonedEvents = [...events];

const musicEvents = clonedEvents.filter(
    event => event.category === "Music"
);

console.log("\nFiltered Music Events:");
console.log(musicEvents);

// let example
let totalEvents = events.length;
totalEvents++;

console.log(`\nTotal Events: ${totalEvents}`);