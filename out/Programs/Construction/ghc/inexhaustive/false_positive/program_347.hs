module Program_5 () where 

 main = print $ show v_b
data B_A a b = C_A a
data B_C c = C_E c B_B | C_F (B_C c) ((B_B,B_B)) | C_G (B_C c) | C_H
data B_B = C_B (B_C B_B) | C_C Int | C_D (B_A B_B ((Char,Int)))

v_a :: B_C Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ (C_B _) -> 0 
  C_E _ (C_C _) -> 1 
  C_E _ (C_D (C_A _)) -> 2 
  C_F _ ((C_B _,C_B _)) -> 3 
  C_F _ ((C_B _,C_C _)) -> 4 
  C_F _ ((C_B _,C_D _)) -> 5 
  C_F _ ((C_C _,C_B _)) -> 6 
  C_F _ ((C_C _,C_C _)) -> 7 
  C_F _ ((C_D _,C_B _)) -> 8 
  C_F _ ((C_D _,C_C _)) -> 9 
  C_F _ ((C_D _,C_D _)) -> 10 
  C_G (C_E _ (C_B _)) -> 11 
  C_G (C_E _ (C_C _)) -> 12 
  C_G (C_E _ (C_D _)) -> 13 
  C_G (C_F _ _) -> 14 
  C_G (C_G (C_E _ _)) -> 15 
  C_G (C_G (C_F _ _)) -> 16 
  C_G (C_G (C_G _)) -> 17 
  C_G (C_G (C_H)) -> 18 
  C_G (C_H) -> 19 
  C_H -> 20 
