package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: T_B[Byte], b: T_A, c: T_A) extends T_A
case class CC_C(a: Int) extends T_B[CC_B]
case class CC_D(a: (((Int,Int),Char),T_B[CC_B])) extends T_B[CC_B]
case class CC_E(a: Int, b: T_B[CC_A]) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D((_,_)) => 1 
  case CC_E(_, _) => 2 
}
}