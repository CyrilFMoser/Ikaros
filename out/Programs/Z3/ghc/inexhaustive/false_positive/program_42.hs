module Program_18 () where 

 main = print $ show v_b
data B_A = C_A B_A B_A | C_B

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A _ (C_A _ _)) (C_A (C_A _ _) _) -> 0 
  C_A (C_A C_B C_B) _ -> 1 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A C_B C_B) -> 2 
  C_A (C_A C_B (C_A _ _)) (C_A (C_A _ _) (C_A _ _)) -> 3 
  C_A (C_A _ (C_A _ _)) (C_A _ _) -> 4 
  C_A (C_A (C_A _ _) _) (C_A (C_A _ _) C_B) -> 5 
  C_A (C_A C_B C_B) (C_A (C_A _ _) C_B) -> 6 
  C_A (C_A (C_A _ _) (C_A _ _)) _ -> 7 
  C_A C_B (C_A _ (C_A _ _)) -> 8 
  C_A (C_A (C_A _ _) (C_A _ _)) C_B -> 9 
  C_A (C_A _ C_B) (C_A C_B _) -> 10 
  C_A (C_A _ (C_A _ _)) (C_A C_B (C_A _ _)) -> 11 
  C_A (C_A C_B _) (C_A (C_A _ _) _) -> 12 
  C_A (C_A C_B _) (C_A C_B (C_A _ _)) -> 13 
  C_A C_B (C_A C_B C_B) -> 14 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_A _ _) C_B) -> 15 
  C_A (C_A C_B C_B) (C_A _ _) -> 16 
  C_A (C_A _ (C_A _ _)) (C_A (C_A _ _) C_B) -> 17 
  C_A (C_A (C_A _ _) _) (C_A _ C_B) -> 18 
  C_A (C_A _ _) (C_A C_B (C_A _ _)) -> 19 
  C_A _ (C_A C_B C_B) -> 20 
  C_A (C_A C_B _) (C_A C_B _) -> 21 
  C_A (C_A C_B (C_A _ _)) _ -> 22 
  C_A _ (C_A _ _) -> 23 
  C_A (C_A (C_A _ _) C_B) (C_A C_B C_B) -> 24 
  C_A (C_A _ _) (C_A _ _) -> 25 
  C_A (C_A (C_A _ _) C_B) (C_A (C_A _ _) C_B) -> 26 
  C_A (C_A (C_A _ _) C_B) _ -> 27 
  C_A (C_A _ _) C_B -> 28 
  C_A (C_A C_B C_B) (C_A C_B C_B) -> 29 
  C_A _ (C_A (C_A _ _) _) -> 30 
  C_A (C_A C_B _) (C_A _ C_B) -> 31 
  C_A (C_A C_B (C_A _ _)) (C_A C_B (C_A _ _)) -> 32 
  C_A C_B C_B -> 33 
  C_A _ C_B -> 34 
  C_A (C_A _ C_B) (C_A C_B C_B) -> 35 
  C_A (C_A (C_A _ _) _) C_B -> 36 
  C_A (C_A _ _) (C_A _ C_B) -> 37 
