package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, T_A], c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C[C]() extends T_B[Boolean, C]
case class CC_D[D](a: T_A, b: CC_A, c: T_B[Boolean, D]) extends T_B[Boolean, D]
case class CC_E[E](a: E, b: Byte, c: CC_A) extends T_B[CC_D[T_B[Boolean, (Byte,Int)]], E]

val v_a: T_B[Boolean, CC_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_, _, _), _, _) => 1 
  case CC_D(CC_B(), _, _) => 2 
}
}