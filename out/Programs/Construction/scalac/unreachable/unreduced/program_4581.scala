package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[Int, (T_B,Boolean)], b: T_A[(Int,T_B), Char], c: T_B) extends T_A[Int, (T_B,Boolean)]
case class CC_B() extends T_A[Int, (T_B,Boolean)]
case class CC_C(a: CC_A, b: T_B) extends T_B
case class CC_D() extends T_B

val v_a: T_A[Int, (T_B,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_C(CC_A(_, _, _), _)) => 0 
  case CC_A(CC_A(_, _, _), _, CC_D()) => 1 
  case CC_A(CC_B(), _, CC_C(CC_A(_, _, _), _)) => 2 
  case CC_A(CC_B(), _, CC_D()) => 3 
  case CC_B() => 4 
}
}