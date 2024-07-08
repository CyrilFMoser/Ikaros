module Program_11 () where 

 main = print $ show v_b
data B_A a = C_A (B_D a) | C_B (B_A a) Char | C_C ((B_C,B_C)) | C_D | C_E
data B_C = C_G Int | C_H | C_I | C_J
data B_B = C_F
data B_D b = C_K b (B_A b) | C_L B_B | C_M (B_D b) | C_N | C_O B_C

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G _ -> 0 
  C_I -> 1 
  C_J -> 2 
