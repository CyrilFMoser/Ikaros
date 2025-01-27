package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Char], b: Byte, c: Byte) extends T_A[T_B[T_B[Char]]]
case class CC_B(a: Int) extends T_A[T_B[T_B[Char]]]
case class CC_C[C](a: CC_B, b: T_B[C]) extends T_A[C]
case class CC_D(a: CC_C[Char], b: T_A[CC_A], c: T_A[Boolean]) extends T_B[CC_A]

val v_a: T_A[T_B[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_), _) => 2 
}
}