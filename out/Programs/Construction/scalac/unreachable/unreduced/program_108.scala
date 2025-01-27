package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_A[E, E], E]) extends T_A[E, T_A[T_A[Byte, Boolean], T_B[Boolean, Char]]]
case class CC_B(a: CC_A[CC_A[Byte]], b: T_B[Boolean, Byte]) extends T_B[Boolean, Byte]
case class CC_C(a: T_B[T_B[Boolean, Byte], CC_A[CC_B]], b: T_A[T_B[Boolean, Byte], Boolean]) extends T_B[Boolean, Byte]
case class CC_D() extends T_B[Boolean, Byte]

val v_a: T_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), CC_B(_, _)) => 0 
  case CC_B(CC_A(_), CC_C(_, _)) => 1 
  case CC_B(CC_A(_), CC_D()) => 2 
  case CC_C(_, _) => 3 
  case CC_D() => 4 
}
}