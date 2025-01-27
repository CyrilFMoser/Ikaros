package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Boolean,Char)], b: T_A[Boolean], c: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_B(a: T_A[Boolean]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(CC_A(_, _, _)), _) => 1 
  case CC_A(_, CC_B(CC_B(_)), _) => 2 
  case CC_B(_) => 3 
}
}