module Program_26 () where 

 main = print $ show v_b
data B_B = C_E B_B | C_F (B_A ((Bool,Int)) B_B) | C_G
data B_A a b = C_A | C_B | C_C | C_D B_B a

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G -> 0 
  C_E _ -> 1 
  C_E (C_F (C_D _ _)) -> 2 
  C_E (C_F _) -> 3 
  C_E (C_F (C_A)) -> 4 
  C_E (C_E (C_F _)) -> 5 
  C_E (C_E (C_E _)) -> 6 
  C_F (C_D _ ((_,_))) -> 7 
  C_F (C_D _ _) -> 8 
  C_F (C_D C_G ((_,_))) -> 9 
  C_F (C_D (C_E _) ((_,_))) -> 10 
  C_F (C_D (C_F _) _) -> 11 
  C_F (C_D C_G _) -> 12 
