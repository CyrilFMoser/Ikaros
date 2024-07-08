module Program_17 () where 

main = print $ show v_b
data B_B = C_D
data B_A a b = C_A (B_A a b) Bool | C_B ((B_B,B_B)) B_B | C_C

v_a :: B_A Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A (C_C) _) _ -> 0 
  C_A (C_B ((C_D,C_D)) C_D) _ -> 1 
