module Program_8 () where 

 main = print $ show v_b
data B_C b c = C_E B_B (B_C b c) | C_F B_D | C_G (B_C c c) | C_H B_D B_D
data B_B = C_B | C_C | C_D ((B_D,B_D)) B_B
data B_A a = C_A
data B_D = C_I Char | C_J (B_C Bool ((Char,Bool))) (B_A B_D) | C_K ((B_D,B_D)) B_B | C_L B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_C -> 1 
  C_D ((C_I _,C_I _)) _ -> 2 
  C_D ((C_I _,C_J _ _)) _ -> 3 
  C_D ((C_I _,C_K _ _)) _ -> 4 
  C_D ((C_I _,C_L _)) _ -> 5 
  C_D ((C_J _ _,C_I _)) _ -> 6 
  C_D ((C_J _ _,C_J _ _)) _ -> 7 
  C_D ((C_J _ _,C_K _ _)) _ -> 8 
  C_D ((C_K _ _,C_I _)) _ -> 9 
  C_D ((C_K _ _,C_J _ _)) _ -> 10 
  C_D ((C_K _ _,C_K _ _)) _ -> 11 
  C_D ((C_K _ _,C_L _)) _ -> 12 
  C_D ((C_L _,C_I _)) _ -> 13 
  C_D ((C_L _,C_J _ _)) _ -> 14 
  C_D ((C_L _,C_K _ _)) _ -> 15 
  C_D ((C_L _,C_L _)) _ -> 16 
