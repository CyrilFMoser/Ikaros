module Program_2 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A b b) | C_B (B_A Char Char) (B_A a ((Char,Char))) | C_C (((Bool,Int),Int)) (B_A a a)

v_a :: B_A Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (((_,_),_)) (C_A (C_A _)) -> 0 
  C_C (((_,_),_)) (C_C _ (C_A _)) -> 1 
  C_B (C_C (((_,_),_)) (C_B _ _)) (C_A _) -> 2 
  C_B (C_B _ _) (C_B (C_B _ _) (C_B _ _)) -> 3 
  C_B (C_B (C_A _) _) (C_C _ (C_B _ _)) -> 4 
  C_B (C_B _ _) (C_B (C_A _) (C_B _ _)) -> 5 
  C_B (C_B (C_B _ _) (C_C _ _)) (C_A (C_B _ _)) -> 6 
  C_B (C_B _ _) (C_B (C_A _) _) -> 7 
  C_B (C_B _ (C_C _ _)) (C_C _ (C_B _ _)) -> 8 
  C_B (C_B _ (C_A _)) (C_A (C_C _ _)) -> 9 
  C_B (C_B _ (C_C _ _)) (C_B (C_C _ _) (C_A _)) -> 10 
  C_B (C_B _ (C_C _ _)) (C_C (((_,_),_)) (C_B _ _)) -> 11 
  C_B (C_B (C_C _ _) _) (C_B (C_C _ _) (C_B _ _)) -> 12 
  C_B (C_C _ (C_B _ _)) _ -> 13 
  C_B (C_B _ (C_C _ _)) (C_B _ (C_B _ _)) -> 14 
  C_B (C_B (C_C _ _) (C_A _)) (C_C (((_,_),_)) (C_B _ _)) -> 15 
  C_B (C_C (((_,_),_)) (C_C _ _)) (C_A (C_A _)) -> 16 
  C_B (C_A (C_C _ _)) (C_B (C_B _ _) _) -> 17 
  C_B (C_B (C_A _) (C_C _ _)) (C_C _ (C_C _ _)) -> 18 
  C_B (C_B _ (C_C _ _)) (C_A (C_C _ _)) -> 19 
  C_B (C_C _ (C_C _ _)) (C_C _ (C_B _ _)) -> 20 
  C_B (C_B (C_C _ _) (C_B _ _)) (C_B (C_C _ _) _) -> 21 
