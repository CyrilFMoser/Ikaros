module Program_14 () where 

 main = print $ show v_b
data B_A = C_A | C_B B_A
data B_B a = C_C a (((Char,Int),Bool)) | C_D B_A | C_E (B_B a) (B_B a) | C_F

v_a :: B_B B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_E (C_F) (C_D _)) (C_C _ _) -> 0 
  C_E (C_E (C_D _) (C_C _ _)) (C_E (C_E _ _) _) -> 1 
  C_E (C_E _ (C_E _ _)) (C_D (C_B _)) -> 2 
  C_E (C_E (C_C _ _) (C_E _ _)) (C_E (C_C _ _) (C_D _)) -> 3 
  C_E (C_C (C_B _) (((_,_),_))) (C_E (C_E _ _) (C_F)) -> 4 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_F) (C_C _ _)) -> 5 
