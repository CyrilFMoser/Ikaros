package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Boolean]
case class CC_B(a: T_A[Byte], b: T_A[Boolean], c: Char) extends T_A[Boolean]
case class CC_C[B](a: CC_A, b: B, c: T_A[Boolean]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(), _) => 0 
  case CC_B(_, CC_B(_, _, _), _) => 1 
  case CC_B(_, CC_C(_, _, _), _) => 2 
  case CC_C(CC_A(), _, CC_A()) => 3 
  case CC_C(CC_A(), _, CC_B(_, _, _)) => 4 
  case CC_C(CC_A(), _, CC_C(_, _, _)) => 5 
}
}
// This is not matched: CC_A()