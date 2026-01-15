-- Insert role (if needed)
INSERT INTO  todo_management.roles (name) VALUES ('ROLE_USER');

-- Insert user pass test
INSERT INTO todo_management.users (name, username, email, password)
VALUES ('Test User', 'testuser', 'testuser@example.com', '$2a$10$jT04xe.xzZXfkbdsdYa21uvcoqOtSyiwMg3DsNYsrWkDHHodCPtN.');

-- Link user and role
INSERT INTO todo_management.users_roles (user_id, role_id) VALUES (1, 1);