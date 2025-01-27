package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C, c: T_A[C, C]) extends T_A[T_A[T_A[Int, Char], Byte], C]
case class CC_B() extends T_A[T_A[T_A[Int, Char], Byte], T_A[Boolean, CC_A[Byte]]]
case class CC_C(a: T_A[CC_B, Int], b: (Byte,T_A[Char, CC_B]), c: T_A[T_A[CC_B, CC_B], CC_A[CC_B]]) extends T_A[T_A[T_A[Int, Char], Byte], T_A[Boolean, CC_A[Byte]]]

val v_a: T_A[T_A[T_A[Int, Char], Byte], T_A[Boolean, CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}