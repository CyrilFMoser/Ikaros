package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[C, C]) extends T_A[T_A[T_A[Int, Char], T_A[Boolean, Byte]], C]
case class CC_B[D](a: D) extends T_A[T_A[T_A[Int, Char], T_A[Boolean, Byte]], D]

val v_a: T_A[T_A[T_A[Int, Char], T_A[Boolean, Byte]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, true, _) => 0 
  case CC_A(_, false, _) => 1 
  case CC_B(_) => 2 
}
}