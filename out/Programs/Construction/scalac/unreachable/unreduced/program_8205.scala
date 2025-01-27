package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int, b: T_A[T_A[Char, Char], T_A[Boolean, (Char,Char)]]) extends T_A[T_A[Int, T_A[Char, Int]], T_A[T_A[Char, Int], T_A[Char, Char]]]
case class CC_B[C](a: C, b: Char, c: T_A[T_A[(CC_A,CC_A), (CC_A,CC_A)], Byte]) extends T_A[C, Byte]
case class CC_C(a: CC_A, b: CC_B[CC_A], c: CC_B[CC_A]) extends T_A[T_A[Int, T_A[Char, Int]], T_A[T_A[Char, Int], T_A[Char, Char]]]

val v_a: T_A[T_A[Int, T_A[Char, Int]], T_A[T_A[Char, Int], T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
  case CC_A(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}