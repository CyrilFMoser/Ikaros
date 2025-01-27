package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Boolean, Char], b: Byte, c: T_A[T_A[Int, Byte], T_A[Boolean, Byte]]) extends T_A[T_A[T_A[Byte, Char], T_A[Char, (Byte,Boolean)]], T_A[T_A[Byte, Int], T_A[Char, Int]]]
case class CC_B[C]() extends T_A[CC_A, C]
case class CC_C(a: CC_B[(Byte,CC_A)], b: CC_B[Boolean]) extends T_A[T_A[T_A[Byte, Char], T_A[Char, (Byte,Boolean)]], T_A[T_A[Byte, Int], T_A[Char, Int]]]

val v_a: T_A[T_A[T_A[Byte, Char], T_A[Char, (Byte,Boolean)]], T_A[T_A[Byte, Int], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}