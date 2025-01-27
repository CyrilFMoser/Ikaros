package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B(a: Byte, b: (CC_A,T_B[Char, (Int,Byte)]), c: CC_A) extends T_A
case class CC_C[C](a: T_B[C, C]) extends T_B[CC_B, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(0, (_,_), _), _) => 1 
  case CC_A(_, CC_B(_, (_,_), _), _) => 2 
  case CC_B(_, _, _) => 3 
}
}