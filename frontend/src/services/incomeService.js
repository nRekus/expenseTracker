const apiUrl = "/api/income"
export async function postNewIncome(income){
                console.log(this.income);
                const response = await fetch(apiUrl,{
                    method:'POST',
                    headers:{
                        'Content-Type':'application/json'
                    },
                    body:JSON.stringify(this.income)
                })
            }

export async function getAllIncomes(){
    try {
        const response = await fetch(apiUrl);
        const result = await response.json();
        return result;
    } catch (error) {
        console.error("Something went wrong while gathering all Incomes");
    }
}

export async function updateIncome(income) {
    try {
        const response = await fetch(apiUrl+`/${income.id}`,
            {
                method:'PUT',
                headers:{
                    'Content-Type':'application/json'
                },
                body:JSON.stringify(income)
            }
        )
    console.log("Income Updated")
    } catch (error) {
        console.error(`Was not able to update Income with ID: ${income.id}`)
    }
}

export async function deleteIncome(income) {
    try {
        const response = await fetch(apiUrl+`/${income.id}`,{
            method:'DELETE',
            headers:{
                'Content-Type':'application/json'
            },
            body:JSON.stringify(income)
        })
    } catch (error) {
        console.error(`Was not able to delete Income with ID: ${income.id}`)
    }
    
}