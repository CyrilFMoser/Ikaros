package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Char]
case class CC_B(a: T_A[Char], b: T_A[Boolean], c: CC_A) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, CC_A()) => 1 
  case CC_B(CC_B(CC_A(), _, CC_A()), _, CC_A()) => 2 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_A()), _, CC_A()) => 3 
}
}