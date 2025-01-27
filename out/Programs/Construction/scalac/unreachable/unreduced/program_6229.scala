package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: Byte) extends T_A
case class CC_B(a: T_B[CC_A], b: T_B[T_A], c: (Int,T_A)) extends T_A
case class CC_C() extends T_B[(CC_B,T_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _), _) => 1 
  case CC_A(CC_B(_, _, _), _) => 2 
  case CC_B(_, _, _) => 3 
}
}