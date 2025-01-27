package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Char, Int], b: T_A, c: (T_A,T_A)) extends T_A
case class CC_B(a: T_A, b: Char) extends T_A
case class CC_C(a: Byte, b: Int, c: T_A) extends T_B[Boolean, T_A]
case class CC_D(a: CC_A) extends T_B[Boolean, T_A]
case class CC_E() extends T_B[Boolean, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B(CC_A(_, _, _), 'x') => 1 
  case CC_B(CC_B(_, _), 'x') => 2 
  case CC_B(CC_A(_, _, _), _) => 3 
  case CC_B(CC_B(_, _), _) => 4 
}
}