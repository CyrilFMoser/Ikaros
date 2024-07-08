module Program_0 () where 

 main = print $ show v_b
data B_B b c = C_B Int | C_C Bool | C_D | C_E (B_B c c)
data B_C d e = C_F | C_G (B_A d) (B_A d) | C_H | C_I (B_C d d) (B_B Int d) | C_J
data B_A a = C_A Bool

v_a :: B_C Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
  C_G _ _ -> 1 
  C_H -> 2 
  C_I (C_F) _ -> 3 
  C_I (C_G _ _) _ -> 4 
  C_I (C_H) _ -> 5 
  C_I (C_I (C_F) (C_B _)) _ -> 6 
  C_I (C_I (C_F) (C_C _)) _ -> 7 
  C_I (C_I (C_F) (C_D)) _ -> 8 
  C_I (C_I (C_F) (C_E _)) _ -> 9 
  C_I (C_I (C_G _ _) (C_B _)) _ -> 10 
  C_I (C_I (C_G _ _) (C_C _)) _ -> 11 
  C_I (C_I (C_G _ _) (C_D)) _ -> 12 
  C_I (C_I (C_G _ _) (C_E _)) _ -> 13 
  C_I (C_I (C_H) (C_C _)) _ -> 14 
  C_I (C_I (C_H) (C_D)) _ -> 15 
  C_I (C_I (C_H) (C_E _)) _ -> 16 
  C_I (C_I (C_I _ _) (C_B _)) _ -> 17 
  C_I (C_I (C_I _ _) (C_C _)) _ -> 18 
  C_I (C_I (C_I _ _) (C_D)) _ -> 19 
  C_I (C_I (C_I _ _) (C_E _)) _ -> 20 
  C_I (C_I (C_J) (C_B _)) _ -> 21 
  C_I (C_I (C_J) (C_C _)) _ -> 22 
  C_I (C_I (C_J) (C_D)) _ -> 23 
  C_I (C_I (C_J) (C_E _)) _ -> 24 
  C_I (C_J) _ -> 25 
  C_J -> 26 
