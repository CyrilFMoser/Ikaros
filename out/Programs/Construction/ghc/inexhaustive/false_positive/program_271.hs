module Program_22 () where 

 main = print $ show v_b
data B_B = C_F ((Char,Int)) B_B
data B_A a = C_A ((B_B,B_B)) | C_B | C_C B_B | C_D | C_E ((B_B,B_B)) B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ _ -> 0 
