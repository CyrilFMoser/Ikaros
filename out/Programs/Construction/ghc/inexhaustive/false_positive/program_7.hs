module Program_15 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (B_A a a) | C_C | C_D (B_A a a) | C_E (B_A a b) a

v_a :: B_A Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B _ -> 1 
  C_C -> 2 
  C_D _ -> 3 
  C_E (C_A) _ -> 4 
  C_E (C_B (C_A)) _ -> 5 
  C_E (C_B (C_B _)) _ -> 6 
  C_E (C_B (C_D _)) _ -> 7 
  C_E (C_B (C_E _ _)) _ -> 8 
  C_E (C_C) _ -> 9 
  C_E (C_D _) _ -> 10 
  C_E (C_E _ _) _ -> 11 
