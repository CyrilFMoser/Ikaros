package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Boolean, Char], b: T_A[Boolean, Char], c: T_A[T_A[Boolean, Char], T_A[Int, Boolean]]) extends T_A[Boolean, Char]
case class CC_B() extends T_A[Boolean, Char]
case class CC_C(a: Int, b: CC_B) extends T_A[Boolean, Char]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(), _, _) => 1 
  case CC_A(CC_C(_, _), _, _) => 2 
  case CC_C(_, _) => 3 
}
}
// This is not matched: CC_B()