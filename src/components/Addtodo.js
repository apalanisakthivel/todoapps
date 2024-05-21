import { useState } from "react";
import axios from "axios";

export default function AddToDo() {
  const [todo, setToDo] = useState("");

  const handleSubmit = async (event) => {
    event.preventDefault();
    console.log(todo);
    try {
      const response = await axios.post(
        "http://localhost:8080/api/todo/newtodo",
        {
          name: todo,
        }
      );
      if (response) {
        console.log("Inserted.!");
      }
    } catch (error) {
      console.log(error);
    }
  };
  return (
    <div>
      <h1>ToDo Application</h1>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="todo"
          placeholder="enter your task"
          value={todo}
          onChange={(event) => setToDo(event.target.value)}
        />
        <button type="submit">Add</button>
      </form>
    </div>
  );
}
