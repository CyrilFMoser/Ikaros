module Program_16 () where 

 main = print $ show v_b
data B_A = C_A B_A B_A | C_B

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A (C_A _ _) C_B) (C_A _ _) -> 0 
  C_A _ (C_A (C_A _ _) (C_A _ _)) -> 1 
  C_A (C_A _ (C_A _ _)) (C_A _ C_B) -> 2 
  C_A (C_A _ (C_A _ _)) _ -> 3 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A C_B _) -> 4 
  C_A C_B (C_A (C_A _ _) (C_A _ _)) -> 5 
  C_A (C_A (C_A _ _) C_B) C_B -> 6 
  C_A (C_A C_B C_B) C_B -> 7 
  C_A (C_A (C_A _ _) (C_A _ _)) (C_A (C_A _ _) _) -> 8 
