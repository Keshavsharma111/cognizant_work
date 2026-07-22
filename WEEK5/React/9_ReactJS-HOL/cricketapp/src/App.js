import ListofPlayers from "./ListofPlayers";
import IndianPlayer from "./IndianPlayers";

function App() {

  const flag = true;

  if (flag) {
    return <ListofPlayers />;
  } else {
    return <IndianPlayer />;
  }
}

export default App;