module Program_4 () where 

main = print $ show v_b
data B_A a = C_A (B_A a) a (B_B a a) | C_B (B_B a (B_B a a)) | C_C ((B_A ((Bool,Bool)),B_B Char Char))
data B_B b c = C_D c Int | C_E (B_A b) Char | C_F (B_A c) (B_B c c)

v_a :: C_C ((B_A ((Bool,Bool)),B_B Char Char))
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ -> 0 
