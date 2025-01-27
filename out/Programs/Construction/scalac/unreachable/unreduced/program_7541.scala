package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Char], T_A[Boolean, Byte]], b: T_A[T_A[Byte, Byte], T_A[(Int,Int), Byte]], c: T_A[(Int,Char), T_A[Byte, Boolean]]) extends T_A[(Byte,T_A[Boolean, Int]), (T_A[Byte, Boolean],T_A[Byte, Boolean])]
case class CC_B(a: CC_A) extends T_A[(Byte,T_A[Boolean, Int]), (T_A[Byte, Boolean],T_A[Byte, Boolean])]
case class CC_C(a: T_A[CC_B, Boolean]) extends T_A[(Byte,T_A[Boolean, Int]), (T_A[Byte, Boolean],T_A[Byte, Boolean])]

val v_a: T_A[(Byte,T_A[Boolean, Int]), (T_A[Byte, Boolean],T_A[Byte, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}