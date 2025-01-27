package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[(Boolean,Boolean)]]]
case class CC_B(a: (CC_A,T_A[Byte]), b: Int, c: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[(Boolean,Boolean)]]]

val v_a: T_A[T_A[T_A[(Boolean,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),_), 12, _) => 1 
  case CC_B((CC_A(),_), _, _) => 2 
}
}