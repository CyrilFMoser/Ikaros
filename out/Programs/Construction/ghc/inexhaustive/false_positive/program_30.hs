module Program_8 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A a a) | C_B

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A (C_B)) -> 0 
  C_A (C_B) -> 1 
  C_B -> 2 
