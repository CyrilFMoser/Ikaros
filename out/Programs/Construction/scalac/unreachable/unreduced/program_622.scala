package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Int], b: Byte) extends T_A[C, Char]
case class CC_B[D]() extends T_A[D, Char]
case class CC_C[E](a: E) extends T_A[E, Char]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B()