module Program_18 () where 

main = print $ show v_b
data B_B = C_D ((B_B,B_B)) | C_E | C_F ((B_B,Char)) | C_G Int
data B_A a = C_A B_B | C_B B_B | C_C

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_D ((C_G _,C_F _))) -> 0 
  C_A (C_D ((C_G _,C_D _))) -> 1 
  C_A (C_D ((C_D _,C_F _))) -> 2 
  C_A (C_D ((C_F _,C_G _))) -> 3 
  C_A (C_D ((C_D _,C_G _))) -> 4 
  C_B (C_D ((C_E,C_F _))) -> 5 
  C_B (C_D ((C_D _,C_G _))) -> 6 
  C_B (C_D ((C_E,C_G _))) -> 7 
  C_B _ -> 8 
  C_B (C_D ((C_G _,C_F _))) -> 9 
  C_B (C_D ((C_G _,C_D _))) -> 10 
  C_B (C_D ((C_G _,C_E))) -> 11 
  C_B (C_D ((C_G _,C_G _))) -> 12 
  C_B (C_D ((C_D _,C_D _))) -> 13 
  C_B (C_D ((C_F _,C_G _))) -> 14 
