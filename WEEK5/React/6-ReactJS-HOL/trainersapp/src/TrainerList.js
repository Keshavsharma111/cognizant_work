import { Link } from "react-router-dom";
import trainersMock from "./TrainersMock";

function TrainerList() {

    return (
        <div>
            <h2>Trainers List</h2>

            <ul>
                {
                    trainersMock.map((t) => (
                        <li key={t.trainerId}>
                            <Link to={`/trainer/${t.trainerId}`}>
                                {t.name}
                            </Link>
                        </li>
                    ))
                }
            </ul>
        </div>
    );
}

export default TrainerList;