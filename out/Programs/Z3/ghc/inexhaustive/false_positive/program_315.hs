module Program_5 () where 

 main = print $ show v_b
data B_A = C_A ((B_B,Char)) B_A | C_B B_B
data B_B = C_C | C_D B_A | C_E B_B Char | C_F B_A

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_E (C_E _ _) _) _ -> 0 
  C_E (C_E C_C _) _ -> 1 
  C_E _ _ -> 2 
  C_F (C_A ((C_E _ _,_)) (C_A _ _)) -> 3 
  C_D (C_A _ (C_A _ _)) -> 4 
  C_D (C_A ((C_C,_)) (C_A _ _)) -> 5 
  C_D (C_A _ _) -> 6 
  C_D (C_B (C_F _)) -> 7 
