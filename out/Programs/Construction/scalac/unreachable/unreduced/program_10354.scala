package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B[C](a: (Byte,T_B[Int, T_A]), b: CC_A) extends T_B[Char, C]
case class CC_C[D](a: D, b: T_B[Char, D]) extends T_B[D, CC_A]
case class CC_D[E]() extends T_B[E, CC_A]

val v_a: T_B[Char, CC_A] = null
val v_b: Int = v_a match{
  case CC_B((_,_), _) => 0 
  case CC_C(_, _) => 1 
  case CC_D() => 2 
}
}