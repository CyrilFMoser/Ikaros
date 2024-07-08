module Program_4 () where 

 main = print $ show v_b
data B_B c d = C_D Char
data B_A a b = C_A (B_B a a) | C_B | C_C (B_B a b)

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ -> 0 
