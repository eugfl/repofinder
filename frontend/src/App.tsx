import { ToastContainer } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import Form from "./components/Form";

function App() {
  return (
    <section className="min-h-screen flex flex-col justify-center items-center bg-gray-800 text-white px-4">
      <div className="text-center mb-8">
        <h1 className="text-8xl font-lobster">RepoFinder</h1>
        <h2 className="text-xl mt-2 text-gray-400 font-sans">
          Seu buscador de repositórios
        </h2>
      </div>

      <Form />

      <ToastContainer />
    </section>
  );
}

export default App;
