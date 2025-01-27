package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: (T_B[Char],T_B[Byte])) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: CC_A, c: Char) extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), (_,_)) => 0 
  case CC_A(CC_A(CC_B(), _), (_,_)) => 1 
  case CC_A(CC_B(), (_,_)) => 2 
  case CC_B() => 3 
}
}