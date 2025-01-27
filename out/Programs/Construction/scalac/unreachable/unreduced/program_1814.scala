package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[F, E], b: Int) extends T_A[F, E]
case class CC_B[H, G, I]() extends T_A[H, G]
case class CC_C(a: T_A[T_B[Byte, (Byte,Byte)], CC_B[Boolean, (Byte,Int), Byte]], b: CC_B[Char, T_A[Byte, Boolean], Boolean]) extends T_B[Int, CC_A[T_A[Byte, Boolean], Byte]]
case class CC_D(a: CC_C, b: Int, c: T_A[(CC_C,CC_C), T_A[CC_C, CC_C]]) extends T_B[Int, CC_A[T_A[Byte, Boolean], Byte]]
case class CC_E(a: CC_A[(CC_D,(Boolean,Char)), Byte]) extends T_B[Int, CC_A[T_A[Byte, Boolean], Byte]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), _) => 0 
  case CC_C(CC_B(), _) => 1 
}
}