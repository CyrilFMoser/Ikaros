package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B(a: Byte) extends T_A[(CC_A[Char],T_A[Char, Int]), T_A[(CC_A[Char],T_A[Char, Int]), (CC_A[Char],T_A[Char, Int])]]
case class CC_C(a: (CC_A[CC_B],T_A[CC_B, CC_B])) extends T_A[T_A[CC_A[CC_B], T_A[CC_A[CC_B], CC_A[CC_B]]], T_A[CC_A[Int], T_A[CC_A[Int], CC_A[Int]]]]

val v_a: T_A[(CC_A[Char],T_A[Char, Int]), T_A[(CC_A[Char],T_A[Char, Int]), (CC_A[Char],T_A[Char, Int])]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}