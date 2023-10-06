
import React from "react";
import"./Question.css";
import axios from "axios";

import { useState } from 'react';



function Question (){
    
const [content, setContent] = useState('')
const [timestamps, setTimestamps] = useState('')
const [asker, setAsker] = useState('')

const handleSubmit = (e) => {

    e.preventDefault();

    console.log({
        content: content,
        timestamps: new Date().toISOString().split("Z")[0],
        asker: asker

    })

    axios.post("http://localhost:8000/addQuestion", {
        content: content,
        timestamps: new Date().toISOString().split("Z")[0],
        asker: asker
  }, { headers: {"Content-Type": "application/json" } })

    .then((Response) => {
      console.log(Response.data)
      alert('Successfully posted')
    })

    .catch((err) => {
      console.log(err)
      console.log(err.Response)

    })
}
    return(
        <div className="question-body">
            <div className="question-header">
                <h1 className="question-h1">Q &  A</h1>
            </div>
            <div className="question-tab" style={{marginTop:"90px", marginLeft:"290px"}}>
                <div className="flex-div">
                   <textarea id="review" name="review" rows="4" placeholder="Type your question..." cols="50" onChange={e =>{setContent(e.target.value)}}> </textarea>
                </div>
               
                     </div>
                     <div className="reply">
                    <button >reply</button>
                </div>
                     <div>
                     <button style={{marginTop:"90px", marginLeft:"-60px", height:"40px"}} onClick={handleSubmit} className="button-input">submit</button>
        
                     </div>
        
            </div>
            

    );
};


export default Question;

