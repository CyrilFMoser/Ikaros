package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_A], b: T_B[Char, Int]) extends T_A
case class CC_B(a: T_B[(T_A,CC_A), T_B[(Char,Char), CC_A]]) extends T_A
case class CC_C(a: Int) extends T_A
case class CC_D[C](a: T_B[C, C]) extends T_B[C, CC_B]
case class CC_E[D](a: Byte, b: T_B[D, CC_B], c: (T_B[CC_A, CC_A],CC_C)) extends T_B[D, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}