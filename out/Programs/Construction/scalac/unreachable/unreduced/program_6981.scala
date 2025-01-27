package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, ((Char,Boolean),T_A[Byte, Int])]
case class CC_B[D](a: D) extends T_A[D, ((Char,Boolean),T_A[Byte, Int])]
case class CC_C(a: T_A[T_A[Char, Byte], Boolean], b: Byte) extends T_A[CC_B[CC_A[Boolean]], ((Char,Boolean),T_A[Byte, Int])]

val v_a: T_A[CC_B[CC_A[Boolean]], ((Char,Boolean),T_A[Byte, Int])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_B(CC_A())) => 1 
  case CC_C(_, _) => 2 
}
}