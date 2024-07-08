module Program_24 () where 

 main = print $ show v_b
data B_B = C_E B_B Int | C_F (B_A B_B B_B) Bool
data B_A a b = C_A b Int | C_B | C_C | C_D B_B B_B

v_a :: B_A Bool Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
  C_D (C_E (C_E _ _) _) (C_E (C_E _ _) _) -> 1 
  C_D _ (C_E (C_F _ _) _) -> 2 
  C_D (C_E (C_F _ _) _) (C_F (C_C) _) -> 3 
  C_D (C_E _ _) (C_E _ _) -> 4 
  C_D (C_F (C_C) _) (C_F (C_B) _) -> 5 
  C_D (C_F (C_C) _) (C_F (C_A _ _) _) -> 6 
  C_D (C_F (C_B) _) (C_F (C_C) _) -> 7 
