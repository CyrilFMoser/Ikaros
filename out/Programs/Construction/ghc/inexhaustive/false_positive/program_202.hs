module Program_18 () where 

 main = print $ show v_b
data B_A = C_A B_A B_A | C_B | C_C (((Char,Int),B_A)) Char | C_D B_A B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B -> 1 
  C_C (((_,_),C_A _ _)) _ -> 2 
  C_C (((_,_),C_C _ _)) _ -> 3 
  C_C (((_,_),C_D _ _)) _ -> 4 
  C_D _ (C_A _ _) -> 5 
  C_D _ C_B -> 6 
  C_D _ (C_C ((_,_)) _) -> 7 
  C_D _ (C_D _ _) -> 8 
