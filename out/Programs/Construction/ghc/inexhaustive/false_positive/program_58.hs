module Program_4 () where 

 main = print $ show v_b
data B_C = C_G Bool B_A
data B_B = C_B B_C B_C | C_C | C_D ((B_A,B_A)) | C_E Int | C_F
data B_A = C_A B_C

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
  C_C -> 1 
  C_D _ -> 2 
  C_F -> 3 
