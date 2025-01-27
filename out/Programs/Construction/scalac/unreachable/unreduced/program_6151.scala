package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_B[T_A, T_A]], b: T_A) extends T_A
case class CC_B(a: Byte) extends T_A
case class CC_C[C](a: T_B[T_A, C], b: T_B[C, C], c: CC_A) extends T_B[CC_B, C]
case class CC_D[D]() extends T_B[CC_B, D]

val v_a: T_B[CC_B, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _, _), CC_A(_, CC_A(_, _))) => 0 
  case CC_C(_, CC_D(), CC_A(_, CC_A(_, _))) => 1 
  case CC_C(_, CC_C(_, _, _), CC_A(_, CC_B(_))) => 2 
  case CC_C(_, CC_D(), CC_A(_, CC_B(_))) => 3 
  case CC_D() => 4 
}
}