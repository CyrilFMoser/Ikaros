module Program_7 () where 

main = print $ show v_b
data B_A a b = C_A (B_A b b) b (B_A Bool b) | C_B | C_C

v_a :: C_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
