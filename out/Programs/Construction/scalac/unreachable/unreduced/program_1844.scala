package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[(Char,Int), Byte], b: T_B[T_A[Char], T_B[Int, Boolean]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_A[(CC_A,CC_A)]) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: CC_B, b: CC_B) extends T_A[T_A[T_A[Int]]]
case class CC_D[D, E](a: Char) extends T_B[D, E]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_), _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(CC_B(_), CC_B(_))