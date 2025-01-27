package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: ((T_A,T_A),Int)) extends T_A
case class CC_B(a: T_B[CC_A, CC_A]) extends T_A
case class CC_C(a: T_A, b: CC_B) extends T_A
case class CC_D(a: T_A, b: T_B[T_B[(Char,Byte), CC_B], CC_C]) extends T_B[T_A, CC_B]
case class CC_E(a: Int) extends T_B[T_A, CC_B]
case class CC_F[C](a: Int, b: C, c: CC_C) extends T_B[C, CC_E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_, _)