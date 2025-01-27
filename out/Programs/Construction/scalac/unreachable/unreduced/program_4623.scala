package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_A[C]) extends T_A[C]
case class CC_B[D](a: Int, b: T_A[D]) extends T_A[D]
case class CC_C[E](a: CC_B[E], b: Char) extends T_A[E]
case class CC_D(a: CC_A[Boolean]) extends T_B[CC_B[T_A[(Char,Byte)]]]
case class CC_E(a: T_A[T_A[CC_D]], b: CC_D, c: T_B[T_A[CC_D]]) extends T_B[CC_B[T_A[(Char,Byte)]]]

val v_a: T_B[CC_B[T_A[(Char,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(true, CC_A(_, _))) => 0 
  case CC_D(CC_A(false, CC_A(_, _))) => 1 
  case CC_D(CC_A(true, CC_B(_, _))) => 2 
  case CC_D(CC_A(false, CC_B(_, _))) => 3 
  case CC_D(CC_A(true, CC_C(_, _))) => 4 
  case CC_D(CC_A(false, CC_C(_, _))) => 5 
  case CC_E(_, CC_D(_), _) => 6 
}
}