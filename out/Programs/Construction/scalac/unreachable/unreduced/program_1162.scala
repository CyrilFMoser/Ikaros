package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_B[E, E]) extends T_A[E]
case class CC_C(a: T_A[T_A[Byte]]) extends T_A[Char]
case class CC_D(a: (CC_C,Int), b: T_B[Char, CC_C]) extends T_B[T_A[T_B[CC_C, CC_C]], (CC_C,CC_A[CC_C])]
case class CC_E(a: T_A[Char], b: T_A[Int], c: T_A[T_A[CC_C]]) extends T_B[T_A[T_B[CC_C, CC_C]], (CC_C,CC_A[CC_C])]

val v_a: T_B[T_A[T_B[CC_C, CC_C]], (CC_C,CC_A[CC_C])] = null
val v_b: Int = v_a match{
  case CC_D((_,_), _) => 0 
  case CC_E(_, _, _) => 1 
}
}