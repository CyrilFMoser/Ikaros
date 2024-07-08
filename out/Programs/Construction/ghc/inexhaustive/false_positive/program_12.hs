module Program_2 () where 

 main = print $ show v_b
data B_A a b = C_A a | C_B ((Bool,B_C)) Int | C_C ((B_C,Bool)) | C_D b a | C_E
data B_B = C_F Bool ((B_B,B_B)) | C_G B_B Bool | C_H B_C (((Bool,Int),B_C)) | C_I | C_J B_B
data B_C = C_K Int

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
  C_C ((C_K _,True)) -> 1 
  C_C ((C_K _,False)) -> 2 
  C_D _ _ -> 3 
  C_E -> 4 
