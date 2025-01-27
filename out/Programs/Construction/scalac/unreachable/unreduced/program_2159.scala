package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_A[Char],T_B[Boolean])) extends T_A[T_B[(Byte,Int)]]
case class CC_B(a: CC_A, b: (Byte,((Int,Int),CC_A))) extends T_B[CC_A]
case class CC_C() extends T_B[CC_A]
case class CC_D(a: CC_B) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A((_,_)), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_D(CC_B(_, _))