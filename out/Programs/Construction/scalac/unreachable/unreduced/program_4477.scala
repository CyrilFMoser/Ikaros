package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[(Byte,Boolean)]]]
case class CC_B(a: (CC_A,Byte), b: CC_A, c: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[(Byte,Boolean)]]]

val v_a: T_A[T_A[T_A[(Byte,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),_), CC_A(), _) => 1 
}
}