module Program_2 () where 

main = print $ show v_b
data B_A a b = C_A (B_B b b)
data B_B c d = C_B (B_B Int d) c

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
