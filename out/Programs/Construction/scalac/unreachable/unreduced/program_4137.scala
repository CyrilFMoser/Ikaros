package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte, b: T_B[T_A[Int]], c: T_A[T_B[Byte]]) extends T_A[T_B[T_B[(Boolean,Boolean)]]]
case class CC_B() extends T_A[T_B[T_B[(Boolean,Boolean)]]]
case class CC_C() extends T_A[T_B[T_B[(Boolean,Boolean)]]]

val v_a: T_A[T_B[T_B[(Boolean,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}