module Program_9 () where 

 main = print $ show v_b
data B_B = C_F | C_G | C_H B_C (B_D ((Bool,Bool))) | C_I B_C | C_J Bool (B_D B_B)
data B_A a b = C_A B_C b | C_B ((B_B,B_B)) | C_C Bool | C_D (B_A b b) | C_E B_C ((B_C,Int))
data B_C = C_K (B_A ((Bool,Int)) ((Int,Int))) Int | C_L B_C Char | C_M | C_N ((B_C,B_B))
data B_D c = C_O B_C (B_A c B_B) | C_P ((B_C,B_B)) | C_Q (((Int,Bool),Char))

v_a :: B_A B_C B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B _ -> 1 
  C_C _ -> 2 
  C_D _ -> 3 
