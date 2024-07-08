module Program_2 () where 

 main = print $ show v_b
data B_A = C_A | C_B B_B | C_C B_B
data B_B = C_D Int | C_E ((B_A,B_B))

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E ((C_C _,C_E ((_,_)))) -> 0 
  C_E ((C_B (C_D _),C_E _)) -> 1 
  C_E ((C_B (C_E _),C_E _)) -> 2 
  C_E ((C_B _,C_E ((_,_)))) -> 3 
  C_E ((C_B _,C_E _)) -> 4 
  C_E ((C_A,C_E _)) -> 5 
  C_E ((C_B (C_E _),C_D _)) -> 6 
  C_E ((C_B (C_E _),C_E ((_,_)))) -> 7 
