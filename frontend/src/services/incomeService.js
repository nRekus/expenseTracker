
export async function postNewIncome(income){
                console.log(this.income);
                const response = await fetch("/income",{
                    method:'POST',
                    headers:{
                        'Content-Type':'application/json'
                    },
                    body:JSON.stringify(this.income)
                })
            }

export async function getAllIncomes(){
    try {
        const response = await fetch("/api/income");
        const result = await response.json();
        return result;
    } catch (error) {
        console.error("Something went wrong while gathering all Incomes");
    }
}