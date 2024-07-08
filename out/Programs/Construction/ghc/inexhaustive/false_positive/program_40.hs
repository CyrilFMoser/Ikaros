module Program_16 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A a b) | C_B

v_a :: B_A Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
