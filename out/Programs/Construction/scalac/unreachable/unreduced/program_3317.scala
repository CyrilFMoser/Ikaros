package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_B(a: (T_A[Boolean],T_A[Boolean])) extends T_A[Boolean]
case class CC_C(a: T_A[T_A[Boolean]]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((CC_A(_),CC_A(_))) => 1 
  case CC_B((CC_A(_),CC_B(_))) => 2 
  case CC_B((CC_B(_),CC_A(_))) => 3 
  case CC_B((CC_B(_),CC_B(_))) => 4 
  case CC_B((CC_B(_),CC_C(_))) => 5 
  case CC_B((CC_C(_),CC_A(_))) => 6 
  case CC_B((CC_C(_),CC_B(_))) => 7 
  case CC_B((CC_C(_),CC_C(_))) => 8 
  case CC_C(_) => 9 
}
}
// This is not matched: CC_B((CC_A(_),CC_C(_)))