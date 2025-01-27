package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: Int, b: T_B[Boolean, CC_A]) extends T_A
case class CC_C(a: (CC_A,T_A), b: Int) extends T_A
case class CC_D[C, D](a: C, b: T_B[C, C]) extends T_B[Byte, C]
case class CC_E[E]() extends T_B[Byte, E]
case class CC_F[F]() extends T_B[Byte, F]

val v_a: T_B[Byte, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_C((_,_), _), _) => 0 
  case CC_E() => 1 
  case CC_F() => 2 
}
}