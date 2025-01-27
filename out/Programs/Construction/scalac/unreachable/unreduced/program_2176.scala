package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Int], T_A[Int]], b: T_A[Boolean], c: T_A[Char]) extends T_A[T_A[Byte]]
case class CC_B(a: T_A[T_A[Byte]], b: Boolean, c: T_A[CC_A]) extends T_A[T_A[Byte]]
case class CC_C() extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _, _) => 1 
  case CC_B(CC_B(_, _, _), _, _) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_B(CC_C(), _, _)