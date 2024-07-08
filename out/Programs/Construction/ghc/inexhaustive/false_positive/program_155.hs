module Program_5 () where 

 main = print $ show v_b
data B_C c d = C_F d | C_G (B_B c d) | C_H Bool (B_D d) | C_I
data B_A = C_A (B_C B_A B_A) (B_B Char B_A) | C_B (B_C ((Bool,Int)) ((Char,Int))) | C_C B_A | C_D (B_B B_A B_A)
data B_B a b = C_E
data B_D e = C_J e | C_K (B_B e e) (B_B e e)

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B (C_F ((_,_))) -> 1 
  C_B (C_G (C_E)) -> 2 
  C_B (C_H _ (C_J _)) -> 3 
  C_B (C_I) -> 4 
  C_C _ -> 5 
  C_D (C_E) -> 6 
