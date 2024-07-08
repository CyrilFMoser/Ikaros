module Program_8 () where 

 main = print $ show v_b
data B_A a b = C_A (B_B a) Int | C_B | C_C | C_D
data B_B c = C_E (B_A Bool c) | C_F

v_a :: B_A Bool Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
  C_D -> 1 
  C_A (C_E (C_A _ _)) _ -> 2 
  C_A (C_F) _ -> 3 
  C_A (C_E _) _ -> 4 
  C_A (C_E (C_D)) _ -> 5 
