const events = [
    { name: "Tech Conference", seats: 50, isUpcoming: true },
    { name: "Music Festival", seats: 0, isUpcoming: true },
    { name: "Past Workshop", seats: 20, isUpcoming: false }
];

// Display only valid events
events.forEach(event => {
    if (event.isUpcoming && event.seats > 0) {
        console.log(`Event: ${event.name} | Seats Available: ${event.seats}`);
    } else {
        console.log(`Event "${event.name}" is not available for registration.`);
    }
});

// Registration function with error handling
function register(event) {
    try {
        if (!event.isUpcoming) {
            throw new Error("This event has already ended.");
        }

        if (event.seats <= 0) {
            throw new Error("No seats available.");
        }

        event.seats--;
        console.log(`Successfully registered for ${event.name}. Remaining seats: ${event.seats}`);
    } catch (error) {
        console.log(`Registration Error: ${error.message}`);
    }
}

// Test registrations
register(events[0]); // Successful
register(events[1]); // No seats available
register(events[2]); // Event already ended