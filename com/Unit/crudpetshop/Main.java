
package com.Unit.crudpetshop;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Main extends JFrame 
{

    public static void main(String[] args)
    {
        Main formHome = new Main();
        formHome.setVisible(true);
    }

    //inicializando os botões e as arraylists
    public JButton btnCadastrocliente;
    private JButton btnConsultacliente;
    private JButton btnCadastraPet;
    private JButton btnConsultaPet;
    private JButton btnVendaPet;
    private JButton btnRelatorio;
    private JButton btnVendidos;

    private ArrayList<Pet> listaPets = new ArrayList<Pet>();
    private ArrayList<Animal> listaAnimais = new ArrayList<Animal>();
    private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    private ArrayList<Pet> listaVendidos = new ArrayList<Pet>();
    private ArrayList<Double> listaProvisoes = new ArrayList<Double>();

    //#region definindo botões e criando o frame:

    public Main()
    {
        btnCadastrocliente = new JButton();
        btnCadastrocliente.setBounds(10,100,150,50);
        btnCadastrocliente.setText("Cadastrar Cliente");
        this.add(btnCadastrocliente);

        btnConsultacliente = new JButton();
        btnConsultacliente.setBounds(170,100,150,50);
        btnConsultacliente.setText("Consultar cliente");
        this.add(btnConsultacliente);    

        btnCadastraPet = new JButton();
        btnCadastraPet.setBounds(330,100,150,50);
        btnCadastraPet.setText("Cadastrar pet");
        this.add(btnCadastraPet);

        btnConsultaPet = new JButton();
        btnConsultaPet.setBounds(10,200,150,50);
        btnConsultaPet.setText("Consultar pet");
        this.add(btnConsultaPet);

        btnVendaPet = new JButton();
        btnVendaPet.setBounds(170,200,150,50);
        btnVendaPet.setText("Vender pet");
        this.add(btnVendaPet);

        btnRelatorio = new JButton();
        btnRelatorio.setBounds(330,200,150,50);
        btnRelatorio.setText("Relatório");
        this.add(btnRelatorio);

        btnVendidos = new JButton();
        btnVendidos.setBounds(170,300,150,50);
        btnVendidos.setText("Consultar vendas");
        this.add(btnVendidos);


        JFrame frame = new JFrame();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setResizable(false);
        this.setVisible(true);

    //#endregion

    
    //#region Cadastro de clientes:

        btnCadastrocliente.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(e.getSource() == btnCadastrocliente)
                {
                    try
                    {
                        Cliente cliente = new Cliente();
                        cliente.setNome(JOptionPane.showInputDialog("Nome: "));
                        cliente.setCpf(JOptionPane.showInputDialog("CPF: "));
                        cliente.setTel(JOptionPane.showInputDialog("Telefone:"));
                        listaClientes.add(cliente);
                    }
                   
                    catch(Exception ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                }
                
            }
            
        });
        //#endregion

        //#region consulta de cliente
        btnConsultacliente.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(e.getSource() == btnConsultacliente)
                {
                    try
                    {
                        for(Cliente i: listaClientes)
                        {
                            JOptionPane.showMessageDialog(null,"Nome: " + i.getNome() + "\n" + "Cpf: " + i.getCpf() + "\n" + "Tel: "+ i.getTel());
                        }

                        
                    }
                   
                    finally
                    {

                    }
                }
                
            }
            
        });
        //#endregion
       
        //#region cadastro de pets
        btnCadastraPet.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == btnCadastraPet)
                {
                    try
                    {
                        Pet pet = new Pet();
                        Animal animal = new Animal();
                        

                        String[] especies = {"Cão", "Gato", "Pássaro"};
                        String[] opcoesCachorro = {"Em pelo","Raso","Curto","Semi-longo"};

                        var tipoanimal = JOptionPane.showOptionDialog(null, "Qual é a espécie do animal?", 
                        "Selecionar animal", JOptionPane.YES_NO_CANCEL_OPTION, 
                        JOptionPane.INFORMATION_MESSAGE,null, especies,0);

                    
                        switch(tipoanimal)
                        {
                            case 0:
                            Cachorro cachorro = new Cachorro();
                            animal.setEspecie("Cão");
                            pet.setTiporacao("Ração para cachorro");
                            var preferenciasCachorro= JOptionPane.showOptionDialog(null, "Como o cliente prefere?","preferências cachorro"
                            ,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opcoesCachorro,0);

                            switch(preferenciasCachorro)
                            {
                                case 0:
                                animal.setPreferencias("Em pelo");
                                cachorro.CadastraAnimal();
                                break;
                                
                                case 1:
                                animal.setPreferencias("Raso");
                                cachorro.CadastraAnimal();
                                break;

                                case 2:
                                animal.setPreferencias("Curto");
                                cachorro.CadastraAnimal();
                                break;
                                
                                case 3:
                                animal.setPreferencias("Semi-Longo");
                                animal.setEspecie("Cachorro");
                                cachorro.CadastraAnimal();
                                break;
                            }

                            break;

                            case 1:
                            Gato gato = new Gato();
                            animal.setEspecie("Gato");
                            pet.setTiporacao("Ração para gato");
                            var gatodomesticado = JOptionPane.showOptionDialog(null, "Domesticado?","preferências gato"
                            ,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,0);

                                switch(gatodomesticado)
                                {
                                    case 0:
                                    animal.setPreferencias("Domesticado");             
                                    gato.CadastraAnimal();
                                    break;

                                    case 1:
                                    animal.setPreferencias("Não domesticado");
                                    gato.CadastraAnimal();
                                    break;
                                }

                                break;
                        
                            case 3:
                            Passaro passaro = new Passaro();
                            animal.setEspecie("Pássaro");
                            pet.setTiporacao("Alpiste");
                            var asascortadas = JOptionPane.showOptionDialog(null, "Asas cortadas?","preferências pássaro"
                            ,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,0);

                            switch(asascortadas)
                            {  case 0: 
                                animal.setPreferencias("Asas cortadas");
                                passaro.CadastraAnimal();
                                break;

                                case 1:
                                animal.setPreferencias("Asas inteiras");
                                passaro.CadastraAnimal();
                                break;
                            }
                    
                            break;
                        }
                        pet.setcodigo(listaPets.size()+1);
                        pet.setNome(JOptionPane.showInputDialog("Nome: "));
                        pet.setApelido(JOptionPane.showInputDialog("Apelido: "));
                        pet.setSexo(JOptionPane.showInputDialog("Sexo :"));
                        pet.setdataEntrada(JOptionPane.showInputDialog("Data de entrada: "));
                        pet.setIdade(JOptionPane.showInputDialog("Idade: "));
                        var quantidaderacao = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de ração"));
                        pet.setQuantidaderacao(quantidaderacao);
                        pet.setSomaracao(quantidaderacao);
                        pet.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Peso: ")));
                        pet.setDataVenda("?");
                        pet.setCpf("?");
                        listaAnimais.add(animal);
                        listaPets.add(pet);
                        listaProvisoes.add(quantidaderacao);

                    } catch (Exception e1) {
                      
                        e1.printStackTrace();
                    } 
                }
                
            }
            
        });
        //#endregion
        
        //#region consulta de pet
        btnConsultaPet.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(e.getSource() == btnConsultaPet)
                {
                    try
                    {
                        for(Pet i: listaPets)
                        {
                            for(Animal a: listaAnimais)
                            {
                                JOptionPane.showMessageDialog(null, "Id: " + i.getCodigo() + "\n" + "Tipo de animal: " + a.getEspecie() + "\n" + "Preferências: " + a.getPreferencias() + "\n" + "Nome: " + i.getNome() + "\n" + "Apelido: "+ i.getApelido() +"\n" +
                                "Sexo: " + i.getSexo() + "\n" + "Data de entrada: " + i.getdataEntrada()  + "\n" + "Idade: "
                              + i.getIdade()  + "\n" + "Tipo de ração: " + i.getTiporacao()  + "\n" + "Quantidade de ração: " + 
                              i.getQuantidaderacao()  + "\n" + "Peso: " + i.getPeso() + "\n" + "Data da venda: " + i.getDataVenda()
                                + "\n" + "Cpf do dono: " + i.getCpf());
                            }
                        }

                        if(listaPets.isEmpty() && listaAnimais.isEmpty())
                        {
                           
                            JOptionPane.showMessageDialog(null, "Não há pets cadastrados!");
                            
                        }
                    }
                   
                    catch(Exception ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                }
                
            }
            
        });
        //#endregion
        
        //#region venda de pets:
        btnVendaPet.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(e.getSource() == btnVendaPet)
                {
                    try
                    {
                        var checacpf = JOptionPane.showInputDialog("Cpf:");
                        for(Cliente c: listaClientes)
                        {
                            if(c.getCpf().contains(checacpf)) 
                            {
                                for(Pet p: listaPets)
                                {
                                    for(Animal a: listaAnimais)
                                    {
                                        var checaidpet = Integer.parseInt(JOptionPane.showInputDialog("Id do pet: "));
                                    
                                    if(p.getCodigo() == checaidpet)
                                    {
                                        Pet petvendido = new Pet();
                                        petvendido.setDataVenda(JOptionPane.showInputDialog("Data da venda:"));
                                        petvendido.setCpf(checacpf);
                                        listaVendidos.add(petvendido);
                                        System.out.println("Vendido!");
                                        listaPets.remove(p);
                                        listaAnimais.remove(a);
                                    }
                                    }
                                    
                                }
                            }
                        }
                    }
                   
                    catch(Exception ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                }
                
            }
            
        });
        //#endregion
        
        //#region checagem de pets vendidos:
        btnVendidos.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(e.getSource() == btnVendidos)
                {
                    try
                    {
                        for(Pet v: listaVendidos)
                        {
                            JOptionPane.showMessageDialog(null, "Animais vendidos:" + "\n" + "Id: " + v.getCodigo()+1 + "\n"
                            + "Cpf do dono: " + v.getCpf()  + "\n" + "Data da venda: " + v.getDataVenda());
                        }   
                        
                    }
                   
                    catch(Exception ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                }
            }
            
        });

        //#endregion

        //#region relatório de provisões:
        btnRelatorio.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(e.getSource() == btnRelatorio)
                {
                    try
                    {
                      for(Pet p: listaPets)
                      {
                        for(Animal a: listaAnimais)
                      {
                        double quantidaderacao = 0;
                        for(int i = 0; i< listaProvisoes.size(); i++)
                        {
                            quantidaderacao += listaProvisoes.get(i);
                        }
                        JOptionPane.showMessageDialog(null,"Animais cadastrados: " + (listaPets.indexOf(p) +1) + "\n" 
                            + "Quantidade total de ração disponível:" + quantidaderacao);

                      }
                      }
                    }
                   
                    catch(Exception ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                }
                
            }
            
        });

        //#endregion
    }
}

   