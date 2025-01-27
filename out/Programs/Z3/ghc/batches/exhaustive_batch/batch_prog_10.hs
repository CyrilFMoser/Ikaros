module Program_10 () where 

main = print $ show v_b
data B_A a b = C_A a
data B_B = C_B (B_A B_B B_B)

v_a :: B_A B_B B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
