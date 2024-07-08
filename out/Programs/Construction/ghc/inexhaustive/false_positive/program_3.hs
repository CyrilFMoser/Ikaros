module Program_11 () where 

 main = print $ show v_b
data B_B = C_B ((Char,Bool)) | C_C
data B_C b = C_D | C_E | C_F (B_A b) b | C_G (B_C b)
data B_A a = C_A
data B_D c d = C_H (B_C d) (B_A c) | C_I

v_a :: B_C Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E -> 0 
  C_F (C_A) True -> 1 
  C_F (C_A) False -> 2 
  C_G _ -> 3 
