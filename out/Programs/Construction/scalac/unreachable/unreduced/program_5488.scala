package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int, b: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_A[D, D], D]
case class CC_C(a: T_A[T_A[T_B, T_B], T_B]) extends T_B
case class CC_D(a: CC_C, b: T_A[CC_A[CC_C], CC_A[T_B]], c: Byte) extends T_B
case class CC_E(a: Boolean, b: Char) extends T_B

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_)) => 1 
  case CC_B(_) => 2 
}
}