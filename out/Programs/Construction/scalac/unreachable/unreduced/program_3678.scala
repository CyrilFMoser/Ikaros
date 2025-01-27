package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: (T_A[T_B],T_A[T_B]), b: T_A[T_B], c: T_A[CC_A]) extends T_A[T_B]
case class CC_C() extends T_A[T_B]
case class CC_D() extends T_B
case class CC_E() extends T_B
case class CC_F() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),CC_A()), _, _) => 1 
  case CC_B((CC_A(),CC_B(_, _, _)), _, _) => 2 
  case CC_B((CC_B(_, _, _),CC_A()), _, _) => 3 
  case CC_B((CC_B(_, _, _),CC_B(_, _, _)), _, _) => 4 
  case CC_B((CC_B(_, _, _),CC_C()), _, _) => 5 
  case CC_B((CC_C(),CC_A()), _, _) => 6 
  case CC_B((CC_C(),CC_B(_, _, _)), _, _) => 7 
  case CC_B((CC_C(),CC_C()), _, _) => 8 
  case CC_C() => 9 
}
}
// This is not matched: CC_B((CC_A(),CC_C()), _, _)