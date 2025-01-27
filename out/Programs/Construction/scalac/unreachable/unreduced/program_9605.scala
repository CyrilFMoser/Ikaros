package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_B,T_A[T_B]), b: Int) extends T_A[T_B]
case class CC_B(a: Byte, b: T_B, c: T_A[(T_B,CC_A)]) extends T_A[T_B]
case class CC_C(a: T_B, b: T_B, c: T_A[T_A[(Byte,Boolean)]]) extends T_A[T_B]
case class CC_D() extends T_B
case class CC_E(a: CC_A) extends T_B
case class CC_F(a: Int, b: T_A[T_B]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A((CC_D(),CC_A(_, _)), _) => 0 
  case CC_A((CC_D(),CC_B(_, _, _)), _) => 1 
  case CC_A((CC_D(),CC_C(_, _, _)), _) => 2 
  case CC_A((CC_E(_),CC_A(_, _)), _) => 3 
  case CC_A((CC_E(_),CC_B(_, _, _)), _) => 4 
  case CC_A((CC_E(_),CC_C(_, _, _)), _) => 5 
  case CC_A((CC_F(_, _),CC_A(_, _)), _) => 6 
  case CC_A((CC_F(_, _),CC_B(_, _, _)), _) => 7 
  case CC_A((CC_F(_, _),CC_C(_, _, _)), _) => 8 
  case CC_B(_, _, _) => 9 
  case CC_C(_, CC_D(), _) => 10 
  case CC_C(_, CC_E(CC_A(_, _)), _) => 11 
  case CC_C(_, CC_F(_, _), _) => 12 
}
}