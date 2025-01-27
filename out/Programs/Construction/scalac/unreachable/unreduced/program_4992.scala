package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_B]
case class CC_B[D](a: T_A[CC_A[D], T_B]) extends T_A[D, T_B]
case class CC_C[E](a: CC_A[E], b: Boolean, c: (T_A[T_B, T_B],T_A[T_B, T_B])) extends T_A[E, T_B]
case class CC_D(a: Byte, b: T_B) extends T_B
case class CC_E(a: Boolean, b: CC_A[T_A[CC_D, CC_D]]) extends T_B
case class CC_F(a: CC_B[Int]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_D(_, _)) => 0 
  case CC_D(_, CC_E(_, _)) => 1 
  case CC_D(_, CC_F(CC_B(_))) => 2 
  case CC_E(_, CC_A(_)) => 3 
  case CC_F(CC_B(_)) => 4 
}
}