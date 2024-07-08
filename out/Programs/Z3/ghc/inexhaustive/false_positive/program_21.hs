module Program_28 () where 

 main = print $ show v_b
data B_B = C_D | C_E ((B_B,B_B)) | C_F (B_A Bool B_B)
data B_A a b = C_A | C_B B_B | C_C (B_A b b) b

v_a :: B_A Char B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_B _) (C_F (C_A)) -> 0 
