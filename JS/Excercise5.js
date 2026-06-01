// Event class
class Event {
    constructor(name, date, seats) {
        this.name = name;
        this.date = date;
        this.seats = seats;
    }
}

// Add method to prototype
Event.prototype.checkAvailability = function () {
    if (this.seats > 0) {
        return `${this.name} is available with ${this.seats} seats.`;
    } else {
        return `${this.name} is fully booked.`;
    }
};

// Create objects
const event1 = new Event("Tech Conference", "2026-06-15", 50);
const event2 = new Event("Music Festival", "2026-07-10", 0);

// Check availability
console.log(event1.checkAvailability());
console.log(event2.checkAvailability());

// List keys and values using Object.entries()
console.log("\nEvent Details:");

Object.entries(event1).forEach(([key, value]) => {
    console.log(`${key}: ${value}`);
});