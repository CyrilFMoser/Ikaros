package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: (Int,T_B[(Byte,Boolean), T_A]), b: T_B[Byte, C], c: CC_B) extends T_B[Byte, C]
case class CC_E[D]() extends T_B[Byte, D]

val v_a: T_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_D((_,_), _, _) => 0 
  case CC_E() => 1 
}
}