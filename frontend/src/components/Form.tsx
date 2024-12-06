import { useState } from "react";
import axios from "axios";
import { toast } from "react-toastify";
import RepositoryList from "./RepositoryList";

function Form() {
  const [username, setUsername] = useState("");
  const [loading, setLoading] = useState(false);
  const [userData, setUserData] = useState<any>(null);

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();
    setLoading(true);
    setUserData(null);

    try {
      const response = await axios.get(
        `http://localhost:8080/github/user/${username}`
      );
      setUserData(response.data);
    } catch (err: any) {
      if (err.response) {
        const errorMessage = err.response.data.message || "Erro desconhecido.";
        toast.error(errorMessage);
      } else {
        toast.error("Erro ao comunicar com a API.");
      }
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="w-full max-w-sm mx-auto bg-gray-700 p-6 rounded-lg shadow-lg">
      <form onSubmit={handleSubmit} className="flex flex-col gap-4">
        <label
          htmlFor="github-username"
          className="text-white text-lg font-sans"
        >
          Digite o usuário do GitHub
        </label>

        <input
          type="text"
          id="github-username"
          placeholder="Digite aqui"
          value={username}
          onChange={(e) => setUsername(e.target.value)}
          className="w-full p-3 mt-2 rounded-md bg-gray-800 text-white placeholder-gray-400 focus:outline-none focus:ring-2 focus:ring-blue-500"
        />

        <button
          type="submit"
          disabled={loading}
          className="w-full p-3 mt-4 rounded-md bg-blue-600 text-white hover:bg-blue-700 focus:outline-none focus:ring-2 focus:ring-blue-500"
        >
          {loading ? "Buscando..." : "Buscar"}
        </button>
      </form>

      {userData && (
        <RepositoryList
          login={userData.login}
          htmlUrl={userData.htmlUrl}
          repositories={userData.repositories}
          totalRepositories={userData.totalRepositories}
        />
      )}
    </div>
  );
}

export default Form;
