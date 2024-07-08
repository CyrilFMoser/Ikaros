module Program_20 () where 

main = print $ show v_b
data B_A a = C_A B_B | C_B B_B | C_C
data B_B = C_D ((B_B,B_B)) | C_E | C_F ((B_B,Char)) | C_G Int

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_D ((C_D _,C_D _))) -> 0 
  C_A (C_D ((C_E,C_G _))) -> 1 
  C_A (C_G _) -> 2 
  C_A (C_D _) -> 3 
  C_A (C_D ((C_F _,C_D _))) -> 4 
  C_A (C_D ((C_F _,C_F _))) -> 5 
  C_B (C_G _) -> 6 
