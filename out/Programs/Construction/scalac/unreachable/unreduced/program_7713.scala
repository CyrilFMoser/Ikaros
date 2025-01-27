package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[T_A[Int, T_B], T_B]) extends T_A[T_A[Int, T_B], C]
case class CC_B[D](a: D) extends T_A[T_A[Int, T_B], D]
case class CC_C(a: T_A[CC_B[(Char,Boolean)], CC_B[T_B]], b: CC_B[T_A[T_B, T_B]]) extends T_B
case class CC_D(a: CC_B[CC_C]) extends T_B
case class CC_E(a: T_B, b: Char, c: CC_A[T_A[Char, (Boolean,Int)]]) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_C(_, CC_B(_)), _, _) => 0 
  case CC_E(CC_D(_), _, _) => 1 
  case CC_E(CC_E(CC_C(_, _), _, _), _, _) => 2 
  case CC_E(CC_E(CC_D(_), _, _), _, _) => 3 
}
}
// This is not matched: CC_E(CC_E(CC_E(_, _, _), _, _), _, _)