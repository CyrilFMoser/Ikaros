package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: F, b: T_A[E, F]) extends T_A[E, F]
case class CC_B(a: T_B[Byte, Byte], b: T_B[T_B[Boolean, Char], Char]) extends T_A[T_A[T_B[Byte, Byte], T_A[Boolean, (Byte,Byte)]], CC_A[CC_A[Boolean, Byte], CC_A[Boolean, Boolean]]]
case class CC_C(a: T_B[T_A[CC_B, CC_B], T_A[CC_B, CC_B]], b: T_B[(CC_B,CC_B), Char]) extends T_B[Char, (T_B[CC_B, CC_B],CC_B)]
case class CC_D(a: CC_C, b: CC_C, c: T_B[T_B[CC_C, CC_C], T_A[Int, Int]]) extends T_B[Char, (T_B[CC_B, CC_B],CC_B)]

val v_a: T_A[T_A[T_B[Byte, Byte], T_A[Boolean, (Byte,Byte)]], CC_A[CC_A[Boolean, Byte], CC_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_B(_, _) => 1 
}
}