module Program_30 () where 

 main = print $ show v_b
data B_A = C_A
data B_B a = C_B | C_C B_A | C_D Char (B_B a) | C_E (B_B a) a | C_F B_A

v_a :: B_B Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_D _ _ -> 1 
  C_E (C_B) _ -> 2 
  C_E (C_C _) _ -> 3 
  C_E (C_D _ _) _ -> 4 
  C_E (C_E (C_B) _) _ -> 5 
  C_E (C_E (C_C _) _) _ -> 6 
  C_E (C_E (C_D _ _) _) _ -> 7 
  C_E (C_E (C_E _ _) _) _ -> 8 
  C_E (C_E (C_F _) _) _ -> 9 
  C_E (C_F _) _ -> 10 
  C_F _ -> 11 
