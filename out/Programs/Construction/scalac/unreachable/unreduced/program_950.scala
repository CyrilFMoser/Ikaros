package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[((Char,Boolean),Char)], b: T_A[Boolean]) extends T_A[Boolean]
case class CC_B() extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B()) => 1 
  case CC_B() => 2 
}
}