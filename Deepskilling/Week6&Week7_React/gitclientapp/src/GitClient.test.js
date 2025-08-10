// src/GitClient.test.js
import axios from 'axios';
import GitClient from './GitClient';

jest.mock('axios'); // ⬅️ Mock axios

describe("Git Client Tests", () => {
  test("should return repository names for AJAY260505", async () => {
    const mockRepos = [
      { name: "Repo1" },
      { name: "Repo2" },
      { name: "Repo3" }
    ];

    axios.get.mockResolvedValue({ data: mockRepos });

    const client = new GitClient();
    const repos = await client.getRepositories("AJAY260505");

    expect(repos).toEqual(["Repo1", "Repo2", "Repo3"]);
  });
});
