package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, (T_A[Char, Char],Int)]
case class CC_B[D](a: D) extends T_A[D, T_A[CC_A[Int], T_A[(Boolean,Boolean), Int]]]
case class CC_C[E](a: Char, b: E) extends T_A[E, (T_A[Char, Char],Int)]

val v_a: T_A[Int, (T_A[Char, Char],Int)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _) => 1 
}
}