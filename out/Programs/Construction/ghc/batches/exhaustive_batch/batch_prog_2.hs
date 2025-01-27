module Program_2 () where 

main = print $ show v_b
data B_A a b = C_A a Int (B_A a a) | C_B
data B_B c = C_C (B_B c) | C_D (B_A c c) (B_A c c) (B_B c)

v_a :: B_B Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_C _) -> 0 
  C_C (C_D _ (C_A _ _ _) _) -> 1 
  C_C (C_D _ (C_B) _) -> 2 
  C_D _ _ _ -> 3 
