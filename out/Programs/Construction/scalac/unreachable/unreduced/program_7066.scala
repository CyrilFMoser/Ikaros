package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[C, ((Boolean,Boolean),T_A[Int, Boolean])]
case class CC_B[D](a: CC_A[D]) extends T_A[D, ((Boolean,Boolean),T_A[Int, Boolean])]
case class CC_C[E](a: Boolean) extends T_A[E, ((Boolean,Boolean),T_A[Int, Boolean])]

val v_a: T_A[Char, ((Boolean,Boolean),T_A[Int, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}