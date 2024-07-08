module Program_21 () where 

 main = print $ show v_b
data B_A a = C_A ((Char,Bool)) | C_B (B_A a) Int | C_C ((Bool,Char)) a | C_D (B_A a) | C_E

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B _ 12 -> 1 
  C_B _ _ -> 2 
  C_D (C_A ((_,_))) -> 3 
  C_D (C_B _ _) -> 4 
  C_D (C_C _ _) -> 5 
  C_D (C_D (C_A _)) -> 6 
  C_D (C_D (C_B _ _)) -> 7 
  C_D (C_D (C_C _ _)) -> 8 
  C_D (C_D (C_D _)) -> 9 
  C_D (C_D (C_E)) -> 10 
  C_D (C_E) -> 11 
  C_E -> 12 
