FROM node:12
WORKDIR /Library


COPY src/main/java /*

RUN npm install

COPY . .

ENV PORT=8080

EXPOSE 8080

CMD [ "npm", "start" ]
