package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_B,T_A[T_B]), b: T_A[T_A[T_B]]) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: CC_A, b: T_A[(CC_A,CC_A)], c: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_C[B](a: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_D() extends T_B
case class CC_E(a: T_A[CC_B], b: T_B) extends T_B
case class CC_F(a: CC_E, b: CC_C[CC_D], c: CC_C[T_A[(Byte,Boolean)]]) extends T_B

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_D()) => 2 
  case CC_C(CC_E(_, CC_D())) => 3 
  case CC_C(CC_E(_, CC_E(_, _))) => 4 
  case CC_C(CC_E(_, CC_F(_, _, _))) => 5 
  case CC_C(CC_F(_, CC_C(_), CC_C(_))) => 6 
}
}