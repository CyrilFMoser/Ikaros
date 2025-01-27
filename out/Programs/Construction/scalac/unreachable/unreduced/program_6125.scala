package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_B[D], b: T_A[D]) extends T_A[D]
case class CC_C[E](a: CC_A[E], b: CC_B[E], c: T_A[E]) extends T_A[E]
case class CC_D(a: Boolean, b: T_A[CC_B[(Char,Boolean)]]) extends T_B[Int]
case class CC_E() extends T_B[T_A[Byte]]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D(true, CC_A()) => 0 
  case CC_D(true, CC_B(_, CC_A())) => 1 
  case CC_D(true, CC_B(_, CC_B(_, _))) => 2 
  case CC_D(true, CC_B(_, CC_C(_, _, _))) => 3 
  case CC_D(true, CC_C(_, _, _)) => 4 
  case CC_D(false, CC_A()) => 5 
  case CC_D(false, CC_B(_, CC_A())) => 6 
  case CC_D(false, CC_B(_, CC_B(_, _))) => 7 
  case CC_D(false, CC_B(_, CC_C(_, _, _))) => 8 
  case CC_D(false, CC_C(_, _, _)) => 9 
}
}