package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D], c: T_A[D]) extends T_A[D]
case class CC_B(a: CC_A[T_B[Char, Byte]], b: (Int,CC_A[Boolean]), c: T_B[T_A[Byte], Boolean]) extends T_A[CC_A[T_A[(Char,Boolean)]]]
case class CC_C() extends T_A[CC_A[T_A[(Char,Boolean)]]]
case class CC_D[E](a: T_A[E], b: E, c: E) extends T_B[E, T_A[E]]

val v_a: T_A[CC_A[T_A[(Char,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _, _)