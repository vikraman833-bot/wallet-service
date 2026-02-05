# Wallet Service

This is a simple wallet service implemented using Spring Boot.

## Features
- Deposit and withdraw money from a wallet
- Get wallet balance by wallet ID
- Thread-safe operations using database locking
- PostgreSQL as database
- Liquibase for database migrations
- Docker and Docker Compose support

## API

### POST /api/v1/wallet
Request:
{
  "walletId": "UUID",
  "operationType": "DEPOSIT",
  "amount": 1000
}

### GET /api/v1/wallets/{walletId}

## Tech Stack
- Java 17
- Spring Boot
- PostgreSQL
- Liquibase
- Docker

##Runninig this application
docker-compose up --build

## Running the application
docker-compose up --build
