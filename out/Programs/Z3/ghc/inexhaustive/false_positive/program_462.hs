module Program_16 () where 

main = print $ show v_b
data B_B c = C_B c | C_C Char | C_D | C_E (B_B c)
data B_A a b = C_A (B_A Int b)

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D -> 0 
  C_E (C_C _) -> 1 
  C_E (C_E (C_B _)) -> 2 
  C_E (C_E (C_C _)) -> 3 
  C_E (C_E (C_D)) -> 4 
