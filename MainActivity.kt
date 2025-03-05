class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: OrdemServicoAdapter
    private lateinit var viewModel: OrdemServicoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        viewModel = ViewModelProvider(this).get(OrdemServicoViewModel::class.java)

        viewModel.ordens.observe(this, { ordens ->
            adapter = OrdemServicoAdapter(ordens)
            recyclerView.adapter = adapter
        })

        // Exemplo de uso do TelegramService:
        val telegramService = TelegramService("SEU_TOKEN_AQUI", "ID_DO_CHAT")
        telegramService.enviarMensagem("Aplicativo iniciado!")
    }
}
