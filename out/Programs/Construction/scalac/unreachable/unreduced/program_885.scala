package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Char) extends T_A[T_B[T_B[Boolean, Int], T_A[Int, Boolean]], T_B[T_A[Int, Byte], T_A[Char, Boolean]]]
case class CC_B(a: T_A[T_B[CC_A, CC_A], T_A[CC_A, CC_A]], b: T_A[Boolean, T_A[Char, CC_A]], c: Boolean) extends T_A[Char, CC_A]
case class CC_C(a: CC_A, b: T_A[Char, CC_A], c: T_A[Char, CC_A]) extends T_A[Char, CC_A]

val v_a: T_A[Char, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, CC_B(_, _, _), _) => 1 
  case CC_C(_, CC_C(_, _, _), _) => 2 
}
}