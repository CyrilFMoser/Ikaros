module Program_23 () where 

 main = print $ show v_b
data B_A a = C_A Int | C_B

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 