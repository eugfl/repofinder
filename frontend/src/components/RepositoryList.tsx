interface Repository {
  name: string;
  description: string | null;
  html_url: string;
}

interface UserRepositoriesProps {
  login: string;
  htmlUrl: string;
  repositories: Repository[];
  totalRepositories: number;
}

const RepositoryList: React.FC<UserRepositoriesProps> = ({
  login,
  htmlUrl,
  repositories,
  totalRepositories,
}) => {
  return (
    <div className="mt-6 p-4 bg-gray-700 rounded-md">
      <h3 className="text-xl font-semibold text-white">
        Repositórios de {login}
      </h3>
      <p className="text-gray-400">
        Total de Repositórios: {totalRepositories}
      </p>
      <a
        href={htmlUrl}
        target="_blank"
        rel="noopener noreferrer"
        className="text-blue-400 hover:underline"
      >
        Ver perfil no GitHub
      </a>
      <div className="mt-4 space-y-4">
        {repositories.map((repo) => (
          <div key={repo.name} className="p-4 bg-gray-800 rounded-md shadow-md">
            <h4 className="font-bold text-white">{repo.name}</h4>
            <p className="text-gray-300">
              {repo.description || "Sem descrição disponível"}
            </p>
            <a
              href={repo.html_url}
              target="_blank"
              rel="noopener noreferrer"
              className="text-blue-400 hover:underline"
            >
              Acessar Repositório
            </a>
          </div>
        ))}
      </div>
    </div>
  );
};

export default RepositoryList;
