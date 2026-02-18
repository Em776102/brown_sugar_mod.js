const elements = {};

elements.brown_sugar = {
    color: "#B87333",
    behavior: behaviors.POWDER,
    category: "food",
    state: "solid",
    density: 1150,
    tempHigh: 100,
    stateHigh: "caramel",
    tempLow: 500,
    stateLow: "ash",
    viscosity: 1,
    stain: 0,
    hidden: false,
    isFood: true
};

elements.brown_sugar.reactions = {};

elements.brown_sugar.reactions.ketchup = {
    elem1: elements.ketchup,
    result: "bbq_sauce"
};

elements.sugar.reactions.molasses = {
    elem2: elements.molasses,
    result: "brown_sugar"
};

elements.molasses.reactions.sugar = {
    elem2: elements.sugar,
    result: "brown_sugar"
};
