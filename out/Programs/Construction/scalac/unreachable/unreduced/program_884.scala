package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_A[C, C]], c: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[(Int,Byte), T_A[(Int,Byte), (Int,Byte)]]) extends T_A[T_A[T_A[Int, Boolean], CC_A[Boolean]], T_A[T_A[T_A[Int, Boolean], CC_A[Boolean]], T_A[T_A[Int, Boolean], CC_A[Boolean]]]]
case class CC_C[D]() extends T_A[D, T_A[D, D]]

val v_a: T_A[T_A[T_A[Int, Boolean], CC_A[Boolean]], T_A[T_A[T_A[Int, Boolean], CC_A[Boolean]], T_A[T_A[Int, Boolean], CC_A[Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_), _) => 1 
  case CC_A(_, CC_C(), _) => 2 
  case CC_B(CC_C()) => 3 
  case CC_C() => 4 
}
}
// This is not matched: CC_B(CC_A(_, _, _))