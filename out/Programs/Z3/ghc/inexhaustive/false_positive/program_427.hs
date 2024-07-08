module Program_13 () where 

main = print $ show v_b
data B_B b c = C_D | C_E (B_A b) (B_A b) | C_F
data B_A a = C_A (B_B a a) (B_A a) | C_B (B_A a) (((Char,Char),Int)) | C_C

v_a :: B_B Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_A _ (C_A _ _)) (C_B (C_A _ _) (((_,_),_))) -> 0 
  C_E (C_A _ (C_A _ _)) (C_A (C_D) _) -> 1 
  C_E (C_B (C_B _ _) _) (C_A _ (C_A _ _)) -> 2 
  C_E (C_B (C_C) (((_,_),_))) (C_A (C_D) _) -> 3 
