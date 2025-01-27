package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, T_B[(Byte,Int), T_A]]) extends T_A
case class CC_B[C](a: T_A) extends T_B[C, Char]
case class CC_C(a: (T_B[CC_A, T_A],CC_A), b: T_B[CC_B[CC_A], T_B[CC_A, Char]], c: (T_B[T_A, Char],T_B[CC_A, Char])) extends T_B[T_A, Char]
case class CC_D() extends T_B[T_A, Char]

val v_a: T_B[T_A, Char] = null
val v_b: Int = v_a match{
  case CC_C((_,CC_A(_, _)), _, (CC_B(_),CC_B(_))) => 0 
  case CC_C((_,CC_A(_, _)), _, (CC_C(_, _, _),CC_B(_))) => 1 
  case CC_C((_,CC_A(_, _)), _, (CC_D(),CC_B(_))) => 2 
  case CC_D() => 3 
}
}
// This is not matched: CC_B(CC_A(CC_A(_, _), _))