package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Char, Char], b: T_A[Byte]) extends T_A[T_A[Byte]]
case class CC_B[D]() extends T_B[D, Char]
case class CC_D[F, G]() extends T_B[G, F]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(), _) => 0 
}
}
// This is not matched: (CC_C T_A (CC_A T_A T_A T_A T_A) (T_B (CC_A T_A T_A T_A T_A) T_A))