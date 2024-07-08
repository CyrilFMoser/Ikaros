module Program_3 () where 

 main = print $ show v_b
data B_A a = C_A | C_B Int
data B_B = C_C | C_D ((Bool,B_B)) | C_E B_C Int | C_F (B_A B_C)
data B_C = C_G | C_H | C_I Int | C_J

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G -> 0 
  C_H -> 1 
  C_I _ -> 2 
