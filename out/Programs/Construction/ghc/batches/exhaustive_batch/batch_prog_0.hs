module Program_0 () where 

 main = print $ show v_b
data B_A = C_A B_A B_A | C_B | C_C | C_D B_A Char | C_E (((Int,Char),(Char,Int))) (((Bool,Int),B_A))

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ (C_A _ (C_A _ _)) -> 0 
  C_A _ (C_A _ C_B) -> 1 
  C_A _ (C_A _ C_C) -> 2 
  C_A _ (C_A _ (C_D _ _)) -> 3 
  C_A _ (C_A _ (C_E _ _)) -> 4 
  C_A _ C_B -> 5 
  C_A _ C_C -> 6 
  C_A _ (C_D _ _) -> 7 
  C_A _ (C_E _ ((_,_))) -> 8 
  C_B -> 9 
  C_C -> 10 
  C_D _ _ -> 11 
  C_E (((_,_),(_,_))) (((_,_),C_A _ _)) -> 12 
  C_E (((_,_),(_,_))) (((_,_),C_B)) -> 13 
  C_E (((_,_),(_,_))) (((_,_),C_C)) -> 14 
  C_E (((_,_),(_,_))) (((_,_),C_D _ _)) -> 15 
  C_E (((_,_),(_,_))) (((_,_),C_E _ _)) -> 16 
