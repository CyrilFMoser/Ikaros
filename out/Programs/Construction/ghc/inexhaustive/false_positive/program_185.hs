module Program_31 () where 

 main = print $ show v_b
data B_D b = C_P B_C | C_Q B_C b | C_R | C_S b | C_T (B_D b) b
data B_B = C_F ((B_C,B_B)) Char | C_G B_C (B_D B_B) | C_H | C_I (B_D B_B) B_C | C_J ((Char,(Int,Int))) (B_A Char)
data B_A a = C_A Int a | C_B (B_A a) | C_C a | C_D | C_E
data B_C = C_K | C_L (((Bool,Int),(Int,Int))) | C_M | C_N | C_O ((B_B,B_C)) (B_D Int)

v_a :: B_D B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_P _ -> 0 
  C_Q C_K _ -> 1 
  C_Q (C_L _) _ -> 2 
  C_Q C_M _ -> 3 
  C_Q C_N _ -> 4 
  C_Q (C_O ((_,_)) (C_P _)) _ -> 5 
  C_Q (C_O ((_,_)) (C_Q _ _)) _ -> 6 
  C_Q (C_O ((_,_)) (C_R)) _ -> 7 
  C_Q (C_O ((_,_)) (C_S _)) _ -> 8 
  C_Q (C_O ((_,_)) (C_T _ _)) _ -> 9 
  C_R -> 10 
  C_S C_K -> 11 
  C_S (C_L _) -> 12 
  C_S C_M -> 13 
  C_S C_N -> 14 
  C_S (C_O _ _) -> 15 
  C_T (C_P C_K) _ -> 16 
  C_T (C_P (C_L _)) _ -> 17 
  C_T (C_P C_M) _ -> 18 
  C_T (C_P C_N) _ -> 19 
  C_T (C_P (C_O _ _)) _ -> 20 
  C_T (C_Q C_K _) _ -> 21 
  C_T (C_Q (C_L _) _) _ -> 22 
  C_T (C_Q C_M _) _ -> 23 
  C_T (C_Q C_N _) _ -> 24 
  C_T (C_Q (C_O _ _) _) _ -> 25 
  C_T (C_R) _ -> 26 
  C_T (C_S C_K) _ -> 27 
  C_T (C_S (C_L _)) _ -> 28 
  C_T (C_S C_M) _ -> 29 
  C_T (C_S C_N) _ -> 30 
  C_T (C_S (C_O _ _)) _ -> 31 
