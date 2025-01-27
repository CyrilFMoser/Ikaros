package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,T_A[Boolean, Boolean])) extends T_A[C, Byte]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: T_A[Int, Byte], c: (Byte,T_A[T_B, Byte])) extends T_A[D, Byte]
case class CC_C[E]() extends T_A[E, Byte]
case class CC_D() extends T_B
case class CC_E(a: T_B, b: T_A[CC_B[Boolean], (CC_D,T_B)]) extends T_B
case class CC_F(a: T_A[Int, T_A[T_B, Byte]], b: (T_A[(Int,Char), Byte],CC_D)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_E(_, _), _) => 1 
  case CC_E(CC_F(_, _), _) => 2 
  case CC_F(_, _) => 3 
}
}
// This is not matched: CC_E(CC_D(), _)