package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: Boolean) extends T_A[E]
case class CC_C() extends T_A[Char]
case class CC_D[F](a: Boolean, b: F) extends T_B[CC_C, F]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()