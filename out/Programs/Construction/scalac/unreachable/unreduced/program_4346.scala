package Program_23 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_A[Boolean]], c: T_A[T_A[Boolean]]) extends T_A[T_A[(Char,Boolean)]]
case class CC_B(a: T_A[CC_A], b: CC_A) extends T_A[T_A[(Char,Boolean)]]
case class CC_C(a: CC_B) extends T_A[T_A[(Char,Boolean)]]

val v_a: T_A[T_A[(Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}