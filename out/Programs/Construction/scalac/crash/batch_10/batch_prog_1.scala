package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_A[D, D]], b: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_B[E]() extends T_A[E, T_A[E, E]]
case class CC_C(a: (T_A[Int, Char],Char), b: CC_A[Boolean], c: Byte) extends T_A[T_A[T_B[Byte], T_A[T_B[Byte], T_B[Byte]]], T_A[T_A[T_B[Byte], T_A[T_B[Byte], T_B[Byte]]], T_A[T_B[Byte], T_A[T_B[Byte], T_B[Byte]]]]]
case class CC_D(a: (CC_B[CC_C],CC_C)) extends T_B[T_A[Char, T_A[Char, Char]]]

val v_a: CC_B[T_B[T_A[Char, T_A[Char, Char]]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}