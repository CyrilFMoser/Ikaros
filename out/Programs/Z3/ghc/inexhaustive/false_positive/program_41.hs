module Program_17 () where 

 main = print $ show v_b
data B_A = C_A B_A B_A | C_B

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A _ _) (C_A C_B C_B) -> 0 
  C_A (C_A C_B C_B) (C_A C_B _) -> 1 
  C_A (C_A (C_A _ _) C_B) (C_A C_B _) -> 2 
  C_A (C_A C_B C_B) (C_A (C_A _ _) _) -> 3 
  C_A (C_A _ (C_A _ _)) C_B -> 4 
  C_A C_B (C_A C_B (C_A _ _)) -> 5 
  C_A (C_A C_B (C_A _ _)) (C_A _ _) -> 6 
  C_A (C_A _ C_B) (C_A C_B (C_A _ _)) -> 7 
  C_A (C_A _ (C_A _ _)) (C_A C_B _) -> 8 
  C_A C_B (C_A C_B _) -> 9 
  C_A (C_A C_B (C_A _ _)) (C_A _ C_B) -> 10 
  C_A (C_A C_B (C_A _ _)) (C_A (C_A _ _) C_B) -> 11 
  C_A (C_A _ C_B) (C_A (C_A _ _) (C_A _ _)) -> 12 
  C_A (C_A C_B (C_A _ _)) (C_A C_B C_B) -> 13 
  C_A (C_A (C_A _ _) _) _ -> 14 
  C_A (C_A _ (C_A _ _)) (C_A C_B C_B) -> 15 
  C_A (C_A (C_A _ _) _) (C_A C_B (C_A _ _)) -> 16 
  C_A (C_A _ C_B) _ -> 17 
  C_A _ (C_A C_B _) -> 18 
  C_A (C_A C_B C_B) (C_A _ C_B) -> 19 
  C_A (C_A C_B _) C_B -> 20 
  C_A (C_A _ _) (C_A (C_A _ _) (C_A _ _)) -> 21 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A _ C_B) -> 22 
  C_A (C_A C_B _) _ -> 23 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A C_B (C_A _ _)) -> 24 
  C_A (C_A _ C_B) (C_A (C_A _ _) _) -> 25 
  C_A (C_A _ _) (C_A (C_A _ _) _) -> 26 
  C_A (C_A C_B (C_A _ _)) (C_A (C_A _ _) _) -> 27 
  C_A (C_A C_B _) (C_A (C_A _ _) C_B) -> 28 
  C_A (C_A (C_A _ _) C_B) (C_A _ (C_A _ _)) -> 29 
  C_A (C_A C_B (C_A _ _)) C_B -> 30 
  C_A _ (C_A _ (C_A _ _)) -> 31 
  C_A (C_A C_B (C_A _ _)) (C_A C_B _) -> 32 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_A _ _) (C_A _ _)) -> 33 
  C_A _ (C_A (C_A _ _) C_B) -> 34 
  C_A (C_A (C_A _ _) _) (C_A (C_A _ _) _) -> 35 
  C_A (C_A (C_A _ _) C_B) (C_A (C_A _ _) _) -> 36 
  C_A C_B (C_A (C_A _ _) C_B) -> 37 
  C_A C_B (C_A _ _) -> 38 
  C_A (C_A C_B C_B) (C_A (C_A _ _) (C_A _ _)) -> 39 
  C_A (C_A C_B C_B) (C_A C_B (C_A _ _)) -> 40 
  C_A (C_A _ _) (C_A (C_A _ _) C_B) -> 41 
  C_A _ _ -> 42 
  C_A (C_A (C_A _ _) C_B) (C_A C_B (C_A _ _)) -> 43 
  C_A C_B _ -> 44 
  C_A _ (C_A _ C_B) -> 45 
  C_A (C_A C_B _) (C_A _ _) -> 46 
  C_A _ (C_A C_B (C_A _ _)) -> 47 
  C_A (C_A _ C_B) (C_A (C_A _ _) C_B) -> 48 
  C_A (C_A _ (C_A _ _)) (C_A (C_A _ _) (C_A _ _)) -> 49 
  C_A (C_A (C_A _ _) _) (C_A _ _) -> 50 
  C_A C_B (C_A (C_A _ _) _) -> 51 
  C_A C_B (C_A _ C_B) -> 52 
  C_A (C_A (C_A _ _) C_B) (C_A (C_A _ _) (C_A _ _)) -> 53 
  C_A (C_A _ _) (C_A _ (C_A _ _)) -> 54 
  C_A (C_A C_B C_B) (C_A _ (C_A _ _)) -> 55 
  C_A (C_A (C_A _ _) _) (C_A (C_A _ _) (C_A _ _)) -> 56 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A _ _) -> 57 
  C_A (C_A (C_A _ _) _) (C_A C_B C_B) -> 58 
  C_A (C_A C_B _) (C_A C_B C_B) -> 59 
  C_A (C_A _ C_B) (C_A _ C_B) -> 60 
  C_A (C_A _ (C_A _ _)) (C_A _ (C_A _ _)) -> 61 
  C_A (C_A _ C_B) (C_A _ _) -> 62 
  C_A (C_A _ _) _ -> 63 
  C_A (C_A _ C_B) C_B -> 64 
  C_A (C_A (C_A _ _) C_B) (C_A _ C_B) -> 65 
  C_A (C_A _ C_B) (C_A _ (C_A _ _)) -> 66 
  C_A (C_A (C_A _ _) _) (C_A _ (C_A _ _)) -> 67 
  C_A (C_A C_B _) (C_A (C_A _ _) (C_A _ _)) -> 68 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A _ (C_A _ _)) -> 69 
  C_A (C_A C_B (C_A _ _)) (C_A _ (C_A _ _)) -> 70 
  C_A (C_A (C_A _ _) _) (C_A C_B _) -> 71 
  C_A (C_A _ _) (C_A C_B _) -> 72 
  C_A (C_A C_B _) (C_A _ (C_A _ _)) -> 73 
