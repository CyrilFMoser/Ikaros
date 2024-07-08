module Program_19 () where 

main = print $ show v_b
data B_A a = C_A B_B | C_B B_B | C_C
data B_B = C_D ((B_B,B_B)) | C_E | C_F ((B_B,Char)) | C_G Int

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_F ((C_E,_))) -> 0 
