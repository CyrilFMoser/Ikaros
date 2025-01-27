package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Char]
case class CC_B(a: (CC_A,T_A[Char]), b: Boolean) extends T_A[Char]
case class CC_C(a: T_A[CC_B], b: CC_B, c: CC_B) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),CC_A()), _) => 1 
  case CC_B((CC_A(),CC_C(_, _, _)), _) => 2 
  case CC_C(_, _, CC_B(_, true)) => 3 
  case CC_C(_, _, CC_B(_, false)) => 4 
}
}
// This is not matched: CC_B((CC_A(),CC_B(_, _)), _)