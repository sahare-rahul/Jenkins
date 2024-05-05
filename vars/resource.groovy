# we are calling script of Resource folder  in pipeline by using "vars" 

def call() {
  def content LibraryResource "bash.sh"   #bash.sh is file name form resource folder , here LibraryREsource extracting content from bash.sh and storing in content 
  writeFile file: "script.sh" , text: content        #and in next step writeFile storing this content in script.sh file and creat thos file 
  sh "sh script.sh"
}
