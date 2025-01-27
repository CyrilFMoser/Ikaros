package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (Int,T_A[T_B, T_B])) extends T_A[T_B, T_A[T_B, Int]]
case class CC_B(a: T_A[CC_A, Boolean], b: T_B, c: T_B) extends T_A[T_B, T_A[T_B, Int]]
case class CC_C() extends T_A[T_B, T_A[T_B, Int]]

val v_a: T_A[T_B, T_A[T_B, Int]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_)