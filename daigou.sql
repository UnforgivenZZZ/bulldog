create table admins(
    id serial primary key,
    contact Text Not Null unique,
    admin_name text not null unique,
    password integer not null
);



-- *******************************************
CREATE TABLE users(
	id serial PRIMARY KEY,

	name varchar(30) NOT NULL UNIQUE,
	contact TEXT NOT NULL UNIQUE,
	password varchar(15) NOT NULL,
	profpict TEXT,

	isSeller BOOLEAN NOT NULL default(FALSE),
	registerDate TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT (now() AT TIME ZONE 'UTC')

);

CREATE TABLE address(
	id SERIAL PRIMARY KEY,
	num INTEGER NOT NULL,
	street TEXT NOT NULL,
	apt TEXT,
	city TEXT NOT NULL,
	state TEXT NOT NULL,
	country TEXT NOT NULL,

	users INTEGER references users(id)
);

CREATE TABLE categories(
	id serial PRIMARY KEY,
	name varchar(15) NOT NULL UNIQUE,
	createDate TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT (now() AT TIME ZONE 'UTC')
);


CREATE TABLE products(
	id serial PRIMARY KEY,

	sku TEXT NOT NULL UNIQUE,
	name TEXT NOT NULL,
	price REAL NOT NULL,
	delieverFee REAL NOT NULL,
	descript TEXT NOT NULL,

	seller Integer Not NULL references admins(id),
	postDate TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT (now() AT TIME ZONE 'UTC')
);
create table images(
	id serial primary key,
	pic text NOT NULL UNIQUE,
	prod integer references products(id)
);


CREATE TABLE paymethod(
	id serial primary key,
	method Text NOT NULL PRIMARY KEY,
	owner INTEGER NOT NULL references users(id)
);

CREATE TABLE card(
	id SERIAL PRIMARY KEY,
	card_num integer NOT NULL references paymethod(id),
	holder Text NOT NULL,
	month INTEGER NOT NULL,
	year INTEGER NOT NULL
);
CREATE TABLE pal(
	id SERIAL PRIMARY KEY,
	pal_account integer NOT NULL references paymethod(id),
	account TEXT NOT NULL
);

CREATE TABLE cart(
	id TEXT PRIMARY KEY,
	buyer Integer NOT NULL references users(id),
	purchaseDate TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT (now() AT TIME ZONE 'UTC'),
	method integer NOT NULL references paymethod(methods),
	address INTEGER NOT NULL references address(id)
);

CREATE TABLE orders(
	id SERIAL PRIMARY KEY,
	cart TEXT references cart(id),
	item Integer references products(id),
	num Integer NOT NULL,
	price REAL,
	addDate TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT (now() AT TIME ZONE 'UTC'),
	buyer Integer NOT NULL references users(id),
	confid TEXT NOT NULL references cart(id)

);





