-- Ingredient per recipe
CREATE TABLE ingredient (
    id BIGSERIAL PRIMARY KEY,
    recipe_id INTEGER REFERENCES recipe(id) ON DELETE CASCADE,
    name VARCHAR(255) NOT NULL,
    quantity VARCHAR(100), -- "2 cups", "1 tbsp", "500 gram" etc.
    position INTEGER NOT NULL DEFAULT 0 -- to preserve order
);