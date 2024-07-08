module Program_4 () where 

main = print $ show v_b
data B_A a b = C_A | C_B | C_C (B_A b b) (B_A a a)

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_C (C_C (C_A) (C_B)) _ -> 1 
  C_C (C_C (C_B) _) (C_C (C_C _ _) (C_C _ _)) -> 2 
  C_C (C_C _ _) (C_C (C_C _ _) (C_B)) -> 3 
  C_C (C_C (C_C _ _) (C_A)) (C_C (C_B) (C_A)) -> 4 
  C_C (C_C (C_A) (C_B)) (C_A) -> 5 
  C_C (C_C _ (C_C _ _)) (C_C (C_A) _) -> 6 
  C_C (C_B) (C_C (C_A) (C_C _ _)) -> 7 
  C_C (C_C (C_C _ _) (C_A)) (C_C (C_A) (C_C _ _)) -> 8 
  C_C (C_C _ (C_C _ _)) (C_C (C_A) (C_C _ _)) -> 9 
  C_C (C_C _ (C_C _ _)) (C_C _ (C_B)) -> 10 
  C_C (C_C (C_B) (C_C _ _)) (C_C (C_B) (C_A)) -> 11 
  C_C (C_A) (C_C _ _) -> 12 
  C_C (C_C (C_A) _) (C_C _ (C_A)) -> 13 
  C_C (C_C (C_A) (C_B)) (C_C (C_A) (C_C _ _)) -> 14 
  C_C (C_C _ (C_A)) (C_C (C_B) (C_C _ _)) -> 15 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_B) (C_B)) -> 16 
  C_C (C_C (C_A) (C_B)) (C_C _ _) -> 17 
  C_C (C_C (C_A) (C_B)) (C_C (C_C _ _) (C_A)) -> 18 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_A) (C_A)) -> 19 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_B) (C_A)) -> 20 
  C_C _ (C_C (C_C _ _) (C_C _ _)) -> 21 
  C_C (C_C (C_C _ _) (C_A)) (C_C (C_C _ _) (C_B)) -> 22 
  C_C (C_C _ (C_A)) (C_C (C_C _ _) (C_C _ _)) -> 23 
  C_C (C_A) (C_C (C_A) (C_B)) -> 24 
  C_C (C_C (C_A) (C_B)) (C_C (C_C _ _) (C_C _ _)) -> 25 
  C_C (C_C _ (C_B)) (C_B) -> 26 
  C_C (C_C (C_B) (C_C _ _)) _ -> 27 
  C_C _ (C_C _ _) -> 28 
  C_C (C_C (C_A) (C_A)) (C_C _ (C_B)) -> 29 
  C_C (C_C (C_C _ _) (C_B)) (C_C (C_A) _) -> 30 
  C_C (C_C (C_C _ _) (C_B)) (C_C (C_B) (C_B)) -> 31 
  C_C _ (C_C (C_A) (C_C _ _)) -> 32 
  C_C (C_C (C_C _ _) (C_B)) (C_C (C_B) (C_A)) -> 33 
  C_C (C_C (C_B) (C_B)) (C_C _ _) -> 34 
  C_C (C_C _ (C_C _ _)) (C_C _ _) -> 35 
  C_C (C_B) (C_C (C_C _ _) _) -> 36 
  C_C (C_A) (C_C (C_A) _) -> 37 
  C_C (C_C (C_B) (C_C _ _)) (C_C (C_A) (C_A)) -> 38 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_B) _) -> 39 
  C_C (C_C (C_C _ _) (C_A)) (C_C (C_C _ _) (C_A)) -> 40 
  C_C _ _ -> 41 
  C_C (C_C _ _) (C_C (C_A) (C_C _ _)) -> 42 
  C_C (C_C (C_B) (C_C _ _)) (C_C (C_A) (C_C _ _)) -> 43 
  C_C (C_C (C_B) _) (C_C (C_B) _) -> 44 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_B) (C_B)) -> 45 
  C_C (C_C _ (C_C _ _)) (C_C (C_C _ _) _) -> 46 
  C_C (C_C _ _) (C_C _ (C_B)) -> 47 
  C_C (C_C (C_B) (C_B)) (C_C _ (C_B)) -> 48 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C _ (C_A)) -> 49 
  C_C (C_C _ (C_B)) (C_A) -> 50 
  C_C (C_B) (C_C (C_C _ _) (C_A)) -> 51 
  C_C (C_C (C_C _ _) (C_B)) (C_C _ (C_A)) -> 52 
  C_C (C_C (C_B) (C_A)) (C_C _ (C_C _ _)) -> 53 
