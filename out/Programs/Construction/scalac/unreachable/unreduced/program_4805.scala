package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_B[T_B[T_A, T_A], (Boolean,T_A)]) extends T_A
case class CC_C[C](a: T_B[C, C]) extends T_A
case class CC_D[D](a: T_B[D, D]) extends T_B[Byte, D]
case class CC_E(a: CC_A) extends T_B[Byte, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_B(CC_B(CC_A(), _), _) => 2 
  case CC_B(CC_B(CC_B(_, _), _), _) => 3 
  case CC_B(CC_B(CC_C(_), _), _) => 4 
  case CC_B(CC_C(_), _) => 5 
  case CC_C(_) => 6 
}
}