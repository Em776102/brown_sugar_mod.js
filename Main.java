elements.brown_sugar = {
    color: "#B87333",
    behavior: behaviors.POWDER,
    category: "powders",
    state: "solid",
    density: 1150,
    tempHigh: 100,       // turns to caramel at 100°C
    stateHigh: "caramel",
    tempLow: 500,        // burns to ash at 500°C
    stateLow: "ash",
};

elements.brown_sugar.reactions = {};

// Reaction with ketchup → BBQ sauce
elements.brown_sugar.reactions.ketchup = { 
    elem1: elements.ketchup,
    result: "bbq_sauce"
};

// Sugar + Molasses → Brown Sugar
elements.sugar.reactions.molasses = {
    elem2: elements.molasses,
    result: "brown_sugar"
};

elements.molasses.reactions.sugar = {
    elem2: elements.sugar,
    result: "brown_sugar"
};
