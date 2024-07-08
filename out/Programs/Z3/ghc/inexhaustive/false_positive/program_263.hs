module Program_15 () where 

 main = print $ show v_b
data B_A = C_A | C_B B_A
data B_B a = C_C a (((Char,Int),Bool)) | C_D B_A | C_E (B_B a) (B_B a) | C_F

v_a :: B_B B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_E _ (C_E _ _)) (C_E _ (C_F)) -> 0 
  C_E (C_D C_A) (C_E (C_E _ _) (C_F)) -> 1 
  C_E (C_E (C_D _) _) (C_E (C_E _ _) (C_F)) -> 2 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_E _ _) (C_C _ _)) -> 3 
  C_E (C_E _ (C_D _)) (C_E (C_F) (C_C _ _)) -> 4 
  C_E (C_C _ _) (C_E (C_C _ _) (C_C _ _)) -> 5 
  C_E (C_E (C_C _ _) (C_E _ _)) _ -> 6 
  C_E (C_E _ _) (C_E (C_F) (C_C _ _)) -> 7 
  C_E (C_E (C_D _) (C_C _ _)) (C_E _ (C_F)) -> 8 
  C_E (C_E (C_D _) (C_E _ _)) (C_D (C_B _)) -> 9 
  C_E _ (C_D _) -> 10 
  C_E (C_C _ _) (C_E _ _) -> 11 
  C_E (C_E _ _) (C_E (C_C _ _) _) -> 12 
  C_E (C_E (C_E _ _) (C_F)) (C_C C_A _) -> 13 
  C_E (C_E (C_E _ _) (C_F)) (C_E (C_D _) (C_D _)) -> 14 
  C_E (C_E (C_F) (C_F)) (C_C _ _) -> 15 
  C_E (C_C _ _) (C_E (C_D _) (C_F)) -> 16 
  C_E (C_E _ (C_E _ _)) (C_E (C_E _ _) (C_C _ _)) -> 17 
  C_E (C_E (C_E _ _) (C_F)) (C_E _ (C_E _ _)) -> 18 
  C_E (C_C C_A _) (C_E (C_D _) _) -> 19 
  C_E (C_E (C_C _ _) (C_D _)) (C_E (C_D _) (C_D _)) -> 20 
  C_E _ (C_E (C_E _ _) (C_E _ _)) -> 21 
