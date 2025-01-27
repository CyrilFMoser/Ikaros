package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[F, E]
case class CC_B() extends T_A[T_A[(Boolean,Byte), Char], CC_A[Byte, Byte]]
case class CC_C(a: T_B[Byte, (Char,Char)]) extends T_A[Int, CC_B]
case class CC_D[G, H]() extends T_B[G, H]
case class CC_F[L, K]() extends T_B[K, L]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_F()) => 0 
}
}
// This is not matched: (CC_C (CC_F (Tuple Char Char) Byte (T_B Byte (Tuple Char Char)))
//      (T_A Int (CC_B Boolean)))