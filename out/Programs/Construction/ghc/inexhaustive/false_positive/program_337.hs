module Program_24 () where 

 main = print $ show v_b
data B_A a = C_A | C_B | C_C (B_A a) (B_A a) | C_D (B_A a)

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B -> 1 
  C_C _ _ -> 2 
  C_D (C_A) -> 3 
  C_D (C_B) -> 4 
  C_D (C_C (C_A) (C_A)) -> 5 
  C_D (C_C (C_A) (C_B)) -> 6 
  C_D (C_C (C_A) (C_C _ _)) -> 7 
  C_D (C_C (C_A) (C_D _)) -> 8 
  C_D (C_C (C_B) (C_A)) -> 9 
  C_D (C_C (C_B) (C_B)) -> 10 
  C_D (C_C (C_B) (C_C _ _)) -> 11 
  C_D (C_C (C_B) (C_D _)) -> 12 
  C_D (C_C (C_C _ _) (C_A)) -> 13 
  C_D (C_C (C_C _ _) (C_B)) -> 14 
  C_D (C_C (C_C _ _) (C_C _ _)) -> 15 
  C_D (C_C (C_C _ _) (C_D _)) -> 16 
  C_D (C_C (C_D _) (C_A)) -> 17 
  C_D (C_C (C_D _) (C_B)) -> 18 
  C_D (C_C (C_D _) (C_C _ _)) -> 19 
  C_D (C_C (C_D _) (C_D _)) -> 20 
