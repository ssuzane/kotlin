package br.senai.sp.jandira.rickandmorty.service

import br.senai.sp.jandira.telainicio.service.AlunoService
import br.senai.sp.jandira.telainicio.service.MateriaService
import br.senai.sp.jandira.telainicio.service.CadernoVirtualService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    private val BASE_URL = "http://10.0.2.2:8080/v1/studyfy/"

    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getMateriaService(): MateriaService {
        return retrofitFactory.create(MateriaService::class.java)
    }

    fun getAlunoService(): AlunoService{
        return retrofitFactory.create(AlunoService::class.java)
    }

    fun postAlunosService(): AlunoService{
        return retrofitFactory.create(AlunoService::class.java)
    }

    fun getCadernoVirtualAluno() : CadernoVirtualService{
        return retrofitFactory.create(CadernoVirtualService::class.java)
    }
}