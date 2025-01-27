package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[T_B[Char]]]
case class CC_B[E](a: T_A[E, E]) extends T_A[E, T_B[T_B[Char]]]
case class CC_C(a: Byte, b: (T_A[Int, Char],Char), c: Char) extends T_B[Byte]

val v_a: T_A[Int, T_B[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}