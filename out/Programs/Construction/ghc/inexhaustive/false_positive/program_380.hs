module Program_6 () where 

 main = print $ show v_b
data B_A = C_A B_A (((Bool,Char),B_B))
data B_B = C_B Int ((Char,B_A)) | C_C | C_D | C_E

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
  C_D -> 1 
  C_E -> 2 
