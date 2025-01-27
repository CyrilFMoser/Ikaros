package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: (T_B[Int, T_A],T_B[Byte, T_A])) extends T_A
case class CC_B(a: T_B[CC_A, T_A], b: CC_A, c: Int) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[CC_C, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _, _)