package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[(T_A,Byte), T_A], c: ((T_A,T_A),T_A)) extends T_A
case class CC_B(a: T_B[Int, Char], b: T_A) extends T_A
case class CC_C[C](a: CC_B, b: Int, c: T_A) extends T_B[Char, C]
case class CC_D[D](a: T_B[Char, D]) extends T_B[Char, D]
case class CC_E[E](a: Char, b: CC_B, c: CC_B) extends T_B[CC_C[Int], E]

val v_a: T_B[Char, CC_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, CC_A(_, _, _)), _, _) => 0 
  case CC_C(CC_B(_, CC_B(_, _)), _, _) => 1 
  case CC_D(_) => 2 
}
}