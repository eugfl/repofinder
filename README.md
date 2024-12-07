# RepoFinder

RepoFinder é uma aplicação minimalista e responsiva para pesquisar repositórios de usuários no GitHub. Com um design elegante em modo escuro, a aplicação permite visualizar a lista de repositórios, total de repositórios e links diretos para o perfil do usuário no GitHub.

## 📋 Visão Geral

Esta aplicação full-stack foi desenvolvida utilizando Java, React e TypeScript, com integração à API do GitHub.

> 🚀 Tecnologias utilizadas: **Java, Spring Boot, React, Vite, Tailwind CSS, TypeScript**

## 🎨 Funcionalidades

- **Campo de busca**: Permite pesquisar usuários pelo nome de perfil no GitHub.
- **Exibição de resultados**: Mostra os repositórios, total de repositórios, nome do usuário e um link para o perfil no GitHub.
- **Design responsivo**: Layout ajustável para dispositivos móveis e desktops.
- **Modo escuro**: Experiência visual minimalista e moderna.

## 🛠️ Tecnologias

- [React](https://react.dev/)
- [Vite](https://vitejs.dev/)
- [TypeScript](https://www.typescriptlang.org/)
- [Tailwind CSS](https://tailwindcss.com/)
- [Java](https://docs.oracle.com/en/java/)
- [Spring Boot](https://spring.io/)

## 🖥️ Demonstração

<img src="./public/repofinder.png" alt="Demonstração do RepoFinder" width="100%"/>

## 🚀 Links

| Ambiente | URL                                           |
| -------- | --------------------------------------------- |
| Local    | http://localhost:3000                         |
| Local    | http://localhost:8080/github/user/${username} |

## 📦 Estrutura do Projeto

O projeto segue uma estrutura modular para fácil manutenção:

### **Front-end:**

- **components/**: Componentes reutilizáveis da interface.
- **pages/**: Páginas da aplicação.

### **Back-end:**

- **client/**: Arquivos de configuração dos clients da api.
- **config/**: Arquivo de configuração do CORS da api.
- **services/**: Integração com a API do GitHub.
- **controller/**: Arquivo de configuração das rotas da api.
- **model/**: Arquivos de definição das respostas das rotas da api.

## ✅ Requisitos

Antes de começar, certifique-se de ter essas tecnologias instaladas:

- **Git** ([link para download](https://git-scm.com))
- **Node.js** ([link para download](https://nodejs.org/en/))
- **JDK** ([link para download](https://www.oracle.com/java/technologies/downloads/#java8))

## 📌 Como iniciar

1. Clone o repositório e entre no pasta do projeto:
   ```bash
   git clone https://github.com/eugfl/repofinder.git
   cd repoofinder
   ```
2. Entre na pasta do back-end e abra com seu editor de código:
   ```bash
   cd backend
   code .
   ```
3. Instale as dependências necessárias para o projeto funcionar:
   ```
   mvn clean install
   ```
4. Execute o servidor da api:

   ```
   ./mvnw spring-boot:run
   ```

5. Abra outro shell e entre na pasta do front-end:

   ```
   cd frontend
   ```

6. Instale as dependências necessárias para o projeto funcionar:
   ```
   pnpm install
   ```
7. Execute a aplicação:
   ```
   pnpm run dev
   ```
8. Abra no seu navegador e utilize:
   ```
   http://localhost:3000
   ```

## 🔍 Exemplo de Busca na API

### **Endpoint:**

GET `http://localhost:8080/github/user/${username}`

### **Resposta:**

```json
{
  "login": "eugfl",
  "htmlUrl": "https://github.com/eugfl",
  "repositories": [
    {
      "name": "repofinder",
      "description": null,
      "private": false,
      "html_url": "https://github.com/eugfl/repofinder"
    }
  ]
}
```

## 🤝 Colaborador

<table>
  <tr>
    <td align="center">
      <a href="https://www.linkedin.com/in/gabriel-figueiredo-lima/">
        <img src="https://avatars.githubusercontent.com/u/108552377?v=4" width="100px;" alt="Foto de Gabriel"/><br>
        <sub>
          <b>Gabriel Figueiredo de Lima</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

[![LinkedIn](https://img.shields.io/badge/✨%20Gabriel%20Figueiredo%20de%20Lima,%202024-LinkedIn-009?style=blue)](https://www.linkedin.com/in/gabriel-figueiredo-lima/)
