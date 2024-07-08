module Program_29 () where 

 main = print $ show v_b
data B_B = C_E (((Char,Char),(Int,Char))) | C_F B_B | C_G B_B B_A | C_H B_B ((B_A,(Int,Char)))
data B_A = C_A ((B_A,B_A)) | C_B Char | C_C B_B | C_D (((Int,Bool),B_B))

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ -> 0 
  C_F (C_E ((_,_))) -> 1 
  C_F (C_F _) -> 2 
  C_F (C_G _ _) -> 3 
  C_F (C_H _ _) -> 4 
  C_G _ _ -> 5 
  C_H (C_E _) _ -> 6 
  C_H (C_F _) _ -> 7 
  C_H (C_G (C_E _) (C_A _)) _ -> 8 
  C_H (C_G (C_F _) (C_A _)) _ -> 9 
  C_H (C_G (C_G _ _) (C_A _)) _ -> 10 
  C_H (C_G (C_H _ _) (C_A _)) _ -> 11 
  C_H (C_G (C_E _) (C_B _)) _ -> 12 
  C_H (C_G (C_F _) (C_B _)) _ -> 13 
  C_H (C_G (C_G _ _) (C_B _)) _ -> 14 
  C_H (C_G (C_E _) (C_C _)) _ -> 15 
  C_H (C_G (C_F _) (C_C _)) _ -> 16 
  C_H (C_G (C_G _ _) (C_C _)) _ -> 17 
  C_H (C_G (C_H _ _) (C_C _)) _ -> 18 
  C_H (C_G (C_E _) (C_D _)) _ -> 19 
  C_H (C_G (C_F _) (C_D _)) _ -> 20 
  C_H (C_G (C_G _ _) (C_D _)) _ -> 21 
  C_H (C_G (C_H _ _) (C_D _)) _ -> 22 
  C_H (C_H _ _) _ -> 23 
