package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int) extends T_A[T_A[T_A[Int, Char], T_A[(Byte,Char), Byte]], C]
case class CC_B[D](a: CC_A[D], b: CC_A[D], c: T_A[D, D]) extends T_A[T_A[T_A[Int, Char], T_A[(Byte,Char), Byte]], D]

val v_a: T_A[T_A[T_A[Int, Char], T_A[(Byte,Char), Byte]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), _) => 1 
}
}