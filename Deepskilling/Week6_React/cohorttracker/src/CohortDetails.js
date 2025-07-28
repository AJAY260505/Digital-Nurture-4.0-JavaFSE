import React from "react";
import styles from "./CohortDetails.module.css";

function CohortDetails({ cohort }) {
  const statusStyle = {
    color: cohort.status === "Ongoing" ? "green" : "blue"
  };

  return (
    <div className={styles.box}>
      <h3>{cohort.id} {cohort.tech}</h3>
      <dl>
        <dt>Started On</dt>
        <dd>{cohort.startedOn}</dd>

        <dt>Current Status</dt>
        <dd style={statusStyle}>{cohort.status}</dd>

        {cohort.coach && (
          <>
            <dt>Coach</dt>
            <dd>{cohort.coach}</dd>
          </>
        )}

        <dt>Trainer</dt>
        <dd>{cohort.trainer}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
