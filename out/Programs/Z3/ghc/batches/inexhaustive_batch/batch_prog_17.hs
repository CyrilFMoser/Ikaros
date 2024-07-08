module Program_17 () where 

main = print $ show v_b
data B_A a = C_A B_B | C_B B_B | C_C
data B_B = C_D ((B_B,B_B)) | C_E | C_F ((B_B,Char)) | C_G Int

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
  C_A (C_F _) -> 1 
  C_A (C_D ((C_G _,C_E))) -> 2 
  C_A (C_F ((C_G _,_))) -> 3 
  C_A (C_F ((C_F _,_))) -> 4 
  C_A (C_D ((C_G _,C_G _))) -> 5 
  C_A (C_D ((C_E,C_F _))) -> 6 
  C_A _ -> 7 
  C_A (C_D ((C_E,C_E))) -> 8 
  C_A (C_F ((C_D _,_))) -> 9 
  C_A (C_D ((C_D _,C_E))) -> 10 
  C_A (C_F ((C_E,_))) -> 11 
  C_A C_E -> 12 
  C_A (C_D ((C_F _,C_E))) -> 13 
  C_A (C_D ((C_E,C_D _))) -> 14 
  C_B (C_D ((C_D _,C_F _))) -> 15 
  C_B (C_D ((C_E,C_D _))) -> 16 
  C_B (C_D ((C_F _,C_D _))) -> 17 
  C_B (C_D ((C_F _,C_F _))) -> 18 
  C_B (C_F ((C_D _,_))) -> 19 
  C_B C_E -> 20 
  C_B (C_D ((C_F _,C_E))) -> 21 
  C_B (C_D ((C_E,C_E))) -> 22 
