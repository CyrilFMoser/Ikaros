package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Int, b: (Byte,Char)) extends T_A[Boolean]
case class CC_B(a: CC_A, b: T_B, c: Int) extends T_B
case class CC_C(a: T_A[CC_A], b: T_A[Int], c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, (_,_)), CC_B(CC_A(_, _), _, _), _) => 0 
  case CC_B(CC_A(_, (_,_)), CC_C(_, _, CC_B(_, _, _)), _) => 1 
  case CC_B(CC_A(_, (_,_)), CC_C(_, _, CC_C(_, _, _)), _) => 2 
  case CC_C(_, _, _) => 3 
}
}