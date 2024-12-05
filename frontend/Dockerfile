FROM node:18 AS dev

WORKDIR /app

COPY ./package*.json ./

RUN npm install -g pnpm && pnpm install

COPY . /app

EXPOSE 3000

CMD ["pnpm", "run", "dev"]
