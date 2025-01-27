package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Int, b: T_A[T_B[(Int,Char)], (Boolean,(Char,Int))]) extends T_A[Char, Byte]
case class CC_B[D](a: T_A[Char, Byte], b: Int) extends T_B[D]
case class CC_C[E](a: T_B[E], b: E, c: E) extends T_B[E]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _) => 0 
  case CC_C(_, true, _) => 1 
  case CC_C(_, false, _) => 2 
}
}