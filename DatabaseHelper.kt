// Implementar as classes para o banco de dados Room
// Exemplo simplificado:
@Entity
data class OrdemServicoEntity(
    @PrimaryKey val id: Long,
    val cliente: String,
    // ... outros campos
)

@Dao
interface OrdemServicoDao {
    @Query("SELECT * FROM OrdemServicoEntity")
    fun getAll(): List<OrdemServicoEntity>

    @Insert
    fun insertAll(vararg ordens: OrdemServicoEntity)
}

@Database(entities = [OrdemServicoEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun ordemServicoDao(): OrdemServicoDao
}
