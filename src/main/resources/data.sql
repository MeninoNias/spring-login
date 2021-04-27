INSERT INTO role (role_id, role)
VALUES (1, 'ADMIN') ON CONFLICT (role_id) DO
UPDATE
    SET role = excluded.role;