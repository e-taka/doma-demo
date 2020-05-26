SELECT
	id,
	name
FROM reservation
WHERE name LIKE /* @prefix(name) */'hoge%' ESCAPE '$'
