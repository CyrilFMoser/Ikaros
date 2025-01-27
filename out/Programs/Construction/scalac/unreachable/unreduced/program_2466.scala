package Program_23 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[Char], b: B) extends T_A[Char]
case class CC_B(a: T_A[Int], b: CC_A[(Char,Int)]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _), _), _) => 1 
  case CC_A(CC_B(_, CC_A(_, _)), _) => 2 
  case CC_B(_, _) => 3 
}
}