package Program_14 

package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E, G]() extends T_A[E, F]
case class CC_B[H](a: CC_A[H, H, H]) extends T_A[(Boolean,Boolean), H]
case class CC_C(a: Int) extends T_A[(Boolean,Boolean), CC_A[Boolean, Char, (Byte,Boolean)]]
case class CC_D(a: CC_B[CC_C], b: CC_C, c: (CC_C,Byte)) extends T_B[T_A[Byte, CC_C], CC_C]
case class CC_E(a: Char, b: (CC_D,CC_D), c: CC_C) extends T_B[T_A[Byte, CC_C], CC_C]
case class CC_F(a: CC_A[Int, CC_D, Byte]) extends T_B[T_A[Byte, CC_C], CC_C]

val v_a: T_A[CC_D, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Char
//      (CC_D Boolean Boolean (T_A Boolean Boolean) Boolean)
//      Boolean
//      (T_A (CC_D Boolean Boolean (T_A Boolean Boolean) Boolean) Char))
// This is not matched: (CC_A Char
//      (CC_D Boolean Boolean (T_A Boolean Boolean) Boolean)
//      Boolean
//      (T_A (CC_D Boolean Boolean (T_A Boolean Boolean) Boolean) Char))