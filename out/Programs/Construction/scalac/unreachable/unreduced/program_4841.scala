package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[Byte, C], b: T_B, c: T_A[T_B, C]) extends T_A[Byte, C]
case class CC_B(a: Int, b: Boolean, c: T_A[Byte, T_A[Byte, Byte]]) extends T_A[Byte, T_A[Byte, T_A[T_B, T_B]]]
case class CC_C[D](a: T_A[Byte, D], b: CC_B) extends T_A[Byte, D]
case class CC_D() extends T_B
case class CC_E(a: Char, b: (T_A[Byte, T_B],T_A[Byte, (Char,Byte)]), c: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, (CC_A(_, _, _),CC_A(_, _, _)), 'x') => 1 
  case CC_E(_, (CC_A(_, _, _),CC_C(_, _)), 'x') => 2 
  case CC_E(_, (CC_C(_, _),CC_A(_, _, _)), 'x') => 3 
  case CC_E(_, (CC_C(_, _),CC_C(_, _)), 'x') => 4 
  case CC_E(_, (CC_A(_, _, _),CC_A(_, _, _)), _) => 5 
  case CC_E(_, (CC_A(_, _, _),CC_C(_, _)), _) => 6 
  case CC_E(_, (CC_C(_, _),CC_A(_, _, _)), _) => 7 
  case CC_E(_, (CC_C(_, _),CC_C(_, _)), _) => 8 
}
}