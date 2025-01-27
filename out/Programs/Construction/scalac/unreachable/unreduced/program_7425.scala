package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C]() extends T_A
case class CC_B(a: (Char,T_B[(Byte,Boolean), T_A]), b: T_A) extends T_A
case class CC_C(a: T_B[Boolean, CC_A[CC_B]], b: T_A) extends T_A
case class CC_D[D](a: CC_C, b: T_A, c: Char) extends T_B[D, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}