module Program_22 () where 

 main = print $ show v_b
data B_A = C_A (B_C B_A) (((Int,Bool),(Char,Char))) | C_B B_A (B_D B_A) | C_C (B_C B_A)
data B_D d = C_L (B_C d) | C_M d | C_N (B_C d) (B_C d)
data B_B a b = C_D | C_E | C_F Bool
data B_C c = C_G ((B_A,B_A)) | C_H c c | C_I ((B_A,B_A)) | C_J | C_K

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B _ _ -> 1 
  C_C (C_G _) -> 2 
  C_C (C_H (C_A _ _) (C_A _ _)) -> 3 
  C_C (C_H (C_B _ _) (C_A _ _)) -> 4 
  C_C (C_H (C_C _) (C_A _ _)) -> 5 
  C_C (C_H (C_A _ _) (C_B _ _)) -> 6 
  C_C (C_H (C_B _ _) (C_B _ _)) -> 7 
  C_C (C_H (C_C _) (C_B _ _)) -> 8 
  C_C (C_H (C_A _ _) (C_C _)) -> 9 
  C_C (C_H (C_C _) (C_C _)) -> 10 
  C_C (C_I _) -> 11 
  C_C (C_J) -> 12 
  C_C (C_K) -> 13 
