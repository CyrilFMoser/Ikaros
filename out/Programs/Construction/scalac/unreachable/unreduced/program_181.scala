package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[Byte, C]], b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B(a: CC_A[T_A[Char, Char]], b: CC_A[CC_A[Int]]) extends T_A[T_A[CC_A[T_A[Boolean, Char]], T_A[CC_A[T_A[Boolean, Char]], CC_A[T_A[Boolean, Char]]]], CC_A[T_A[Boolean, Char]]]

val v_a: T_A[T_A[CC_A[T_A[Boolean, Char]], T_A[CC_A[T_A[Boolean, Char]], CC_A[T_A[Boolean, Char]]]], CC_A[T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}