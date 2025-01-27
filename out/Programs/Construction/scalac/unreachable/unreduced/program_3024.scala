package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[F, F], b: Boolean) extends T_A[F, E]
case class CC_B[G]() extends T_A[T_B[Boolean, T_B[Byte, Int]], G]
case class CC_C(a: T_B[T_A[Int, Char], (Char,Char)], b: (Byte,CC_A[(Boolean,Byte), Boolean])) extends T_A[T_B[Boolean, T_B[Byte, Int]], CC_A[T_A[Boolean, Int], Byte]]
case class CC_D[H, I](a: Boolean) extends T_B[T_A[T_B[CC_C, Byte], CC_C], H]
case class CC_E[J](a: J, b: T_A[J, J], c: CC_B[J]) extends T_B[Int, J]
case class CC_F(a: CC_C) extends T_B[Int, CC_B[T_B[CC_C, CC_C]]]

val v_a: T_A[T_B[Boolean, T_B[Byte, Int]], CC_A[T_A[Boolean, Int], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(), _), _) => 1 
  case CC_A(CC_B(), _) => 2 
  case CC_B() => 3 
  case CC_C(_, (_,CC_A(_, _))) => 4 
}
}