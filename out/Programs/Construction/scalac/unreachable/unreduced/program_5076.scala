package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Boolean]
case class CC_B(a: T_A[T_A[Boolean]], b: T_A[Boolean]) extends T_A[Boolean]
case class CC_C(a: Byte, b: T_A[Boolean], c: T_A[Boolean]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, CC_A())) => 2 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 3 
  case CC_B(_, CC_B(_, CC_C(_, _, _))) => 4 
  case CC_B(_, CC_C(_, _, _)) => 5 
  case CC_C(_, _, _) => 6 
}
}