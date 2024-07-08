module Program_22 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) (B_A a) | C_B

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A _ _) (C_A _ _) -> 0 
  C_A (C_A _ _) (C_B) -> 1 
  C_A (C_B) (C_A _ _) -> 2 
  C_A (C_B) (C_B) -> 3 
  C_B -> 4 
