package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, Byte]
case class CC_B() extends T_A[T_A[CC_A[Byte], T_A[Boolean, Byte]], Byte]
case class CC_C(a: T_A[T_A[CC_B, Byte], CC_A[Char]], b: (CC_B,CC_B)) extends T_A[T_A[CC_A[Byte], T_A[Boolean, Byte]], Byte]

val v_a: T_A[T_A[CC_A[Byte], T_A[Boolean, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}