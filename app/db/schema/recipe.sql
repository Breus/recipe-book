CREATE TABLE recipe (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    author_id BIGINT REFERENCES user_account(id) ON DELETE SET NULL
);