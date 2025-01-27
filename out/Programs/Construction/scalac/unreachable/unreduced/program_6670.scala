package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Byte]], b: (T_A[Byte],Boolean), c: T_A[Byte]) extends T_A[Byte]
case class CC_B(a: T_B[T_A[Byte]], b: T_B[T_A[Boolean]]) extends T_A[Byte]
case class CC_C(a: T_B[T_A[Byte]]) extends T_A[Byte]
case class CC_D(a: Int) extends T_B[CC_B]
case class CC_E[C]() extends T_B[C]
case class CC_F() extends T_B[CC_B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_E(), _) => 1 
  case CC_C(_) => 2 
}
}