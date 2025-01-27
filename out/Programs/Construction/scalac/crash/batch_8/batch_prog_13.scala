package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B]() extends T_A
case class CC_B(a: CC_A[(Char,(Int,Boolean))], b: T_A, c: T_B[T_B[T_A]]) extends T_A
case class CC_C(a: CC_B, b: (T_B[CC_B],CC_A[T_A]), c: Boolean) extends T_B[CC_B]
case class CC_D(a: T_B[T_A]) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_A(), _, _), (CC_C(_, _, _),CC_A()), _) => 0 
  case CC_C(CC_B(CC_A(), _, _), (CC_D(_),CC_A()), _) => 1 
  case CC_D(_) => 2 
}
}