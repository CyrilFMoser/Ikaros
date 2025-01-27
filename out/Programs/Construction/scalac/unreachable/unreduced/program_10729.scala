package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[Char, T_A[T_A[Boolean, Int], T_A[Boolean, Byte]]]
case class CC_B(a: T_A[Boolean, CC_A], b: Boolean) extends T_A[Char, T_A[T_A[Boolean, Int], T_A[Boolean, Byte]]]
case class CC_C(a: T_A[CC_B, CC_A], b: Byte, c: T_A[CC_B, T_A[CC_B, (Byte,Boolean)]]) extends T_A[Char, T_A[T_A[Boolean, Int], T_A[Boolean, Byte]]]

val v_a: T_A[Char, T_A[T_A[Boolean, Int], T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}