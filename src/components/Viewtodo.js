import axios from "axios";
import { useEffect, useState } from "react";
export default function ViewToDo() {
  const [todos, setToDos] = useState([]);
  useEffect(() => {
    axios
      .get("http://localhost:8080/api/todo/retrivetodo")
      .then((response) => setToDos(response.data))
      .catch((error) => console.log(error));
  }, []);
  return (
    <div>
      <h2>Tasks</h2>
      <ul>
        {todos.map((item) => {
          return <li>{item.name}</li>;
        })}
      </ul>
    </div>
  );
}
