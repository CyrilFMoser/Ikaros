module Program_25 () where 

 main = print $ show v_b
data B_A a b = C_A Bool B_B | C_B Int
data B_B = C_C (B_A B_B B_B) Char | C_D B_B Char | C_E (B_A B_B B_B) (B_A B_B Int) | C_F
data B_C c d = C_G B_B | C_H | C_I B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ _ -> 0 
  C_D (C_C _ _) _ -> 1 
  C_D (C_D _ _) _ -> 2 
  C_D (C_E _ _) _ -> 3 
  C_D C_F _ -> 4 
  C_E _ (C_A True (C_C _ _)) -> 5 
  C_E _ (C_A True (C_D _ _)) -> 6 
  C_E _ (C_A True (C_E _ _)) -> 7 
  C_E _ (C_A True C_F) -> 8 
  C_E _ (C_A False (C_C _ _)) -> 9 
  C_E _ (C_A False (C_D _ _)) -> 10 
  C_E _ (C_A False (C_E _ _)) -> 11 
  C_E _ (C_A False C_F) -> 12 
  C_E _ (C_B 12) -> 13 
  C_F -> 14 
