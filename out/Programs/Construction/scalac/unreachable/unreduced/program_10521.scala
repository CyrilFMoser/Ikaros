package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Char], b: T_A[T_B], c: T_B) extends T_A[Char]
case class CC_B(a: Int) extends T_A[Char]
case class CC_C() extends T_A[Char]
case class CC_D() extends T_B

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, CC_D()), _, _) => 0 
  case CC_A(CC_A(CC_B(_), _, CC_D()), _, _) => 1 
  case CC_A(CC_A(CC_C(), _, CC_D()), _, _) => 2 
  case CC_A(CC_C(), _, _) => 3 
  case CC_B(_) => 4 
  case CC_C() => 5 
}
}
// This is not matched: CC_A(CC_B(_), _, _)