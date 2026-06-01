// Event list
let events = [];

// addEvent()
function addEvent(name, category, seats) {
    events.push({
        name,
        category,
        seats
    });
}

// registerUser()
function registerUser(eventName) {
    const event = events.find(e => e.name === eventName);

    if (event && event.seats > 0) {
        event.seats--;
        console.log(`Registered for ${event.name}. Remaining seats: ${event.seats}`);
    } else {
        console.log(`Registration failed for ${eventName}`);
    }
}

// filterEventsByCategory()
function filterEventsByCategory(callback) {
    return events.filter(callback);
}

// Closure to track registrations
function createRegistrationTracker(category) {
    let totalRegistrations = 0;

    return function () {
        totalRegistrations++;
        console.log(
            `Total registrations for ${category}: ${totalRegistrations}`
        );
    };
}

// Adding events
addEvent("Tech Conference", "Technology", 50);
addEvent("Music Fest", "Entertainment", 30);
addEvent("Coding Workshop", "Technology", 25);

// Register users
registerUser("Tech Conference");
registerUser("Tech Conference");

// Closure usage
const techTracker = createRegistrationTracker("Technology");

techTracker();
techTracker();
techTracker();

// Higher-order function with callback
const technologyEvents = filterEventsByCategory(
    event => event.category === "Technology"
);

console.log("Technology Events:");
technologyEvents.forEach(event => {
    console.log(event.name);
});