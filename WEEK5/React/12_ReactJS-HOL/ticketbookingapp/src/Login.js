import { useState } from "react";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

function Login() {

  const [loggedIn, setLoggedIn] = useState(false);

  return (

    <div>

      {loggedIn ? <UserPage /> : <GuestPage />}

      <br />

      {loggedIn ? (

        <button onClick={() => setLoggedIn(false)}>
          Logout
        </button>

      ) : (

        <button onClick={() => setLoggedIn(true)}>
          Login
        </button>

      )}

    </div>

  );
}

export default Login;