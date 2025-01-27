package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[C, T_A[T_B, Byte]]
case class CC_B(a: T_A[T_A[T_B, Char], T_A[T_B, T_B]], b: Char) extends T_B
case class CC_C[D](a: CC_A[D], b: T_B, c: D) extends T_B

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_B(_, _)), _, 12) => 0 
  case CC_C(CC_A(CC_C(_, _, _)), _, 12) => 1 
  case CC_C(CC_A(CC_C(_, _, _)), _, _) => 2 
}
}
// This is not matched: CC_C(CC_A(CC_B(_, _)), _, _)