package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: Int) extends T_A[T_A[T_A[(Char,Boolean)]]]
case class CC_B() extends T_A[T_A[T_A[(Char,Boolean)]]]
case class CC_C(a: Byte, b: T_A[T_B], c: CC_B) extends T_A[T_A[T_A[(Char,Boolean)]]]

val v_a: T_A[T_A[T_A[(Char,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(0, _, CC_B()) => 2 
  case CC_C(_, _, CC_B()) => 3 
}
}