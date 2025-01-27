package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_B[T_B[T_A, T_A], T_A], c: Int) extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A
case class CC_C[C](a: T_A, b: T_B[C, C]) extends T_B[T_A, C]
case class CC_D[D]() extends T_B[T_A, D]

val v_a: T_B[T_A, T_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_C(_, _), _, _), _) => 0 
  case CC_C(CC_A(CC_D(), _, _), _) => 1 
  case CC_C(CC_B(CC_A(_, _, _), CC_A(_, _, _)), _) => 2 
  case CC_C(CC_B(CC_B(_, _), CC_A(_, _, _)), _) => 3 
  case CC_D() => 4 
}
}