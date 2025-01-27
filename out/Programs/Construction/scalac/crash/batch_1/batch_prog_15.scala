package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[T_A[Char, Byte]], D]
case class CC_B[E]() extends T_A[T_B[T_A[Char, Byte]], E]
case class CC_C(a: T_B[(Int,Int)], b: CC_B[T_B[Int]], c: Int) extends T_A[T_B[T_A[Char, Byte]], T_B[T_A[Char, Byte]]]

val v_a: T_A[T_B[T_A[Char, Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: CC_B()