package Program_23 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char]) extends T_A[Char]
case class CC_B(a: (T_A[Char],T_A[CC_A])) extends T_A[Char]
case class CC_C() extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_)) => 1 
  case CC_A(CC_C()) => 2 
  case CC_B((_,_)) => 3 
  case CC_C() => 4 
}
}