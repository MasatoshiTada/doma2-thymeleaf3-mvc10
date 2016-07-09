SELECT
    e.id AS id,
    e.name AS name,
    e.joined_date AS joined_date,
    e.department_id AS department_id,
    d.name AS department_name
FROM employee e
JOIN department d
ON e.department_id = d.id
WHERE e.id = /*id*/101