package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Boolean, (Int,T_A)], b: (T_B[T_A, T_A],T_A), c: T_B[T_B[Char, T_A], T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: CC_A, c: CC_A) extends T_A
case class CC_D() extends T_B[Char, (CC_A,CC_B)]
case class CC_E() extends T_B[Char, (CC_A,CC_B)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _, _), _, _) => 2 
  case CC_C(CC_B(), _, _) => 3 
  case CC_C(CC_C(CC_B(), _, CC_A(_, _, _)), _, _) => 4 
  case CC_C(CC_C(CC_C(_, _, _), _, CC_A(_, _, _)), _, _) => 5 
}
}
// This is not matched: CC_C(CC_C(CC_A(_, _, _), _, CC_A(_, _, _)), _, _)