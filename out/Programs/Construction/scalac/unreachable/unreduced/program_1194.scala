package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte, b: T_A[(Boolean,Char)], c: T_B[(Byte,Int)]) extends T_A[T_A[T_B[Boolean]]]
case class CC_B(a: CC_A, b: T_A[CC_A], c: T_A[CC_A]) extends T_A[CC_A]
case class CC_C(a: T_B[T_A[CC_B]]) extends T_A[CC_A]
case class CC_D[C](a: Char) extends T_B[C]
case class CC_E[D](a: T_B[D]) extends T_B[D]

val v_a: T_A[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), CC_B(_, _, _), _) => 0 
  case CC_B(CC_A(_, _, _), CC_C(_), _) => 1 
  case CC_C(CC_D(_)) => 2 
  case CC_C(CC_E(_)) => 3 
}
}