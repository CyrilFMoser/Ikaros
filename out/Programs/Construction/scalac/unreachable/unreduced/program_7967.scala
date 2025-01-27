package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[Char, CC_A[Int]], b: T_A[Byte, T_A[Byte, Byte]], c: CC_A[CC_A[Int]]) extends T_A[T_A[T_A[Boolean, Char], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]], CC_A[CC_A[Byte]]]
case class CC_C() extends T_A[T_A[T_A[Boolean, Char], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]], CC_A[CC_A[Byte]]]

val v_a: T_A[T_A[T_A[Boolean, Char], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]], CC_A[CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_C() => 1 
}
}