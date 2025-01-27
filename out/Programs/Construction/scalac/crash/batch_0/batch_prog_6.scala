package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Byte, b: T_A[T_A[C, C], C]) extends T_A[D, C]
case class CC_B[F, E](a: Boolean) extends T_A[E, F]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(0, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(0, CC_B(_))) => 1 
  case CC_A(_, CC_A(_, CC_A(_, _))) => 2 
  case CC_A(_, CC_A(_, CC_B(_))) => 3 
  case CC_A(_, CC_B(_)) => 4 
  case CC_B(true) => 5 
  case CC_B(false) => 6 
}
}