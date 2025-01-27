package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, Int]) extends T_A
case class CC_B() extends T_A
case class CC_C[C]() extends T_B[(Byte,T_B[CC_B, Byte]), C]
case class CC_D[D, E](a: CC_A, b: E) extends T_B[(Byte,T_B[CC_B, Byte]), D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}