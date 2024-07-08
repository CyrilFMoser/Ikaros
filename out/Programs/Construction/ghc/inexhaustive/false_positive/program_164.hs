module Program_12 () where 

 main = print $ show v_b
data B_B = C_E (B_A ((Bool,Int)) Bool) Char | C_F | C_G (B_A ((Char,Bool)) ((Bool,Bool))) (B_A B_B B_B)
data B_A a b = C_A (((Char,Bool),B_B)) ((B_B,B_C)) | C_B | C_C | C_D B_C
data B_D c = C_M (B_D ((Bool,Int))) (B_A c c) | C_N (B_D c) | C_O Bool Int | C_P c ((B_C,B_C)) | C_Q c
data B_C = C_H | C_I B_B B_C | C_J | C_K (B_A B_B B_B) Bool | C_L (B_A B_C ((Int,Char)))

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ _ -> 0 
  C_F -> 1 
  C_G _ (C_A _ _) -> 2 
  C_G _ (C_B) -> 3 
  C_G _ (C_C) -> 4 
  C_G _ (C_D (C_I _ _)) -> 5 
  C_G _ (C_D C_J) -> 6 
  C_G _ (C_D (C_K _ _)) -> 7 
  C_G _ (C_D (C_L _)) -> 8 
