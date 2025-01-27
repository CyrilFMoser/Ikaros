package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Byte], b: T_B[T_B[Char]], c: T_A[(Int,Boolean)]) extends T_A[T_A[T_B[(Boolean,Boolean)]]]
case class CC_B[C](a: T_B[C], b: T_B[C], c: T_A[C]) extends T_B[C]
case class CC_C[D](a: Byte, b: Byte) extends T_B[D]

val v_a: T_B[T_A[T_A[T_B[(Boolean,Boolean)]]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(CC_B(_, _, _), CC_B(_, _, _), _), _) => 0 
  case CC_B(_, CC_B(CC_B(_, _, _), CC_C(_, _), _), _) => 1 
  case CC_B(_, CC_B(CC_C(_, _), CC_B(_, _, _), _), _) => 2 
  case CC_B(_, CC_B(CC_C(_, _), CC_C(_, _), _), _) => 3 
  case CC_B(_, CC_C(_, _), _) => 4 
  case CC_C(_, _) => 5 
}
}