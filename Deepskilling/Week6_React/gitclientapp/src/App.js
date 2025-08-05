// src/App.js
import React, { useEffect, useState } from 'react';
import GitClient from './GitClient';

function App() {
  const [repos, setRepos] = useState([]);
  const gitClient = new GitClient();

  useEffect(() => {
    async function fetchData() {
      const repoNames = await gitClient.getRepositories("AJAY260505");
      setRepos(repoNames);
    }
    fetchData();
  }, []);

  return (
    <div className="App">
      <h1>GitHub Repositories for AJAY260505</h1>
      <ul>
        {repos.map((repo, index) => (
          <li key={index}>{repo}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;
