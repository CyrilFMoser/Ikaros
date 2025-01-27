package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[T_B[D, D], Boolean]) extends T_A[D]
case class CC_B[E](a: E) extends T_A[E]
case class CC_C(a: Char, b: (T_A[Byte],Char)) extends T_B[Int, T_B[CC_B[Int], CC_A[Int]]]
case class CC_D(a: T_B[T_A[CC_C], CC_C], b: CC_C, c: Int) extends T_B[Int, T_B[CC_B[Int], CC_A[Int]]]
case class CC_E(a: (CC_B[CC_D],(CC_D,(Char,Int))), b: CC_C, c: Boolean) extends T_B[Int, T_B[CC_B[Int], CC_A[Int]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_), _), _) => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: CC_A(CC_B(_), _)