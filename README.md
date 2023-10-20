# dio-trilha-java-basico
## repositorio criado com o intuito de armazenar desafios de projeto do bootcamp DIO

```mermaid
classDiagram
  class User {
    - name: String
    - account: Account
    - features: Features[]
    - card: Card
    - news: News[]
  }
  class Account {
    - number: String
    - agency: String
    - balance: Number
    - limit: Number
  }
  class Features {
    - icon: String
    - description: String
  }
  class Card {
    - number: String
    - limit: Number
  }
  class News {
    - icon: String
    - description: String
  }

  User -- Account
  User -- Features
  User -- Card
  User -- News
```
