package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_B]
case class CC_B[D](a: T_A[D, D], b: CC_A[D], c: T_A[CC_A[D], T_B]) extends T_A[D, T_B]
case class CC_C() extends T_B
case class CC_D(a: T_A[T_A[T_B, T_B], CC_B[T_B]], b: CC_C) extends T_B
case class CC_E(a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_E(_)