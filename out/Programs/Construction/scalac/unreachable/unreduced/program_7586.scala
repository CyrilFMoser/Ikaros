package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[(Byte,T_B)], b: Boolean, c: T_B) extends T_A[(Boolean,T_A[T_B])]
case class CC_B() extends T_A[(Boolean,T_A[T_B])]
case class CC_C(a: T_B, b: T_B, c: Char) extends T_A[(Boolean,T_A[T_B])]

val v_a: T_A[(Boolean,T_A[T_B])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}