module Program_20 () where 

 main = print $ show v_b
data B_B = C_D Int | C_E (B_C B_B)
data B_A = C_A B_A B_B | C_B B_B ((B_B,B_A)) | C_C
data B_C a = C_F

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ -> 0 
