package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Int], Byte], b: T_A[T_A[Byte, (Char,Char)], T_A[Char, Int]]) extends T_A[T_A[T_A[Boolean, Char], T_A[Int, Byte]], T_A[Boolean, T_A[Char, Int]]]
case class CC_B(a: Boolean, b: T_A[CC_A, T_A[CC_A, Byte]]) extends T_A[T_A[T_A[Boolean, Char], T_A[Int, Byte]], T_A[Boolean, T_A[Char, Int]]]
case class CC_C(a: (CC_B,CC_A), b: CC_B) extends T_A[T_A[T_A[Boolean, Char], T_A[Int, Byte]], T_A[Boolean, T_A[Char, Int]]]

val v_a: T_A[T_A[T_A[Boolean, Char], T_A[Int, Byte]], T_A[Boolean, T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_B(true, _) => 0 
  case CC_B(false, _) => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: CC_A(_, _)