package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E, G]() extends T_A[E, F]
case class CC_B[H](a: T_B[H, H]) extends T_B[Boolean, H]
case class CC_C() extends T_B[Boolean, T_A[T_B[Byte, Int], T_A[(Boolean,Boolean), Char]]]
case class CC_D(a: T_A[T_A[CC_C, CC_C], T_A[CC_C, CC_C]], b: T_B[(Boolean,Byte), T_A[CC_C, CC_C]]) extends T_B[Boolean, T_B[Boolean, T_A[Byte, CC_C]]]

val v_a: T_B[Boolean, T_A[T_B[Byte, Int], T_A[(Boolean,Boolean), Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}