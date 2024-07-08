module Program_7 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (((Bool,Int),Bool)) | C_C (B_A b b) (B_A b b) | C_D

v_a :: B_A Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_B _) (C_C (C_B _) _) -> 0 
  C_C (C_C (C_A) _) (C_C (C_B _) (C_A)) -> 1 
  C_C (C_D) (C_C (C_D) (C_A)) -> 2 
  C_C (C_C _ (C_B _)) (C_C (C_D) (C_B _)) -> 3 
  C_C (C_C _ (C_C _ _)) (C_C (C_B _) (C_D)) -> 4 
  C_C (C_C _ (C_A)) (C_C (C_D) (C_B _)) -> 5 
  C_C _ (C_C (C_D) (C_B _)) -> 6 
  C_C (C_C (C_B _) (C_C _ _)) (C_C _ (C_D)) -> 7 
  C_C (C_C (C_D) (C_C _ _)) (C_C (C_C _ _) _) -> 8 
  C_C (C_C (C_C _ _) (C_A)) (C_C (C_D) (C_D)) -> 9 
  C_C (C_C _ (C_B _)) (C_C (C_B _) (C_A)) -> 10 
  C_C (C_C (C_C _ _) _) (C_C _ _) -> 11 
  C_C (C_C (C_B _) (C_B _)) (C_C (C_B _) _) -> 12 
  C_C (C_C (C_B _) _) (C_B (((_,_),_))) -> 13 
  C_C (C_C (C_D) (C_C _ _)) (C_C (C_B _) _) -> 14 
  C_C (C_C (C_B _) (C_D)) (C_C (C_B _) _) -> 15 
  C_C (C_C (C_D) (C_C _ _)) (C_C (C_B _) (C_C _ _)) -> 16 
  C_C (C_B _) (C_C (C_A) (C_A)) -> 17 
  C_C (C_C _ (C_C _ _)) (C_C (C_A) (C_D)) -> 18 
  C_C (C_C (C_D) (C_A)) (C_C (C_B _) (C_C _ _)) -> 19 
  C_C (C_C (C_A) (C_A)) (C_C _ (C_C _ _)) -> 20 
  C_C (C_C (C_B _) (C_C _ _)) (C_C (C_D) _) -> 21 
  C_C (C_C (C_B _) (C_C _ _)) (C_C (C_B _) (C_C _ _)) -> 22 
  C_C (C_C (C_D) (C_C _ _)) (C_D) -> 23 
  C_C (C_C (C_C _ _) (C_D)) (C_C (C_A) (C_B _)) -> 24 
  C_C (C_C (C_C _ _) _) (C_C (C_C _ _) (C_C _ _)) -> 25 
  C_C (C_C (C_D) (C_A)) (C_C (C_A) (C_B _)) -> 26 
  C_C (C_C (C_B _) (C_B _)) (C_C _ (C_A)) -> 27 
  C_C (C_D) _ -> 28 
  C_C (C_C (C_C _ _) (C_A)) (C_C (C_B _) (C_A)) -> 29 
  C_C (C_C (C_D) (C_A)) (C_C _ (C_A)) -> 30 
  C_C _ (C_A) -> 31 
  C_C (C_C _ (C_D)) (C_C _ (C_A)) -> 32 
  C_C (C_C (C_A) _) (C_C (C_A) (C_A)) -> 33 
  C_C (C_C (C_D) (C_B _)) (C_C (C_C _ _) (C_B _)) -> 34 
  C_C (C_C _ (C_D)) (C_C (C_D) _) -> 35 
  C_C (C_C (C_D) _) (C_A) -> 36 
  C_C (C_C (C_B _) _) (C_C _ (C_A)) -> 37 
  C_C _ (C_C (C_D) (C_C _ _)) -> 38 
  C_C (C_C (C_D) (C_B _)) (C_D) -> 39 
