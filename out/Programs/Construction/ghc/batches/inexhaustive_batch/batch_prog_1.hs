module Program_1 () where 

 main = print $ show v_b
data B_A = C_A | C_B B_A ((B_A,B_A))

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B C_A _ -> 1 
  C_B (C_B C_A _) _ -> 2 
