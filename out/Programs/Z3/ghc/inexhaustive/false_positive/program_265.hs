module Program_17 () where 

 main = print $ show v_b
data B_B a = C_C a (((Char,Int),Bool)) | C_D B_A | C_E (B_B a) (B_B a) | C_F
data B_A = C_A | C_B B_A

v_a :: B_B B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_C C_A (((_,_),_))) _ -> 0 
  C_E (C_E (C_F) (C_F)) (C_E (C_D _) _) -> 1 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_E (C_D _) (C_D _)) -> 2 
  C_E (C_E (C_C _ _) (C_C _ _)) (C_E _ (C_E _ _)) -> 3 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_C (C_B _) (((_,_),_))) -> 4 
  C_E (C_E (C_D _) (C_E _ _)) (C_E (C_E _ _) (C_E _ _)) -> 5 
  C_E (C_E (C_D _) (C_F)) (C_E (C_D _) _) -> 6 
  C_E (C_E _ (C_F)) (C_E (C_F) (C_E _ _)) -> 7 
  C_E (C_E (C_C _ _) (C_D _)) (C_E _ (C_F)) -> 8 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_E _ (C_D _)) -> 9 
  C_E (C_E (C_E _ _) (C_F)) (C_C (C_B _) _) -> 10 
  C_E (C_E (C_C _ _) _) (C_C (C_B _) (((_,_),_))) -> 11 
