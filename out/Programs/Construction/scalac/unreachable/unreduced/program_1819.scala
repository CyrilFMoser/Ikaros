package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_A[Boolean, Int],T_B[Boolean])) extends T_A[D, T_A[T_A[D, D], D]]
case class CC_B(a: CC_A[((Char,Char),Char)], b: CC_A[CC_A[Byte]]) extends T_A[T_A[T_A[Char, Int], CC_A[Byte]], T_A[T_A[T_A[T_A[Char, Int], CC_A[Byte]], T_A[T_A[Char, Int], CC_A[Byte]]], T_A[T_A[Char, Int], CC_A[Byte]]]]
case class CC_C[E](a: T_A[E, Byte], b: T_A[T_B[T_A[CC_B, CC_B]], Byte]) extends T_A[E, Byte]
case class CC_D(a: CC_A[Byte], b: CC_A[Byte], c: T_A[T_B[CC_B], Byte]) extends T_B[T_B[T_A[Int, CC_B]]]

val v_a: T_A[T_A[T_A[Char, Int], CC_A[Byte]], T_A[T_A[T_A[T_A[Char, Int], CC_A[Byte]], T_A[T_A[Char, Int], CC_A[Byte]]], T_A[T_A[Char, Int], CC_A[Byte]]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, CC_A(_)) => 1 
}
}