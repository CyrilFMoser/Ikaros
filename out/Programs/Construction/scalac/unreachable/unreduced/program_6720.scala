package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D) extends T_A[D]
case class CC_B(a: CC_A[(Boolean,Boolean)], b: T_A[T_A[Int]], c: T_B[Char, CC_A[Int]]) extends T_A[T_A[T_A[Char]]]
case class CC_C[E](a: T_B[E, E]) extends T_B[CC_B, E]
case class CC_D(a: Int) extends T_B[CC_B, Int]
case class CC_E(a: (T_B[CC_B, CC_B],Boolean), b: T_A[Char]) extends T_B[CC_B, Int]

val v_a: T_B[CC_B, Int] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_E((CC_C(_),_), _) => 1 
}
}
// This is not matched: CC_D(_)