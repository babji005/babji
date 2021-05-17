export class Post{
    postId: number
    title: string
    body: string
    userId: number

    constructor(){
        this.postId = 0
        this.title = ''
        this.body = ''
        this.userId = 0
    }
}