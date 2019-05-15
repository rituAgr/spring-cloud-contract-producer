import org.springframework.cloud.contract.spec.Contract

Contract.make{
    description "Should return a List of frauds"
    request{
        url "/fraud"
        method GET()
    }
    response{
        status 201
        body (["marcin","josh"])
    }
}