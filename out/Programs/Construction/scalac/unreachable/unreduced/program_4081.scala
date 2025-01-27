package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Boolean], b: T_A[T_A[Byte]], c: T_A[T_B[Char]]) extends T_A[T_B[T_A[(Boolean,Boolean)]]]
case class CC_B(a: T_B[CC_A], b: Int, c: T_B[T_A[Char]]) extends T_A[T_B[T_A[(Boolean,Boolean)]]]
case class CC_C() extends T_A[T_B[T_A[(Boolean,Boolean)]]]
case class CC_D[C]() extends T_B[C]

val v_a: T_A[T_B[T_A[(Boolean,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(), _, _) => 0 
  case CC_B(CC_D(), _, _) => 1 
  case CC_C() => 2 
}
}