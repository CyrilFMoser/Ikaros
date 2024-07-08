module Program_1 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A b b) | C_B (B_A Char Char) (B_A a ((Char,Char))) | C_C (((Bool,Int),Int)) (B_A a a)

v_a :: B_A Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ (C_C (((_,_),_)) (C_B _ _)) -> 0 
  C_C _ (C_B (C_A _) (C_A _)) -> 1 
  C_A (C_B (C_A _) _) -> 2 
  C_B (C_B (C_B _ _) (C_A _)) (C_B (C_A _) _) -> 3 
  C_B (C_B _ _) (C_A (C_A _)) -> 4 
  C_B (C_B (C_C _ _) (C_B _ _)) (C_C (((_,_),_)) (C_A _)) -> 5 
  C_B (C_B _ (C_C _ _)) (C_A _) -> 6 
  C_B (C_B _ (C_A _)) (C_B (C_C _ _) (C_A _)) -> 7 
  C_B (C_B (C_B _ _) (C_C _ _)) (C_A _) -> 8 
  C_B (C_C (((_,_),_)) (C_B _ _)) (C_C _ (C_C _ _)) -> 9 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_C _ (C_A _)) -> 10 
  C_B (C_B (C_C _ _) _) (C_A (C_B _ _)) -> 11 
  C_B (C_B (C_B _ _) (C_C _ _)) (C_C (((_,_),_)) (C_C _ _)) -> 12 
  C_B (C_B _ (C_B _ _)) (C_B (C_A _) _) -> 13 
  C_B (C_C (((_,_),_)) (C_B _ _)) (C_B _ _) -> 14 
  C_B (C_B (C_A _) _) (C_A _) -> 15 
  C_B (C_C (((_,_),_)) (C_B _ _)) _ -> 16 
  C_B (C_B (C_A _) (C_A _)) (C_B (C_A _) (C_C _ _)) -> 17 
  C_B (C_B _ (C_A _)) (C_B (C_C _ _) (C_B _ _)) -> 18 
  C_B (C_B (C_C _ _) (C_A _)) (C_B (C_A _) (C_A _)) -> 19 
  C_B (C_C (((_,_),_)) _) (C_B (C_B _ _) (C_B _ _)) -> 20 
  C_B (C_C (((_,_),_)) (C_A _)) (C_B _ (C_A _)) -> 21 
  C_B (C_B _ (C_A _)) (C_B (C_C _ _) (C_C _ _)) -> 22 
  C_B (C_C _ (C_B _ _)) (C_A (C_B _ _)) -> 23 
  C_B (C_A (C_B _ _)) (C_B _ (C_C _ _)) -> 24 
  C_B (C_B _ _) (C_C _ (C_A _)) -> 25 
  C_B (C_B _ (C_A _)) (C_A (C_A _)) -> 26 
  C_B (C_B (C_C _ _) (C_A _)) (C_C _ (C_B _ _)) -> 27 
  C_B (C_C _ (C_B _ _)) (C_B _ (C_C _ _)) -> 28 
  C_B (C_C _ (C_C _ _)) (C_A _) -> 29 
  C_B (C_B (C_C _ _) (C_C _ _)) (C_B (C_C _ _) (C_B _ _)) -> 30 
  C_B (C_B _ _) (C_B (C_B _ _) (C_C _ _)) -> 31 
  C_B (C_C (((_,_),_)) (C_A _)) (C_B (C_B _ _) (C_B _ _)) -> 32 
  C_B (C_C _ (C_C _ _)) (C_B (C_C _ _) (C_C _ _)) -> 33 
  C_B (C_B (C_A _) (C_C _ _)) _ -> 34 
  C_B _ _ -> 35 
  C_B (C_A _) (C_B (C_B _ _) (C_A _)) -> 36 
  C_B (C_B (C_C _ _) (C_C _ _)) (C_C (((_,_),_)) (C_C _ _)) -> 37 
  C_B (C_B (C_C _ _) _) (C_C _ (C_A _)) -> 38 
  C_B (C_A (C_C _ _)) (C_B (C_C _ _) _) -> 39 
  C_B (C_B (C_B _ _) (C_C _ _)) (C_C _ (C_B _ _)) -> 40 
  C_B (C_B (C_A _) (C_C _ _)) (C_B (C_A _) _) -> 41 
  C_B _ (C_A (C_B _ _)) -> 42 
  C_B (C_B (C_A _) (C_C _ _)) (C_B (C_B _ _) (C_C _ _)) -> 43 
  C_B (C_C (((_,_),_)) _) (C_B _ _) -> 44 
  C_B (C_B (C_C _ _) (C_A _)) (C_B (C_A _) (C_B _ _)) -> 45 
  C_B (C_A (C_A _)) (C_B (C_A _) (C_B _ _)) -> 46 
  C_B (C_A (C_C _ _)) (C_B (C_B _ _) (C_C _ _)) -> 47 
