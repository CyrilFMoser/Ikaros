module Program_10 () where 

 main = print $ show v_b
data B_B c = C_B c (B_A c c) | C_C c | C_D | C_E c
data B_A a b = C_A

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ -> 0 
  C_D -> 1 
  C_E 12 -> 2 
  C_E _ -> 3 
