module Program_26 () where 

 main = print $ show v_b
data B_B = C_E B_B Int | C_F (B_A B_B B_B) Bool
data B_A a b = C_A b Int | C_B | C_C | C_D B_B B_B

v_a :: B_A Bool Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ (C_F (C_D _ _) _) -> 0 
