package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Boolean]
case class CC_B(a: T_B[Boolean], b: T_A[(CC_A,CC_A)]) extends T_A[Boolean]
case class CC_C(a: T_A[Boolean], b: CC_A) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(), CC_A()) => 2 
  case CC_C(CC_B(_, _), CC_A()) => 3 
  case CC_C(CC_C(CC_B(_, _), CC_A()), CC_A()) => 4 
  case CC_C(CC_C(CC_C(_, _), CC_A()), CC_A()) => 5 
}
}
// This is not matched: CC_C(CC_C(CC_A(), CC_A()), CC_A())