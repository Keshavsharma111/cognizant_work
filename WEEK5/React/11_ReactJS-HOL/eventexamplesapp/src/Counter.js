import React, { useState } from "react";

function Counter() {

  const [count, setCount] = useState(5);

  function increment() {
    setCount(count + 1);
  }

  function decrement() {
    setCount(count - 1);
  }

  function sayHello() {
    alert("Hello! Member1");
  }

  function increase() {
    increment();
    sayHello();
  }

  function welcome(msg) {
    alert(msg);
  }

  function onPress() {
    alert("I was clicked");
  }

  return (
    <div>

      <h3>{count}</h3>

      <button onClick={increase}>Increment</button>
      <br />

      <button onClick={decrement}>Decrement</button>
      <br />

      <button onClick={() => welcome("welcome")}>
        Say welcome
      </button>
      <br />

      <button onClick={onPress}>
        Click on me
      </button>

    </div>
  );
}

export default Counter;