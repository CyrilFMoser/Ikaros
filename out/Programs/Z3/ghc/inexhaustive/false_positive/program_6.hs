module Program_14 () where 

 main = print $ show v_b
data B_A = C_A
data B_B a b = C_B (((Char,Char),B_A)) | C_C B_A | C_D (B_B a b) b | C_E a B_A

v_a :: B_B B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_B _) _ -> 0 
  C_D (C_D (C_B _) _) _ -> 1 
  C_D (C_E _ _) _ -> 2 
  C_D (C_C C_A) _ -> 3 
  C_D (C_D (C_D _ _) _) _ -> 4 
  C_D (C_D (C_C _) _) _ -> 5 
  C_D (C_C _) _ -> 6 
  C_D (C_B (((_,_),C_A))) _ -> 7 
