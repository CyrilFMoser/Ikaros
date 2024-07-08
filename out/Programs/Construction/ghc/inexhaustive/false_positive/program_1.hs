module Program_1 () where 

 main = print $ show v_b
data B_D c d = C_I | C_J c c | C_K (B_A c) | C_L ((B_B,B_B))
data B_A a = C_A a
data B_C b = C_E (B_A b) | C_F Int b | C_G ((B_B,B_B)) b | C_H B_B (B_A ((Int,Bool)))
data B_B = C_B (B_D ((Char,Char)) B_B) (B_A Bool) | C_C | C_D (B_D B_B ((Bool,Int)))

v_a :: B_C Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ -> 0 
  C_F _ _ -> 1 
  C_G _ 12 -> 2 
  C_G _ _ -> 3 
  C_H C_C (C_A _) -> 4 
  C_H (C_D (C_I)) (C_A _) -> 5 
  C_H (C_D (C_J _ _)) (C_A _) -> 6 
  C_H (C_D (C_K _)) (C_A _) -> 7 
  C_H (C_D (C_L _)) (C_A _) -> 8 
