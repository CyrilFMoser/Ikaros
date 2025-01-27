package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B[D](a: Char) extends T_A[D]
case class CC_C[E](a: T_B[E], b: T_A[E]) extends T_A[E]
case class CC_D(a: CC_A[T_A[Char]]) extends T_B[T_B[Char]]
case class CC_E(a: T_A[(CC_D,Int)], b: Byte) extends T_B[T_B[Char]]
case class CC_F() extends T_B[T_B[Char]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_))) => 1 
  case CC_A(CC_A(CC_C(_, _))) => 2 
  case CC_A(CC_B(_)) => 3 
  case CC_A(CC_C(_, CC_A(_))) => 4 
  case CC_A(CC_C(_, CC_B(_))) => 5 
  case CC_A(CC_C(_, CC_C(_, _))) => 6 
  case CC_B(_) => 7 
  case CC_C(_, CC_A(CC_A(_))) => 8 
  case CC_C(_, CC_A(CC_B(_))) => 9 
  case CC_C(_, CC_A(CC_C(_, _))) => 10 
  case CC_C(_, CC_B(_)) => 11 
  case CC_C(_, CC_C(_, _)) => 12 
}
}