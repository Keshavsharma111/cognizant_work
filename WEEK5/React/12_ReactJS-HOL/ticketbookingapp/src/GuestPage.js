import Flights from "./Flights";

function GuestPage() {
  return (
    <div>
      <h1>Welcome Guest</h1>

      <p>Please browse the available flights.</p>

      <Flights />
    </div>
  );
}

export default GuestPage;