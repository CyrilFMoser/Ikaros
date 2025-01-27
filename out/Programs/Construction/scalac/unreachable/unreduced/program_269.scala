package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Boolean, Char], b: Char, c: T_A[T_A[Char, Int], T_A[Boolean, Char]]) extends T_A[Boolean, Char]
case class CC_B(a: CC_A, b: CC_A) extends T_A[Boolean, Char]
case class CC_C(a: Char) extends T_A[Boolean, Char]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(_, _), _, _) => 1 
  case CC_A(CC_C(_), _, _) => 2 
  case CC_B(_, CC_A(_, _, _)) => 3 
  case CC_C(_) => 4 
}
}