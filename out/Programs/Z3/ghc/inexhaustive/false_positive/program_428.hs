module Program_14 () where 

main = print $ show v_b
data B_A a = C_A (B_B a a) (B_A a) | C_B (B_A a) (((Char,Char),Int)) | C_C
data B_B b c = C_D | C_E (B_A b) (B_A b) | C_F

v_a :: B_B Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_B (C_C) (((_,_),_))) (C_B (C_C) (((_,_),_))) -> 0 
  C_E (C_A _ (C_C)) (C_A (C_E _ _) _) -> 1 
  C_E (C_A (C_F) (C_B _ _)) (C_B (C_C) _) -> 2 
  C_E (C_A _ (C_B _ _)) (C_B (C_A _ _) _) -> 3 
