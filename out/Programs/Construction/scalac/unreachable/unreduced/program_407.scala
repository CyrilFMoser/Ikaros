package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: T_A[T_A[Boolean]]) extends T_A[Char]
case class CC_B(a: Int) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_), _) => 1 
  case CC_B(_) => 2 
}
}