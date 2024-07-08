module Program_5 () where 

 main = print $ show v_b
data B_A a = C_A Int | C_B B_B | C_C | C_D a
data B_B = C_E ((B_B,B_B)) | C_F ((B_B,B_B))

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_C -> 1 
  C_D _ -> 2 
