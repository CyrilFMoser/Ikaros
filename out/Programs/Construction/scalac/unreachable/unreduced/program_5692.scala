package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_B], b: T_B) extends T_A[C, T_B]
case class CC_B(a: (CC_A[T_B],T_A[Char, T_B]), b: T_A[T_B, T_B]) extends T_B
case class CC_C(a: CC_B, b: T_A[Char, T_A[CC_B, Int]]) extends T_B
case class CC_D(a: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B((CC_A(_, _),CC_A(_, _)), CC_A(CC_A(_, _), CC_B(_, _))) => 0 
  case CC_B((CC_A(_, _),CC_A(_, _)), CC_A(CC_A(_, _), CC_C(_, _))) => 1 
  case CC_B((CC_A(_, _),CC_A(_, _)), CC_A(CC_A(_, _), CC_D(_))) => 2 
  case CC_C(_, _) => 3 
  case CC_D(_) => 4 
}
}