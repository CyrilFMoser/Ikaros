module Program_0 () where 

 main = print $ show v_b
data B_B c = C_D | C_E c | C_F (B_A c c)
data B_A a b = C_A | C_B (B_B a) | C_C

v_a :: B_A Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B (C_F (C_A)) -> 1 
  C_B (C_E _) -> 2 
