module Program_23 () where 

 main = print $ show v_b
data B_D d e = C_I Char (B_B d) | C_J ((Char,Bool)) e | C_K (B_B d) | C_L (B_C Bool) ((Int,Char)) | C_M
data B_A a = C_A | C_B | C_C (B_B a) (B_B a)
data B_B b = C_D b | C_E | C_F (B_A b) | C_G (((Bool,Bool),(Bool,Char))) (B_A Int)
data B_C c = C_H

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_C (C_D _) (C_D _) -> 1 
  C_C (C_D _) (C_E) -> 2 
  C_C (C_D _) (C_F (C_A)) -> 3 
  C_C (C_D _) (C_F (C_B)) -> 4 
  C_C (C_D _) (C_F (C_C _ _)) -> 5 
  C_C (C_D _) (C_G _ _) -> 6 
  C_C (C_E) (C_D _) -> 7 
  C_C (C_E) (C_E) -> 8 
  C_C (C_E) (C_F (C_A)) -> 9 
  C_C (C_E) (C_F (C_B)) -> 10 
  C_C (C_E) (C_F (C_C _ _)) -> 11 
  C_C (C_E) (C_G _ _) -> 12 
  C_C (C_F _) (C_D _) -> 13 
  C_C (C_F _) (C_E) -> 14 
  C_C (C_F _) (C_F (C_A)) -> 15 
  C_C (C_F _) (C_F (C_B)) -> 16 
  C_C (C_F _) (C_F (C_C _ _)) -> 17 
  C_C (C_F _) (C_G _ _) -> 18 
  C_C (C_G _ _) (C_D _) -> 19 
  C_C (C_G _ _) (C_E) -> 20 
  C_C (C_G _ _) (C_F (C_A)) -> 21 
  C_C (C_G _ _) (C_F (C_B)) -> 22 
  C_C (C_G _ _) (C_F (C_C _ _)) -> 23 
  C_C (C_G _ _) (C_G _ _) -> 24 
