package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: Char) extends T_A
case class CC_B(a: (Int,CC_A)) extends T_A
case class CC_C(a: T_B[Boolean]) extends T_A
case class CC_D[B](a: CC_A, b: B) extends T_B[(Int,Boolean)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_), _), _) => 1 
  case CC_A(CC_A(CC_C(_), _), _) => 2 
  case CC_A(CC_B((_,_)), _) => 3 
  case CC_A(CC_C(_), _) => 4 
  case CC_B((_,CC_A(_, _))) => 5 
  case CC_C(_) => 6 
}
}