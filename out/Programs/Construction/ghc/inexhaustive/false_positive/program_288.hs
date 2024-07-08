module Program_0 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B B_D | C_C (B_A b b) | C_D B_D (B_B a) | C_E b
data B_B c = C_F | C_G Int | C_H
data B_D = C_L ((B_C,Int)) | C_M B_C
data B_C = C_I | C_J ((B_D,B_C)) Bool | C_K

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_I -> 0 
  C_J ((C_L _,C_J _ _)) _ -> 1 
  C_J ((C_L _,C_K)) _ -> 2 
  C_J ((C_M _,C_I)) _ -> 3 
  C_J ((C_M _,C_J _ _)) _ -> 4 
  C_J ((C_M _,C_K)) _ -> 5 
  C_K -> 6 
