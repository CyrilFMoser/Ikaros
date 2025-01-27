package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Int], T_B[Byte, Byte]]) extends T_A[T_B[T_B[Byte, Boolean], T_B[Boolean, Byte]]]
case class CC_B[D](a: CC_A, b: T_B[D, D], c: CC_A) extends T_B[D, T_A[CC_A]]
case class CC_C[E](a: E, b: E, c: T_B[E, T_A[CC_A]]) extends T_B[E, T_A[CC_A]]

val v_a: T_B[Boolean, T_A[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), _, CC_A(_)) => 0 
  case CC_C(_, _, CC_B(_, _, _)) => 1 
  case CC_C(_, _, CC_C(_, _, CC_B(_, _, _))) => 2 
  case CC_C(_, _, CC_C(_, _, CC_C(_, _, _))) => 3 
}
}