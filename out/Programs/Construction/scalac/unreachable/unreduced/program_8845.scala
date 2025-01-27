package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: Byte, b: E, c: T_A[E, F]) extends T_A[E, F]
case class CC_B(a: T_A[Int, T_A[Byte, Byte]]) extends T_A[T_B[T_B[Byte, (Byte,Boolean)], T_A[Char, Boolean]], CC_A[T_A[Char, Char], T_B[Char, Boolean]]]
case class CC_C(a: CC_A[T_A[CC_B, (Char,Byte)], Boolean]) extends T_A[T_B[T_B[Byte, (Byte,Boolean)], T_A[Char, Boolean]], CC_A[T_A[Char, Char], T_B[Char, Boolean]]]
case class CC_D[G](a: T_A[G, G]) extends T_B[G, CC_B]
case class CC_E(a: T_B[(CC_B,CC_B), (CC_C,CC_C)], b: CC_A[CC_B, T_B[CC_B, CC_B]]) extends T_B[CC_C, CC_B]

val v_a: T_A[T_B[T_B[Byte, (Byte,Boolean)], T_A[Char, Boolean]], CC_A[T_A[Char, Char], T_B[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(CC_A(_, _, CC_A(_, _, _)))