module Program_15 () where 

 main = print $ show v_b
data B_A = C_A (B_B ((Bool,Bool))) (B_D B_A) | C_B
data B_B a = C_C
data B_C b = C_D (B_C b) ((Char,B_A)) | C_E B_A b
data B_D c = C_F c | C_G (B_D c) c | C_H (B_C c) (B_D c) | C_I

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
