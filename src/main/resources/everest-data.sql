INSERT INTO
    `customer` (
        `name`,
        `address`,
        `email`,
        `phone`,
        `username`,
        `password`
    )
VALUES
    (
        'leo',
        '123 Road',
        'leo@domain.com',
        '012345678',
        'LB2024',
        'testing'
    );

INSERT INTO
    `item` (
        `customer_id`,
        `name`,
        `price`,
        `quantity`,
        `description`
    )
VALUES
    (1, 'card reader', 44.99, 1146, 'reader');

INSERT INTO
    `item` (
        `customer_id`,
        `name`,
        `price`,
        `quantity`,
        `description`
    )
VALUES
    (1, 'phone', 679.99, 6713, 'reader');

INSERT INTO
    `item` (
        `customer_id`,
        `name`,
        `price`,
        `quantity`,
        `description`
    )
VALUES
    (1, 'card', 0.99, 15, 'reader');

INSERT INTO
    `item` (
        `customer_id`,
        `name`,
        `price`,
        `quantity`,
        `description`
    )
VALUES
    (1, 'book', 14.99, 93, 'reader');