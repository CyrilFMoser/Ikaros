package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B[C](a: Boolean, b: C, c: T_B[C, C]) extends T_B[T_A, C]
case class CC_C[D](a: CC_A, b: T_A, c: (T_B[T_A, CC_A],T_A)) extends T_B[T_A, D]

val v_a: T_B[T_A, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_A(CC_A(_)), CC_A(CC_A(_)), (CC_B(_, _, _),CC_A(_))) => 1 
  case CC_C(CC_A(CC_A(_)), CC_A(CC_A(_)), (CC_C(_, _, _),CC_A(_))) => 2 
}
}