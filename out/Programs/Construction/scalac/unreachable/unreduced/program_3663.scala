package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[(Int,Boolean)]], b: T_B[(Int,Boolean)]) extends T_A[(Char,T_A[Byte])]
case class CC_B(a: Boolean, b: T_B[T_A[Byte]]) extends T_A[(Char,T_A[Byte])]
case class CC_C(a: Boolean) extends T_B[T_B[(CC_B,CC_A)]]
case class CC_D(a: CC_C, b: Boolean, c: CC_B) extends T_B[T_B[(CC_B,CC_A)]]
case class CC_E(a: T_A[CC_D], b: (CC_D,CC_D)) extends T_B[T_B[(CC_B,CC_A)]]

val v_a: T_B[T_B[(CC_B,CC_A)]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, _, CC_B(_, _)) => 1 
  case CC_E(_, (CC_D(_, _, _),CC_D(_, _, _))) => 2 
}
}