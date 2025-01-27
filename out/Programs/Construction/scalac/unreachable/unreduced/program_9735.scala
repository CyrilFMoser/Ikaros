package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean) extends T_A
case class CC_B[C](a: T_B[C, C], b: CC_A, c: Byte) extends T_B[T_A, C]
case class CC_C[D](a: CC_A, b: T_B[T_A, D], c: T_B[T_A, D]) extends T_B[T_A, D]

val v_a: T_B[T_A, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_), 0) => 0 
  case CC_B(_, CC_A(_), _) => 1 
  case CC_C(_, _, CC_B(_, _, _)) => 2 
  case CC_C(_, _, CC_C(CC_A(_), CC_B(_, _, _), CC_B(_, _, _))) => 3 
  case CC_C(_, _, CC_C(CC_A(_), CC_C(_, _, _), CC_B(_, _, _))) => 4 
  case CC_C(_, _, CC_C(CC_A(_), CC_B(_, _, _), CC_C(_, _, _))) => 5 
  case CC_C(_, _, CC_C(CC_A(_), CC_C(_, _, _), CC_C(_, _, _))) => 6 
}
}