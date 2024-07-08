module Program_27 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A a a) Bool | C_B | C_C (B_A a a) a | C_D b (B_A b b) | C_E

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B -> 1 
  C_D _ _ -> 2 
  C_E -> 3 
