module Program_2 () where 

main = print $ show v_b
data B_A a b = C_A | C_B (B_A b b)

v_a :: B_A Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_B (C_B _)) -> 0 
