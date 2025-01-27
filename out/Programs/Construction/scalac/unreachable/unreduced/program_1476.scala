package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[T_A[C, C], C]]
case class CC_B[D](a: D, b: D, c: T_B) extends T_A[D, T_A[T_A[D, D], D]]
case class CC_C[E](a: CC_A[E]) extends T_A[E, T_A[T_A[E, E], E]]
case class CC_D(a: CC_C[T_A[T_B, T_B]], b: CC_B[CC_B[T_B]], c: Byte) extends T_B
case class CC_E(a: T_A[CC_D, Boolean]) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_), _, _) => 0 
  case CC_E(_) => 1 
  case CC_F() => 2 
}
}