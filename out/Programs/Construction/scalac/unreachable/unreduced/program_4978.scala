package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: Int, c: T_A[T_A[Char]]) extends T_A[T_A[T_A[(Boolean,Boolean)]]]
case class CC_B(a: Int) extends T_A[T_A[T_A[(Boolean,Boolean)]]]

val v_a: T_A[T_A[T_A[(Boolean,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}