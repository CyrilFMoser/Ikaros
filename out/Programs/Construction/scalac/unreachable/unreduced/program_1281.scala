package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[(Int,Char)], T_A[Int, (Byte,Boolean)]]) extends T_A[(T_A[Int, Boolean],(Boolean,Int)), Char]
case class CC_B[D](a: T_B[D], b: T_A[D, D], c: T_A[D, D]) extends T_B[D]
case class CC_C[E](a: E) extends T_B[E]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(_), _, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(CC_B(_, _, _), _, _)