import './CohortDetails.css';

function CohortDetails({ cohort }) {
  return (
    <div className="cohort-card">
      <h3>{cohort.cohortCode} - {cohort.technology}</h3>
      <div className="cohort-info">
        <p><strong>Started On:</strong> {cohort.startDate}</p>
        <p><strong>Status:</strong> {cohort.currentStatus}</p>
        <p><strong>Coach:</strong> {cohort.coachName}</p>
        <p><strong>Trainer:</strong> {cohort.trainerName}</p>
      </div>
    </div>
  );
}

export default CohortDetails;