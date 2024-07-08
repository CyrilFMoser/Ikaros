module Program_1 () where 

 main = print $ show v_b
data B_D d = C_J ((B_C,B_C)) B_C | C_K ((Char,(Int,Char))) | C_L B_C (B_D d) | C_M (B_A d d) d | C_N (B_B d) (B_A d d)
data B_B c = C_E | C_F ((B_C,B_C)) (B_B c)
data B_C = C_G B_C | C_H (B_A ((Bool,Int)) B_C) ((B_C,Int)) | C_I
data B_A a b = C_A (B_B b) | C_B a (B_B b) | C_C b | C_D

v_a :: B_A Int B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
  C_C _ -> 1 
  C_D -> 2 
