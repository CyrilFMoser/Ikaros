package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Boolean]], b: (Char,T_B[Char]), c: T_A[T_A[Int]]) extends T_A[T_A[T_A[(Byte,Boolean)]]]
case class CC_B[C](a: T_A[C], b: CC_A, c: (CC_A,T_B[CC_A])) extends T_A[C]
case class CC_C[D](a: T_A[D]) extends T_A[D]
case class CC_D(a: CC_B[T_A[CC_A]], b: T_A[Int], c: Boolean) extends T_B[T_B[(Boolean,CC_A)]]
case class CC_E(a: Char, b: T_B[Byte]) extends T_B[T_B[(Boolean,CC_A)]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _, _), _)) => 1 
  case CC_C(CC_C(_)) => 2 
}
}
// This is not matched: CC_C(CC_B(CC_C(_), CC_A(_, _, _), _))