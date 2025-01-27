package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[((Char,Boolean),Byte)]) extends T_A[Boolean]
case class CC_B(a: (T_A[Boolean],CC_A), b: T_A[Boolean]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _), _), _) => 1 
  case CC_A(CC_B(_, _), _) => 2 
  case CC_B(_, _) => 3 
}
}