package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Byte, b: T_B) extends T_A[C, (T_A[T_B, T_B],T_A[T_B, (Int,Int)])]
case class CC_B[D](a: Char, b: T_A[D, D]) extends T_A[D, (T_A[T_B, T_B],T_A[T_B, (Int,Int)])]
case class CC_C(a: Byte, b: T_B, c: CC_A[T_A[Byte, (Boolean,Int)]]) extends T_B
case class CC_D[E](a: E, b: E, c: Boolean) extends T_B
case class CC_E(a: CC_B[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(CC_B(_, _)) => 1 
}
}
// This is not matched: CC_C(_, _, _)