package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[Char], c: (T_A[Char],T_A[Boolean])) extends T_A[Boolean]
case class CC_B() extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, (_,_)), _, (_,CC_A(_, _, _))) => 0 
  case CC_A(CC_A(CC_A(_, _, _), _, (_,_)), _, (_,CC_B())) => 1 
  case CC_A(CC_A(CC_B(), _, (_,_)), _, (_,CC_A(_, _, _))) => 2 
  case CC_A(CC_A(CC_B(), _, (_,_)), _, (_,CC_B())) => 3 
  case CC_A(CC_B(), _, (_,CC_A(_, _, _))) => 4 
  case CC_A(CC_B(), _, (_,CC_B())) => 5 
  case CC_B() => 6 
}
}