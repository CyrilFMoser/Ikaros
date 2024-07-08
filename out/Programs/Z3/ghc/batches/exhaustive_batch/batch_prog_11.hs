module Program_11 () where 

main = print $ show v_b
data B_A a b = C_A a Char | C_B (B_A b b) (B_A b b)

v_a :: B_A Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B (C_B _ _) (C_B _ _) -> 1 
  C_B _ (C_B _ _) -> 2 
  C_B (C_B (C_B _ _) _) _ -> 3 
  C_B _ (C_B (C_A _ _) (C_A _ _)) -> 4 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B (C_B _ _) (C_B _ _)) -> 5 
  C_B _ _ -> 6 
  C_B (C_A _ _) (C_A _ _) -> 7 
  C_B (C_B _ (C_A _ _)) (C_B (C_A _ _) (C_A _ _)) -> 8 
  C_B _ (C_B _ (C_A _ _)) -> 9 
  C_B _ (C_A _ _) -> 10 
  C_B (C_B (C_A _ _) _) (C_B (C_A _ _) (C_B _ _)) -> 11 
  C_B (C_B (C_A _ _) (C_B _ _)) (C_B (C_A _ _) _) -> 12 
  C_B (C_B _ (C_A _ _)) (C_B _ (C_B _ _)) -> 13 
  C_B (C_B (C_B _ _) _) (C_B (C_A _ _) (C_A _ _)) -> 14 
  C_B (C_B (C_A _ _) _) (C_A _ _) -> 15 
  C_B (C_A _ _) (C_B (C_A _ _) _) -> 16 
  C_B (C_B (C_A _ _) (C_A _ _)) (C_B _ (C_A _ _)) -> 17 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_A _ _) -> 18 
  C_B (C_B _ (C_B _ _)) (C_B (C_A _ _) (C_A _ _)) -> 19 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B _ (C_B _ _)) -> 20 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B (C_A _ _) _) -> 21 
  C_B (C_B _ _) (C_B (C_B _ _) _) -> 22 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B _ _) -> 23 
  C_B (C_B (C_A _ _) (C_A _ _)) _ -> 24 
  C_B _ (C_B (C_B _ _) (C_A _ _)) -> 25 
  C_B (C_B (C_A _ _) (C_A _ _)) (C_B (C_B _ _) (C_B _ _)) -> 26 
  C_B (C_A _ _) (C_B _ _) -> 27 
  C_B (C_B _ (C_A _ _)) (C_B _ (C_A _ _)) -> 28 
  C_B (C_B (C_A _ _) (C_B _ _)) (C_B (C_A _ _) (C_A _ _)) -> 29 
  C_B (C_B (C_B _ _) (C_A _ _)) (C_B (C_A _ _) (C_A _ _)) -> 30 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B (C_B _ _) (C_A _ _)) -> 31 
  C_B (C_B (C_B _ _) (C_A _ _)) (C_B (C_A _ _) (C_B _ _)) -> 32 
  C_B (C_A _ _) (C_B (C_A _ _) (C_A _ _)) -> 33 
  C_B (C_B (C_A _ _) _) (C_B _ _) -> 34 
  C_B (C_B (C_B _ _) (C_A _ _)) (C_B (C_B _ _) (C_A _ _)) -> 35 
  C_B (C_A _ _) _ -> 36 
  C_B (C_B (C_B _ _) (C_A _ _)) (C_B _ _) -> 37 
  C_B (C_B _ _) (C_B (C_A _ _) _) -> 38 
  C_B (C_B _ (C_B _ _)) (C_B (C_A _ _) _) -> 39 
  C_B (C_B (C_B _ _) _) (C_B (C_B _ _) (C_A _ _)) -> 40 
  C_B (C_B (C_A _ _) _) (C_B (C_A _ _) (C_A _ _)) -> 41 
  C_B (C_A _ _) (C_B _ (C_A _ _)) -> 42 
  C_B (C_A _ _) (C_B (C_B _ _) _) -> 43 
  C_B (C_B _ (C_A _ _)) (C_B (C_A _ _) _) -> 44 
  C_B (C_B _ (C_B _ _)) (C_B _ (C_B _ _)) -> 45 
  C_B (C_B (C_B _ _) _) (C_B _ _) -> 46 
  C_B (C_B (C_B _ _) (C_A _ _)) (C_B (C_B _ _) _) -> 47 
  C_B (C_B (C_A _ _) _) (C_B (C_B _ _) _) -> 48 
  C_B (C_B _ (C_B _ _)) (C_B (C_B _ _) _) -> 49 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B (C_B _ _) _) -> 50 
  C_B (C_B (C_A _ _) (C_A _ _)) (C_B (C_A _ _) (C_B _ _)) -> 51 
  C_B (C_B (C_A _ _) (C_A _ _)) (C_B _ (C_B _ _)) -> 52 
  C_B (C_B _ _) (C_B (C_A _ _) (C_A _ _)) -> 53 
  C_B (C_B _ _) (C_A _ _) -> 54 
  C_B (C_B (C_A _ _) (C_B _ _)) (C_B (C_B _ _) (C_B _ _)) -> 55 
  C_B (C_B _ _) (C_B (C_B _ _) (C_B _ _)) -> 56 
  C_B (C_B (C_A _ _) (C_B _ _)) (C_B (C_B _ _) (C_A _ _)) -> 57 
  C_B (C_B (C_A _ _) _) (C_B (C_A _ _) _) -> 58 
  C_B (C_B (C_B _ _) (C_A _ _)) (C_B (C_A _ _) _) -> 59 
  C_B (C_B (C_B _ _) _) (C_B _ (C_A _ _)) -> 60 
  C_B (C_B _ _) (C_B _ (C_A _ _)) -> 61 
  C_B (C_B _ _) (C_B _ (C_B _ _)) -> 62 
  C_B (C_B _ (C_A _ _)) (C_B (C_A _ _) (C_B _ _)) -> 63 
  C_B (C_B (C_A _ _) (C_A _ _)) (C_B (C_A _ _) (C_A _ _)) -> 64 
  C_B (C_B (C_A _ _) _) (C_B _ (C_B _ _)) -> 65 
  C_B (C_B (C_A _ _) (C_B _ _)) _ -> 66 
  C_B (C_B _ (C_B _ _)) (C_B (C_B _ _) (C_B _ _)) -> 67 
  C_B (C_B (C_A _ _) (C_A _ _)) (C_B (C_B _ _) _) -> 68 
  C_B (C_B _ (C_B _ _)) (C_B (C_B _ _) (C_A _ _)) -> 69 
  C_B _ (C_B (C_A _ _) _) -> 70 
  C_B (C_B (C_A _ _) (C_B _ _)) (C_B _ (C_B _ _)) -> 71 
  C_B (C_B (C_A _ _) (C_A _ _)) (C_A _ _) -> 72 
  C_B _ (C_B (C_B _ _) (C_B _ _)) -> 73 
  C_B (C_B (C_B _ _) _) (C_B (C_B _ _) (C_B _ _)) -> 74 
  C_B (C_B _ (C_A _ _)) (C_B (C_B _ _) (C_A _ _)) -> 75 
  C_B (C_A _ _) (C_B (C_B _ _) (C_A _ _)) -> 76 
  C_B (C_B _ (C_B _ _)) (C_A _ _) -> 77 
