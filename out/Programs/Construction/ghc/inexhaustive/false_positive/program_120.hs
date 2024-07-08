module Program_30 () where 

 main = print $ show v_b
data B_A a b = C_A (B_C b) | C_B (B_B b) (B_A a a) | C_C b (B_A a b)
data B_B c = C_D (B_A c c) | C_E | C_F Bool | C_G
data B_C d = C_H Bool (B_C d)

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B _ (C_A _) -> 1 
  C_B _ (C_B _ _) -> 2 
  C_B _ (C_C _ (C_B _ _)) -> 3 
  C_B _ (C_C _ (C_C _ _)) -> 4 
  C_C 12 (C_A _) -> 5 
  C_C 12 (C_B (C_D _) (C_A _)) -> 6 
  C_C 12 (C_B (C_D _) (C_B _ _)) -> 7 
  C_C 12 (C_B (C_D _) (C_C _ _)) -> 8 
  C_C 12 (C_B (C_E) (C_A _)) -> 9 
  C_C 12 (C_B (C_E) (C_B _ _)) -> 10 
  C_C 12 (C_B (C_E) (C_C _ _)) -> 11 
  C_C 12 (C_B (C_F _) (C_A _)) -> 12 
  C_C 12 (C_B (C_F _) (C_B _ _)) -> 13 
  C_C 12 (C_B (C_F _) (C_C _ _)) -> 14 
  C_C 12 (C_B (C_G) (C_A _)) -> 15 
  C_C 12 (C_B (C_G) (C_B _ _)) -> 16 
  C_C 12 (C_B (C_G) (C_C _ _)) -> 17 
  C_C 12 (C_C _ _) -> 18 
  C_C _ (C_A _) -> 19 
  C_C _ (C_B (C_D _) (C_A _)) -> 20 
  C_C _ (C_B (C_D _) (C_B _ _)) -> 21 
  C_C _ (C_B (C_D _) (C_C _ _)) -> 22 
  C_C _ (C_B (C_E) (C_A _)) -> 23 
  C_C _ (C_B (C_E) (C_B _ _)) -> 24 
  C_C _ (C_B (C_E) (C_C _ _)) -> 25 
  C_C _ (C_B (C_F _) (C_A _)) -> 26 
  C_C _ (C_B (C_F _) (C_B _ _)) -> 27 
  C_C _ (C_B (C_F _) (C_C _ _)) -> 28 
  C_C _ (C_B (C_G) (C_A _)) -> 29 
  C_C _ (C_B (C_G) (C_B _ _)) -> 30 
  C_C _ (C_B (C_G) (C_C _ _)) -> 31 
  C_C _ (C_C _ _) -> 32 
