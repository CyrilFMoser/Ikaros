package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: T_A, c: T_A) extends T_A
case class CC_B(a: CC_A, b: (T_B[(Char,Byte), T_A],Boolean)) extends T_A
case class CC_C(a: T_A, b: (Boolean,T_A), c: T_B[CC_B, T_B[CC_B, CC_B]]) extends T_B[CC_B, T_B[CC_B, CC_B]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(CC_A(_, _, _), (_,_))) => 1 
}
}