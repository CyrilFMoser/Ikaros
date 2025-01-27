package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: T_B[T_B[T_A]], c: (T_A,T_A)) extends T_A
case class CC_B(a: CC_A, b: (Byte,Boolean), c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: Char) extends T_B[CC_A]
case class CC_E() extends T_B[CC_A]
case class CC_F(a: CC_C, b: CC_A, c: CC_E) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, (_,_), _) => 1 
}
}
// This is not matched: CC_C()