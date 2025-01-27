package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[T_B[T_B[Byte, Boolean], T_A[Byte]]]
case class CC_B(a: T_B[CC_A[Char], T_B[Char, (Boolean,Char)]]) extends T_A[T_B[T_B[Byte, Boolean], T_A[Byte]]]
case class CC_C(a: T_A[T_A[CC_B]]) extends T_A[T_B[T_B[Byte, Boolean], T_A[Byte]]]
case class CC_D[E, F](a: (T_B[CC_C, CC_B],(Boolean,CC_B))) extends T_B[E, F]
case class CC_E[G, H]() extends T_B[G, H]
case class CC_F(a: T_B[(CC_C,CC_B), CC_C], b: CC_C) extends T_B[CC_C, T_A[T_B[Byte, CC_B]]]

val v_a: T_A[T_B[T_B[Byte, Boolean], T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_D((_,_))) => 0 
  case CC_B(CC_E()) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_A()