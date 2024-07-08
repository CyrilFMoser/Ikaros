module Program_11 () where 

 main = print $ show v_b
data B_C = C_G (B_B Char B_C) | C_H
data B_A a b = C_A B_C (B_B a b)
data B_B c d = C_B | C_C Bool | C_D ((B_C,B_C)) | C_E | C_F d

v_a :: B_B B_C B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_C _ -> 1 
  C_D ((C_G _,C_G _)) -> 2 
  C_D ((C_G _,C_H)) -> 3 
  C_D ((C_H,C_G _)) -> 4 
  C_D ((C_H,C_H)) -> 5 
  C_F _ -> 6 
