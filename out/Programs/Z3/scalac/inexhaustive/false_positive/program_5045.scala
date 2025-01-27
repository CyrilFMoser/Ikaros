package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_B[G, H](a: T_B[H, H], b: T_A[G, G], c: H) extends T_A[G, H]
case class CC_C[I]() extends T_B[I, Int]
case class CC_D() extends T_B[(Char,Byte), Int]

val v_a: T_A[Char, T_B[(Char,Byte), Int]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_C()) => 0 
}
}
// This is not matched: (CC_B (CC_E Char (T_B Char))
//      (CC_D (CC_A Wildcard Wildcard Wildcard)
//            Wildcard
//            (T_B (CC_A Wildcard Wildcard Wildcard)))
//      (CC_B (CC_E Char (T_B Char)) Wildcard Wildcard T_A)
//      T_A)