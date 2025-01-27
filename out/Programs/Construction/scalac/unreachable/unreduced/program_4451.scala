package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[(Boolean,Char), T_A[Int, Byte]], T_A[T_A[Byte, Byte], T_A[Byte, (Boolean,Boolean)]]]
case class CC_B(a: CC_A, b: CC_A, c: T_A[T_A[CC_A, CC_A], CC_A]) extends T_A[T_A[(Boolean,Char), T_A[Int, Byte]], T_A[T_A[Byte, Byte], T_A[Byte, (Boolean,Boolean)]]]

val v_a: T_A[T_A[(Boolean,Char), T_A[Int, Byte]], T_A[T_A[Byte, Byte], T_A[Byte, (Boolean,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
}
}