module Program_29 () where 

 main = print $ show v_b
data B_B b = C_C (B_A b) b | C_D (B_A b) B_D | C_E (B_A b) | C_F (B_B b)
data B_C c = C_G
data B_D = C_H ((B_D,(Char,Int))) | C_I ((B_D,B_D)) (B_A B_D)
data B_A a = C_A | C_B (B_B a)

v_a :: B_B Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ _ -> 0 
  C_D (C_A) (C_H ((_,_))) -> 1 
  C_D (C_B _) (C_H ((_,_))) -> 2 
  C_D (C_A) (C_I ((_,_)) (C_A)) -> 3 
  C_D (C_B _) (C_I ((_,_)) (C_A)) -> 4 
  C_D (C_A) (C_I ((_,_)) (C_B _)) -> 5 
  C_D (C_B _) (C_I ((_,_)) (C_B _)) -> 6 
  C_E _ -> 7 
  C_F (C_C (C_A) _) -> 8 
  C_F (C_D (C_A) _) -> 9 
  C_F (C_D (C_B _) _) -> 10 
  C_F (C_E (C_A)) -> 11 
  C_F (C_E (C_B _)) -> 12 
  C_F (C_F _) -> 13 
