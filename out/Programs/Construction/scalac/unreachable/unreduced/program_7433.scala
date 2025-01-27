package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: Int) extends T_A[D, Int]
case class CC_B() extends T_A[T_B[T_A[Byte, Int]], Int]
case class CC_C(a: T_B[((Char,Boolean),CC_B)], b: Boolean) extends T_A[T_B[T_A[Byte, Int]], Int]
case class CC_D[E](a: T_A[E, Int]) extends T_B[E]
case class CC_E(a: Char, b: T_B[T_B[CC_B]]) extends T_B[CC_D[T_B[CC_C]]]
case class CC_F(a: T_B[(CC_E,CC_B)], b: T_A[T_A[CC_B, CC_C], CC_C], c: Boolean) extends T_B[CC_D[T_B[CC_C]]]

val v_a: T_B[CC_D[T_B[CC_C]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(CC_D(_), _)) => 0 
  case CC_E(_, CC_D(_)) => 1 
  case CC_F(CC_D(_), _, true) => 2 
  case CC_F(CC_D(_), _, false) => 3 
}
}