module Program_12 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B

v_a :: B_A Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B -> 1 
