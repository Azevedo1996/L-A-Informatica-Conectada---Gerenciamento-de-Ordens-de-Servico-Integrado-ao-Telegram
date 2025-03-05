class OrdemServicoAdapter(private val ordens: List<OrdemServico>) :
    RecyclerView.Adapter<OrdemServicoAdapter.OrdemServicoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrdemServicoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_ordem_servico, parent, false)
        return OrdemServicoViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrdemServicoViewHolder, position: Int) {
        val ordem = ordens[position]
        holder.clienteTextView.text = ordem.cliente
        holder.descricaoTextView.text = ordem.descricao
        holder.statusTextView.text = ordem.status
    }

    override fun getItemCount() = ordens.size

    class OrdemServicoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val clienteTextView: TextView = itemView.findViewById(R.id.clienteTextView)
        val descricaoTextView: TextView = itemView.findViewById(R.id.descricaoTextView)
        val statusTextView: TextView = itemView.findViewById(R.id.statusTextView)
    }
}
