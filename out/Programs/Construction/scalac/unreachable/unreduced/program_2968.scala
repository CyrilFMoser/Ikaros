package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_B[CC_A, Int], c: T_B[CC_A, CC_A]) extends T_A
case class CC_C[C](a: T_A, b: CC_B, c: CC_A) extends T_B[T_A, C]
case class CC_D(a: T_A) extends T_B[T_A, CC_C[CC_A]]

val v_a: T_B[T_A, CC_C[CC_A]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _), _, _) => 0 
  case CC_D(CC_A()) => 1 
  case CC_D(CC_B(_, _, _)) => 2 
}
}
// This is not matched: CC_C(CC_A(), _, _)