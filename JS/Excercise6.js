// Array of events
let events = [];

// Add new events using push()
events.push(
    { name: "Music Festival", category: "Music" },
    { name: "Baking Workshop", category: "Workshop" },
    { name: "Rock Concert", category: "Music" },
    { name: "Coding Bootcamp", category: "Technology" }
);

// Display all events
console.log("All Events:");
console.log(events);

// Filter only music events
const musicEvents = events.filter(
    event => event.category === "Music"
);

console.log("\nMusic Events:");
console.log(musicEvents);

// Format display cards using map()
const eventCards = events.map(
    event => `${event.category} on ${event.name}`
);

console.log("\nEvent Cards:");
eventCards.forEach(card => console.log(card));