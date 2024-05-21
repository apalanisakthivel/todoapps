import "./App.css";
import AddToDo from "./components/Addtodo";
import ViewToDo from "./components/Viewtodo";

function App() {
  return (
    <div className="App">
      <AddToDo />
      <hr />
      <ViewToDo />
    </div>
  );
}

export default App;
