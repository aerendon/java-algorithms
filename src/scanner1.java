static class Scanner{
    BufferedReader br=null;
    StringTokenizer tk=null;
    public Scanner(){
        br=new BufferedReader(new InputStreamReader(System.in));
    }
    public String next() throws IOException{
        while(tk==null || !tk.hasMoreTokens())
            tk=new StringTokenizer(br.readLine());
        return tk.nextToken();
    }
    public int nextInt() throws NumberFormatException, IOException{
        return Integer.parseInt(next());
    }
    public long nextLong() throws NumberFormatException, IOException{
        return Long.parseLong(next());
    }
    public double nextDouble() throws NumberFormatException, IOException{
        return Double.parseDouble(next());
    }
}
