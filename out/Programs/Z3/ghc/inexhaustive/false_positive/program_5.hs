module Program_13 () where 

 main = print $ show v_b
data B_A = C_A
data B_B a b = C_B (((Char,Char),B_A)) | C_C B_A | C_D (B_B a b) b | C_E a B_A

v_a :: B_B B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ -> 0 
  C_E C_A C_A -> 1 
  C_E C_A _ -> 2 
  C_E _ C_A -> 3 
  C_E _ _ -> 4 
  C_D (C_D _ _) _ -> 5 
  C_D _ _ -> 6 
