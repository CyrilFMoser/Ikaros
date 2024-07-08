module Program_3 () where 

 main = print $ show v_b
data B_B = C_B B_B (B_A B_B B_B) | C_C
data B_A a b = C_A ((B_B,B_B))

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_B _ _) _ -> 0 
  C_B C_C _ -> 1 
  C_C -> 2 
