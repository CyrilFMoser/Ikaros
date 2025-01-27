package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Boolean], (Char,Byte)]) extends T_A[T_A[T_B[Byte], T_B[Char]], T_A[Char, Int]]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D], c: Boolean) extends T_A[D, Int]
case class CC_C(a: T_A[T_A[CC_A, CC_A], T_A[CC_A, Int]]) extends T_A[T_A[T_B[Byte], T_B[Char]], T_A[Char, Int]]
case class CC_D[E](a: CC_A) extends T_B[E]
case class CC_E(a: T_B[Int], b: T_A[T_B[Int], Int]) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(CC_E(_, _), CC_B(_, _, _)) => 1 
}
}
// This is not matched: CC_E(CC_D(_), CC_B(_, _, _))