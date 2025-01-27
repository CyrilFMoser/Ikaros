package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[(Char,Boolean)]]]
case class CC_B(a: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[(Char,Boolean)]]]
case class CC_C(a: Char, b: CC_B) extends T_A[T_A[T_A[(Char,Boolean)]]]

val v_a: T_A[T_A[T_A[(Char,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C('x', CC_B(_)) => 2 
  case CC_C(_, CC_B(_)) => 3 
}
}