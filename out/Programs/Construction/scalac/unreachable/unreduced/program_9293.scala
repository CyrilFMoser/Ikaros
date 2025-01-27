package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[C, T_B]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, T_B]
case class CC_C(a: CC_B[Char]) extends T_B
case class CC_D[E]() extends T_B
case class CC_E(a: CC_D[CC_C], b: (Int,CC_C), c: (T_A[Byte, T_B],CC_A[T_B])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_D(), (_,CC_C(_)), (CC_A(_),CC_A(_))) => 1 
  case CC_E(CC_D(), (_,CC_C(_)), (CC_B(_),CC_A(_))) => 2 
}
}
// This is not matched: CC_C(_)