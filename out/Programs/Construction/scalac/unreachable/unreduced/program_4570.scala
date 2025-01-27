package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Boolean]
case class CC_B(a: T_A[Boolean], b: T_A[T_A[CC_A]], c: T_A[Boolean]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_B(_, _, _), _, _) => 1 
}
}
// This is not matched: CC_B(CC_A(), _, _)