package br.com.pessoafisica;

public class PessoaFisica {
    private String cpf;

    public PessoaFisica(String cpf) {
        if (cpf == null || !validaCPF(cpf)) {
            throw new IllegalArgumentException("CPF inválido");
        }
        this.cpf = cpf;
    }

    public String getCPF() {
        return cpf;
    }

    private boolean validaCPF(String cpf) {
        // Implemente aqui a lógica para validar o CPF
    	
        
        // Exemplo simplificado: verifica se o CPF possui 11 dígitos
        return cpf.matches("\\d{11}");
    }

    public static void main(String[] args) {
        try {
            PessoaFisica pessoa1 = new PessoaFisica("12345678910"); // CPF válido
            System.out.println("CPF: " + pessoa1.getCPF());

            // Tentativa de criar PessoaFisica com CPF inválido
            PessoaFisica pessoa2 = new PessoaFisica("123.456.789-00"); // CPF inválido
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
