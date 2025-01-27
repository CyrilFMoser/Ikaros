package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_B) extends T_A[D, (Byte,T_A[T_B, Int])]
case class CC_C[E](a: T_A[E, E]) extends T_A[E, T_A[E, E]]
case class CC_D() extends T_B
case class CC_E(a: T_A[CC_D, Boolean], b: CC_A[CC_B[CC_D]], c: CC_B[CC_B[Byte]]) extends T_B

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}