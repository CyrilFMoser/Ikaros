module Program_24 () where 

 main = print $ show v_b
data B_A a = C_A (B_A Char) | C_B | C_C | C_D (B_A a)

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A (C_C)) -> 0 
