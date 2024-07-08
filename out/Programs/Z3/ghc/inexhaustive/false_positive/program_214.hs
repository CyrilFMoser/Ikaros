module Program_29 () where 

 main = print $ show v_b
data B_B a b = C_B B_A B_A | C_C a | C_D (B_B b b) B_A | C_E ((B_A,B_A)) Bool
data B_A = C_A

v_a :: B_B Bool Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_D (C_D _ _) _) C_A -> 0 
  C_D (C_D (C_E _ _) _) C_A -> 1 
  C_D (C_D (C_C _) C_A) _ -> 2 
  C_D (C_D (C_B _ _) _) C_A -> 3 
  C_D (C_B _ _) C_A -> 4 
  C_D (C_E ((C_A,C_A)) _) _ -> 5 
  C_D _ C_A -> 6 
  C_D (C_B C_A C_A) C_A -> 7 
  C_D (C_E _ _) _ -> 8 
  C_D (C_D (C_C _) _) _ -> 9 
  C_D (C_D _ C_A) C_A -> 10 
  C_D (C_B C_A C_A) _ -> 11 
  C_D (C_D (C_B _ _) _) _ -> 12 
  C_D _ _ -> 13 
  C_D (C_D (C_E _ _) _) _ -> 14 
