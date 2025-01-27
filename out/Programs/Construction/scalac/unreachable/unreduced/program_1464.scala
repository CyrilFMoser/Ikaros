package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Boolean, T_B[Byte, T_A]], b: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: T_B[C, C], b: C) extends T_B[C, Byte]
case class CC_E[D](a: CC_A, b: (CC_C,T_B[Boolean, Byte]), c: (CC_B,CC_B)) extends T_B[D, Byte]
case class CC_F[E]() extends T_B[E, Byte]

val v_a: T_B[CC_B, Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(_, _, _) => 1 
  case CC_F() => 2 
}
}