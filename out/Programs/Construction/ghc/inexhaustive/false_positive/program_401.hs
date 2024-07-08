module Program_24 () where 

 main = print $ show v_b
data B_C e = C_C (B_B e e) ((Bool,Int)) | C_D (B_A e e) | C_E (B_C e) | C_F ((Int,Int))
data B_A a b = C_A Bool
data B_B c d = C_B (B_C c) ((Bool,(Bool,Char)))

v_a :: B_C Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_B (C_C _ _) ((_,_))) ((_,_)) -> 0 
  C_C (C_B (C_D _) ((_,_))) ((_,_)) -> 1 
  C_C (C_B (C_E _) ((_,_))) ((_,_)) -> 2 
  C_C (C_B (C_F _) ((_,_))) ((_,_)) -> 3 
  C_D (C_A _) -> 4 
  C_E (C_C _ ((_,_))) -> 5 
  C_E (C_D _) -> 6 
  C_E (C_E (C_C _ _)) -> 7 
  C_E (C_E (C_D _)) -> 8 
  C_E (C_E (C_E _)) -> 9 
  C_E (C_F ((_,_))) -> 10 
  C_F ((12,_)) -> 11 
  C_F ((_,_)) -> 12 
