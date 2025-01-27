package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[(Int,Char)], b: Byte, c: B) extends T_A[B]
case class CC_B[C](a: CC_A[C], b: T_A[C], c: T_A[C]) extends T_A[C]
case class CC_C[D](a: Int) extends T_A[D]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_C(_), _, _) => 1 
}
}
// This is not matched: CC_A(CC_B(_, _, _), _, _)