package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C) extends T_A[C, T_A[T_A[C, Int], C]]
case class CC_B() extends T_A[T_A[CC_A[Int], T_A[Boolean, Byte]], T_A[T_A[T_A[CC_A[Int], T_A[Boolean, Byte]], Int], T_A[CC_A[Int], T_A[Boolean, Byte]]]]

val v_a: T_A[T_A[CC_A[Int], T_A[Boolean, Byte]], T_A[T_A[T_A[CC_A[Int], T_A[Boolean, Byte]], Int], T_A[CC_A[Int], T_A[Boolean, Byte]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}