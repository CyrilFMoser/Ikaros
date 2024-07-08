module Program_25 () where 

 main = print $ show v_b
data B_A a b = C_A b Int | C_B | C_C | C_D B_B B_B
data B_B = C_E B_B Int | C_F (B_A B_B B_B) Bool

v_a :: B_A Bool Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_F (C_A _ _) _) (C_F (C_C) _) -> 0 
  C_D (C_F (C_B) _) (C_F _ _) -> 1 
  C_D (C_F (C_D _ _) _) (C_F (C_D _ _) _) -> 2 
  C_D _ (C_F _ _) -> 3 
