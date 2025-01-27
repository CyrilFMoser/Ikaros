package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Char, Byte],T_A[Boolean, Char]), b: Char, c: T_A[C, (Byte,Int)]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: Char) extends T_A[T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]], D]
case class CC_C[E](a: T_A[E, E], b: CC_A[E]) extends T_A[T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]], E]

val v_a: T_A[T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _) => 1 
}
}