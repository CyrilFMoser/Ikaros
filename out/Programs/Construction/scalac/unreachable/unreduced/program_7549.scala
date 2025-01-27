package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Boolean,Byte)]]) extends T_A[T_A[Int]]
case class CC_B(a: Boolean, b: T_A[T_A[Int]], c: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_C(a: CC_A, b: CC_A, c: CC_A) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_B(_, _, CC_A(_)), _) => 1 
  case CC_B(_, CC_B(_, _, CC_B(_, _, _)), _) => 2 
  case CC_B(_, CC_B(_, _, CC_C(_, _, _)), _) => 3 
  case CC_B(_, CC_C(CC_A(_), CC_A(_), _), _) => 4 
  case CC_C(CC_A(_), _, _) => 5 
}
}
// This is not matched: CC_B(_, CC_A(_), _)