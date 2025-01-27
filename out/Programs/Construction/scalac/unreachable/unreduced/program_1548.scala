package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[T_A[C]], b: T_A[C]) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C() extends T_B[Boolean]
case class CC_D(a: CC_C, b: CC_A[T_A[CC_C]], c: T_A[T_B[Byte]]) extends T_B[Boolean]
case class CC_E(a: T_A[CC_A[CC_D]], b: T_A[CC_D]) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_C(), _, CC_A(_, _)) => 1 
  case CC_D(CC_C(), _, CC_B()) => 2 
  case CC_E(CC_A(_, _), CC_A(_, _)) => 3 
  case CC_E(CC_B(), CC_A(_, _)) => 4 
  case CC_E(CC_A(_, _), CC_B()) => 5 
  case CC_E(CC_B(), CC_B()) => 6 
}
}