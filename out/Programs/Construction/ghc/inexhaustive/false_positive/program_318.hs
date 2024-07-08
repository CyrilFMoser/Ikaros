module Program_8 () where 

 main = print $ show v_b
data B_C = C_G (B_B ((Bool,Int))) | C_H ((B_C,B_C)) | C_I
data B_A a = C_A | C_B a
data B_B b = C_C B_C | C_D (B_A b) | C_E B_C Bool | C_F

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ -> 0 
