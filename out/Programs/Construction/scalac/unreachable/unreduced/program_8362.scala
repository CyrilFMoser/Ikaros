package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte, b: T_A[T_A[Int]], c: T_B[T_A[(Byte,Boolean)]]) extends T_A[T_A[T_B[Int]]]
case class CC_B(a: T_B[T_A[Int]], b: Boolean, c: T_B[T_A[Int]]) extends T_B[T_A[Int]]
case class CC_C() extends T_B[T_A[Int]]
case class CC_D(a: CC_A) extends T_B[T_A[Int]]

val v_a: T_B[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(CC_B(_, _, _), _, CC_B(_, _, _))) => 0 
  case CC_B(_, _, CC_B(CC_B(_, _, _), _, CC_C())) => 1 
  case CC_B(_, _, CC_B(CC_B(_, _, _), _, CC_D(_))) => 2 
  case CC_B(_, _, CC_B(CC_C(), _, CC_B(_, _, _))) => 3 
  case CC_B(_, _, CC_B(CC_C(), _, CC_C())) => 4 
  case CC_B(_, _, CC_B(CC_C(), _, CC_D(_))) => 5 
  case CC_B(_, _, CC_B(CC_D(_), _, CC_B(_, _, _))) => 6 
  case CC_B(_, _, CC_B(CC_D(_), _, CC_C())) => 7 
  case CC_B(_, _, CC_B(CC_D(_), _, CC_D(_))) => 8 
  case CC_B(_, _, CC_C()) => 9 
  case CC_B(_, _, CC_D(CC_A(_, _, _))) => 10 
  case CC_C() => 11 
  case CC_D(_) => 12 
}
}