package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: (T_B[T_A, (Int,Int)],T_A)) extends T_A
case class CC_B(a: T_B[(Char,Char), Char], b: Boolean, c: T_B[T_B[CC_A, T_A], CC_A]) extends T_A
case class CC_C[C](a: CC_B, b: Byte) extends T_B[Int, C]
case class CC_D[D]() extends T_B[Int, D]
case class CC_E[E](a: Byte, b: E) extends T_B[Int, E]

val v_a: T_B[Int, CC_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _), _) => 0 
  case CC_D() => 1 
  case CC_E(_, CC_A(CC_A(_, _), _)) => 2 
  case CC_E(_, CC_A(CC_B(_, _, _), _)) => 3 
}
}