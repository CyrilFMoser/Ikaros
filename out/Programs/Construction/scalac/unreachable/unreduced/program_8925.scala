package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_A[(Boolean,Int), Char], T_B[Byte]], b: T_B[Int]) extends T_A[T_B[T_B[Byte]], Int]
case class CC_B[D](a: D) extends T_A[D, Char]
case class CC_C[E](a: T_B[E]) extends T_B[E]
case class CC_D(a: T_A[T_A[CC_A, Int], Char], b: CC_C[CC_B[Boolean]], c: T_B[T_A[CC_A, Char]]) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
  case CC_C(CC_D(CC_B(_), CC_C(_), CC_C(_))) => 1 
  case CC_D(_, _, CC_C(CC_C(_))) => 2 
}
}